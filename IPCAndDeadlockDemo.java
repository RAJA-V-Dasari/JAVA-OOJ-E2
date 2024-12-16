class Processor1 extends Thread {
    private final Object lock1;
    private final Object lock2;

    public Processor1(Object lock1, Object lock2) {
        this.lock1 = lock1;
        this.lock2 = lock2;
    }

    public void run() {
        synchronized (lock1) { // Lock1 is acquired by Processor1
            System.out.println("Processor1: Holding lock1...");
            try {
                Thread.sleep(100); // Simulate some processing
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println("Processor1: Waiting for lock2...");
            synchronized (lock2) { // Processor1 tries to acquire lock2
                // This will never happen if Processor2 holds lock2 and waits for lock1 (deadlock)
                System.out.println("Processor1: Acquired lock2!");
            }
        }
    }
}

class Processor2 extends Thread {
    private final Object lock1;
    private final Object lock2;

    public Processor2(Object lock1, Object lock2) {
        this.lock1 = lock1;
        this.lock2 = lock2;
    }

    public void run() {
        synchronized (lock2) { // Lock2 is acquired by Processor2
            System.out.println("Processor2: Holding lock2...");
            try {
                Thread.sleep(100); // Simulate some processing
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println("Processor2: Waiting for lock1...");
            synchronized (lock1) { // Processor2 tries to acquire lock1
                // This will never happen if Processor1 holds lock1 and waits for lock2 (deadlock)
                System.out.println("Processor2: Acquired lock1!");
            }
        }
    }
}

public class IPCAndDeadlockDemo {
    public static void main(String[] args) {
        // Shared resources (locks)
        Object lock1 = new Object();
        Object lock2 = new Object();

        // Create two threads (Processor1 and Processor2)
        Processor1 thread1 = new Processor1(lock1, lock2);
        Processor2 thread2 = new Processor2(lock1, lock2);

        // Start the threads
        thread1.start();
        thread2.start();

        // Simulate IPC with a third thread
        Thread ipcThread = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (lock1) { // IPC Thread holds lock1
                    try {
                        System.out.println("IPC Thread: Holding lock1...");
                        Thread.sleep(200); // Simulate processing
                        System.out.println("IPC Thread: Notifying Processor1");
                        lock1.notify(); // Notify Processor1 (IPC happens here)
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });

        ipcThread.start();
    }
}

