package rabbit;

import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {
        // producing some messages
        for (int i = 1; i < 6; i++) {
            final String message = "This is message numero " + i;
            SampleProducer producer = new SampleProducer(message);
            new Thread(producer).start();
            System.out.println("Produced message " + i);
        }

        Thread consumerThread = new Thread(new SampleConsumer());
        consumerThread.start();
        System.out.println("Created consumer");
        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            System.out.println("Sleep interrupted");
            e.printStackTrace();
        }
        System.out.println("Done?");
    }
}