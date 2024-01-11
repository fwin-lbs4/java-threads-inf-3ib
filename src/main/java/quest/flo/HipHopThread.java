package quest.flo;

import java.text.SimpleDateFormat;
import java.util.Date;

public class HipHopThread extends Thread {
    SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss:mm");

    public HipHopThread() {
    }

    @Override
    public void run() {
        while (true) {
            System.out.println(getName() + ": " + formatter.format(new Date()));

            try {
                Thread.sleep(250);
            } catch (InterruptedException e) {
                break;
            }
        }
    }
}
