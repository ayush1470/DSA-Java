import java.util.concurrent.Semaphore;

class BoundedBuffer{
    private static final int BUFFER_SIZE = 5;
    private final int[] buffer = new int[BUFFER_SIZE];
    private int count = 0, in = 0, out = 0;

    private final Semaphore mutex = new Semaphore(1);
    private final Semaphore empty = new Semaphore(BUFFER_SIZE);
    private final Semaphore full = new Semaphore(0);

    class Producer extends Thread {
        public void run() {
            try {
                for (int i = 1; i <= 10; i++) {
                    empty.acquire(); // Wait if buffer is full
                    mutex.acquire(); // Ensure mutual exclusion

                    buffer[in] = i;
                    System.out.println("Produced: " + i);
                    in = (in + 1) % BUFFER_SIZE;
                    count++;

                    mutex.release();
                    full.release(); // Signal that buffer is not empty
                    Thread.sleep(500);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    class Consumer extends Thread {
        public void run() {
            try {
                for (int i = 1; i <= 10; i++) {
                    full.acquire(); // Wait if buffer is empty
                    mutex.acquire(); // Ensure mutual exclusion

                    int item = buffer[out];
                    System.out.println("Consumed: " + item);
                    out = (out + 1) % BUFFER_SIZE;
                    count--;

                    mutex.release();
                    empty.release(); // Signal that buffer has space
                    Thread.sleep(1000);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        BoundedBuffer buffer = new BoundedBuffer();
        buffer.new Producer().start();
        buffer.new Consumer().start();
    }
}