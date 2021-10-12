public class AccountOverdrawSafeDemo implements Runnable {
    static Account acct = new Account();
    public static void main(String[] args) {
        AccountOverdrawSafeDemo r1 = new AccountOverdrawSafeDemo();
        Thread one = new Thread(r1);
        Thread two = new Thread(r1);
        one.setName("Sandeep");
        two.setName("Ritik");
        one.start();
        two.start();
    }
    @Override
    public void run() {
        for (int x = 0; x < 3; x++) {
            if (acct.getBalance() < 0) {
                System.out.println("account is overdrawn!");
                break;
            }
            Withdrawal(200);
        }
    }
    synchronized static void Withdrawal(int amt) {
        if (acct.getBalance() >= amt) {
            System.out.println(Thread.currentThread().getName() + " is going to withdraw");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException ex) {
            }
            acct.withdraw(amt);
            System.out.println(Thread.currentThread().getName() + " completes the withdrawal");
        } else {
            System.out.println("Not enough in account for " + Thread.currentThread().getName() + " to withdraw " + acct.getBalance());
        }
    }
}
