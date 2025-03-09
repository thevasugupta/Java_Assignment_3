package thread_sync;

class BankAccount2 {
    private int balance = 1000;

    public void deposit(int amount){
        synchronized (this) {
            balance += amount;
            System.out.println(Thread.currentThread().getName() + " deposited: " + amount +  ", Balance: " + balance);
        }
    }
}

public class SyncBlock {
    public static void main(String[] args) {
        BankAccount2 account = new BankAccount2();
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 5; i++) account.deposit(100); }, "Thread 1");

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 5; i++) account.deposit(100); }, "Thread 2");

        t1.start();
        t2.start();
    }
}
