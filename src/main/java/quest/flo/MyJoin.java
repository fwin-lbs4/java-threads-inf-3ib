package quest.flo;

import java.text.SimpleDateFormat;
import java.util.Date;

public class MyJoin extends Thread {
    SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss:mm");
    Date date;
    private long myMillis;

    public MyJoin(long millis) {
        this.myMillis = millis;
    }

    @Override
    public void run() {
        date = new Date();
        System.out.println(getName() + ": Es geht los! " + formatter.format(date));
        try {
            Thread.sleep(myMillis);
        } catch (InterruptedException ignored) {

        }
        date = new Date();
        System.out.println(getName() + ": Thread beendet! " + formatter.format(date));
    }
}