class Account {
    static int balance = 1000;
//   int balance = 1000;
    int getBalance() {
        return balance;
    }
//   void withdraw(int amount) {
     synchronized static void withdraw(int amount) {
        balance = balance - amount;
    }
}