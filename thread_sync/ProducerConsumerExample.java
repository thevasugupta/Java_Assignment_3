package thread_sync;

import java.util.LinkedList;
import java.util.Queue;

class SharedQueue {
    private Queue<Integer> queue = new LinkedList<>();
    private final int CAPACITY = 5;

    public synchronized void produce(int value) throws InterruptedException {
        while (queue.size() == CAPACITY) wait(); // Wait if queue is full
        queue.add(value);
        System.out.println("Produced: " + value);
        notify(); // Notify consumer
    }

    public synchronized void consume() throws InterruptedException {
        while (queue.isEmpty()) wait(); // Wait if queue is empty
        int value = queue.poll();
        System.out.println("Consumed: " + value);
        notify(); // Notify producer
    }
}

public class ProducerConsumerExample {
    public static void main(String[] args) {
        SharedQueue sharedQueue = new SharedQueue();

        Thread producer = new Thread(() -> {
            for (int i = 1; i <= 10; i++) {
                try { sharedQueue.produce(i); Thread.sleep(500); } catch (InterruptedException e) {}
            }
        });

        Thread consumer = new Thread(() -> {
            for (int i = 1; i <= 10; i++) {
                try { sharedQueue.consume(); Thread.sleep(1000); } catch (InterruptedException e) {}
            }
        });

        producer.start();
        consumer.start();
    }
}
