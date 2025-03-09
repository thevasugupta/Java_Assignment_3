package thread.concepts;

class ThreadOne extends Thread{
    @Override
    public void run() {
        //Trying for 20 iterations
        for (int i = 0; i < 20; i++){
            System.out.println("Thread 1");
            try{
                Thread.sleep(1000);
            }
            catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}

class ThreadTwo extends Thread{
    @Override
    public void run() {
        //Trying for 20 iterations
        for (int i = 0; i < 20; i++){
            System.out.println("Thread 2");
            try{
                Thread.sleep(2000);
            }
            catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
public class SleepyThread {
    public static void main(String[] args) {
        ThreadOne t1 = new ThreadOne();
        ThreadTwo t2 = new ThreadTwo();
        t1.start();
        t2.start();
    }
}
