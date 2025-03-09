package thread.concepts;

class HelloWorldRunnable implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 5; i++){
            System.out.println("Hello, World!");
        }
    }
}
public class RunnableThread {
    public static void main(String[] args) {
        Thread thread = new Thread(new HelloWorldRunnable());
        thread.start();
    }
}
