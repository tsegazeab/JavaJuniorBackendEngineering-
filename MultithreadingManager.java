public class MultithreadingManager {
    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();

        // Creating multiple threads to increment the counter
        CounterThread thread1 = new CounterThread(counter);
        CounterThread thread2 = new CounterThread(counter);

        // Start the threads
        thread1.start();
        thread2.start();

        // Wait for both threads to finish
        thread1.join();
        thread2.join();

        // Print the final count
        System.out.println("Final Count: " + counter.getCount());
    }
}