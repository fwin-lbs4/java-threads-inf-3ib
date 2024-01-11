package quest.flo;

public class MyTime implements Runnable {
    public void run() {
        while (true) {
            System.out.println(new java.util.Date());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                break;
            }
        }
    }
}
