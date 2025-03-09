package thread_sync;

class Resource {
    void method(Resource otherResource) {
        synchronized (this) {
            System.out.println(Thread.currentThread().getName() + " locked " + this);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) { }
            synchronized (otherResource) {
                System.out.println(Thread.currentThread().getName() + " locked " + otherResource);
            }
        }
    }
}

public class ThreadDeadlockExample {
    public static void main(String[] args) {
        Resource r1 = new Resource();
        Resource r2 = new Resource();

        Thread t1 = new Thread(() -> r1.method(r2), "Thread 1");
        Thread t2 = new Thread(() -> r2.method(r1), "Thread 2");
        t1.start();
        t2.start();
    }
}
