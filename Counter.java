class Counter {
    private int count = 0;

    // Synchronized method to ensure thread-safe increment operation
    public synchronized void increment() {
        count++;
    }

    public int getCount() {
        return count;
    }
}
