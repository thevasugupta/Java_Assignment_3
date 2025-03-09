package thread.concepts;

class DaemonThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i<10;i++){
            System.out.println("Daemon Thread");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
public class DaemonThreadExample {
    public static void main(String[] args) {
        DaemonThread daemon = new DaemonThread();
        daemon.setDaemon(true);
        daemon.start();

        for (int i = 0; i <5; i++){
            System.out.println("Main Thread");

            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Main Thread Task Completion");
    }
}
