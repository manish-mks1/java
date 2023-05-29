public class ThreadPriorityExample {
    public static void main(String[] args) {
        Thread thread1 = new MyThread("Thread 1");
        Thread thread2 = new MyThread("Thread 2");
        Thread thread3 = new MyThread("Thread 3");
        Thread thread4 = new MyThread("Thread 4");
        Thread thread5 = new MyThread("Thread 5");

        // Set thread priorities
        thread1.setPriority(Thread.MIN_PRIORITY);
        thread2.setPriority(Thread.MIN_PRIORITY);
        thread3.setPriority(Thread.NORM_PRIORITY);
        thread4.setPriority(Thread.NORM_PRIORITY);
        thread5.setPriority(Thread.MAX_PRIORITY);

        // Start all threads
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        thread5.start();

        // Put two highest priority threads to sleep
        try {
            Thread.sleep(2000);
            thread4.sleep(3000);
            thread5.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Check thread aliveness and mark long-lasting thread
        if (thread1.isAlive()) {
            System.out.println("Thread 1 is alive.");
        }
        if (thread2.isAlive()) {
            System.out.println("Thread 2 is alive.");
        }
        if (thread3.isAlive()) {
            System.out.println("Thread 3 is alive.");
        }
        if (thread4.isAlive()) {
            System.out.println("Thread 4 is alive. (Long-lasting thread)");
        }
        if (thread5.isAlive()) {
            System.out.println("Thread 5 is alive. (Long-lasting thread)");
        }
    }
}

class MyThread extends Thread {
    public MyThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.println("Thread " + getName() + " is running.");
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Thread " + getName() + " is exiting.");
    }
}
