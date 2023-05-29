class MyRunnable implements Runnable {
    private String threadName;

    public MyRunnable(String name) {
        threadName = name;
    }
    @Override
    public void run() {
        System.out.println("Thread " + threadName + " is running.");
        try {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Thread " + threadName + ": " + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("Thread " + threadName + " interrupted.");
        }
        System.out.println("Thread " + threadName + " is exiting.");
    }
}
public class ThreadExample {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new MyRunnable("Thread 1"));
        Thread thread2 = new Thread(new MyRunnable("Thread 2"));
        thread1.start();
        thread2.start();
    }
}
