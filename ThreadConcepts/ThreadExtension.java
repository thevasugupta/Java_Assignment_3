package ThreadConcepts;

class NumberThread extends Thread {
    public void run(){
        for (int i = 1; i<=10; i++){
            System.out.println(i);
            try{
                Thread.sleep(1000);
            }
            catch (InterruptedException e){
                System.out.println("Thread Interrupted :"+e.getMessage());
            }
        }
    }
}

public class ThreadExtension {
    public static void main(String[] args) {
        NumberThread thread = new NumberThread();
        thread.start();
    }
}
