package quest.flo;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
//             exampleOne();
//             exampleTwo();
//             exampleThree();
//            exampleFour();
//            exampleFive();
            exampleSix();
        } catch (Exception ignored) {}
    }

    public static void exampleOne() {
        /**
         * 2 Threadobjekte erzeugen
         */
        MyThread first = new MyThread();
        MyThread second = new MyThread();
        /**
         * Namen für die Threads vergeben
         */
        first.setName("first");
        second.setName("second");
        /**
         * Threads starten
         */
        first.start();
        second.start();

        System.out.println("2 Threads gestartet.");
    }

    public static void exampleTwo() {
        /**
         * 2 Threadobjekte erzeugen
         */
        Thread first = new Thread(new RunnableThread());
        Thread second = new Thread(new RunnableThread());
        /**
         * Namen für die Threads vergeben
         */
        first.setName("first");
        second.setName("second");
        /**
         * Threads starten
         */
        first.start();
        second.start();

        System.out.println("2 Threads gestartet.");
    }

    public static void exampleThree() throws IOException {
        Thread myTime = new Thread(new MyTime());
        myTime.start();
        System.in.read();
        myTime.interrupt();
    }
    public static void exampleFour() {
        MyJoin first = new MyJoin(1000);
        MyJoin second = new MyJoin(4000);
        first.setName("first");
        second.setName("second");
        first.start();
        second.start();
        try {
            first.join();
            second.join();
        } catch (InterruptedException ignored) {

        }
        System.out.println("Endlich beide fertig!");
    }
    public static void exampleFive() throws IOException {
        HipHopThread Hip = new HipHopThread();
        HipHopThread Hop = new HipHopThread();
        Hip.setName("LBS");
        Hop.setName("4");
        Hip.start();
        Hop.start();

        System.in.read();
        Hip.interrupt();
        Hop.interrupt();
    }
    public static void exampleSix() throws IOException {
        Thread Hip = new Thread(new HipHopRunnable("LBS"));
        Thread Hop = new Thread(new HipHopRunnable("4"));
        Hip.start();
        Hop.start();

        System.in.read();
        Hip.interrupt();
        Hop.interrupt();
    }
}