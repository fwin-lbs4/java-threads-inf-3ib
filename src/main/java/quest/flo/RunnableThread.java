package quest.flo;

import java.text.SimpleDateFormat;
import java.util.Date;

public class RunnableThread implements Runnable {
    /**
     * Datumsformat erzeugen
     */
    SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss:mm");
    private int count;

    public void run() {
        long start = System.currentTimeMillis();
        String name = "";
        for (int i = 0; i < 3; i++) {
            Date date = new Date();
            try {
                Thread.sleep(1000); // 1 Sek. warten
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            name = Thread.currentThread().getName() + " " + formatter.format(date); // Name und Zeitstempel des Threads
            System.out.println(name + " und Durchlauf: " + ++count);
        }
        long finish = System.currentTimeMillis();
        long timeElapsed = finish - start;
        System.out.println("Thread " + name + ": Ich bin fertig! in " + timeElapsed + " Millisekunden");
    }
}
