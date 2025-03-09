package thread_sync;

class NumberPrinter extends Thread {
    private boolean running = true;

    public synchronized void stopThread() {
        running = false;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 100; i++) {
            synchronized (this) {
                if (!running) {
                    System.out.println("Thread stopped!");
                    break;
                }
            }
            System.out.println(i);
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class ThreadStopExample {
    public static void main(String[] args) {
        NumberPrinter thread = new NumberPrinter();
        thread.start();

        try {
            Thread.sleep(3000);
            thread.stopThread();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
