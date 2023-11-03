public class MultithreadingExample {
    public static void main(String[] args) {
        // Creating and starting threads
        Thread thread1 = new MyThread("Thread 1");
        Thread thread2 = new Thread(new MyRunnable(), "Thread 2");

        thread1.start();
        thread2.start();

        // Synchronization and coordination
        synchronized (thread2) {
            try {
                // Main thread waits for Thread 2 to finish
                thread2.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Main thread exiting.");
    }

    static class MyThread extends Thread {
        public MyThread(String name) {
            super(name);
        }

        @Override
        public void run() {
            System.out.println(getName() + " started.");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(getName() + " finished.");
        }
    }

    static class MyRunnable implements Runnable {
        @Override
        public void run() {
            synchronized (Thread.currentThread()) {
                System.out.println(Thread.currentThread().getName() + " started.");
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName() + " finished.");
                Thread.currentThread().notify();
            }
        }
    }
}
