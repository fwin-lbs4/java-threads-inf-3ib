package quest.flo;

import java.text.SimpleDateFormat;
import java.util.Date;
public class HipHopRunnable implements Runnable {
    SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss:mm");
    private String name = "";

    public HipHopRunnable(String name) {
        this.name = name;
    }
    public void run() {
        while (true) {
            System.out.println(this.name + ": " + formatter.format(new Date()));

            try {
                Thread.sleep(250);
            } catch (InterruptedException e) {
                break;
            }
        }
    }
}
