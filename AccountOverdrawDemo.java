class AccountOverdrawDemo implements Runnable {
    Account acct = new Account();
    public static void main(String[] args) {
        AccountOverdrawDemo r = new AccountOverdrawDemo();
        Thread one = new Thread(r);
        Thread two = new Thread(r);
        one.setName("Sandeep");
        two.setName("Ritik");
        one.start();
        two.start();
    }
    @Override
    public void run() {
        for (int x = 0; x < 5; x++) {
            Withdrawal(200);
            if (acct.getBalance() < 0) {
                System.out.println("account is overdrawn!");
            }
        }
    }
    void Withdrawal(int amt) {
        if (acct.getBalance() >= amt) {
            System.out.println(Thread.currentThread().getName() + " is going to withdraw");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException ex) {
            }
            acct.withdraw(amt);
            System.out.println(Thread.currentThread().getName() + " completes the withdrawal");
        } else {
            System.out.println("Not enough in account for " + Thread.currentThread().getName() + " to withdraw " + acct.getBalance());
        }
    }
}
