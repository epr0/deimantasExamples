package lt.sdacademy.advancedfeatures.concurrency.example4;

public class ConcurrencyExample4 {

    public static void main(String[] args) {
        Thread stopWatchThread1 = new Thread(new StopWatchThread(), "stopWatchThread1");
        Thread stopWatchThread2 = new Thread(new StopWatchThread());

        stopWatchThread1.start();
        stopWatchThread2.start();
    }
}
