package thread_sync;

class BankAccount {
    private int balance = 1000;

    public synchronized void deposit(int amount) {
        balance += amount;
        System.out.println(Thread.currentThread().getName() + " deposited: " + amount + ", Balance: " + balance);
    }
}
class AccountThread extends Thread {
    private BankAccount account;

    public AccountThread(BankAccount account, String name) {
        super(name);
        this.account = account;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            account.deposit(100);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class SyncMethod {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        Thread t1 = new AccountThread(account, "Thread 1");
        Thread t2 = new AccountThread(account, "Thread 2");

        t1.start();
        t2.start();
    }
}
