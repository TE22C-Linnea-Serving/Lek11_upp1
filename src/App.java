import java.util.Random;

public class App {
    public static void main(String[] args) throws Exception {
        // Skapa slumptalsgenerator
        Random tärning = new Random();
        // Skapa ett slumptal mellan 0-9
        int slumptal = tärning.nextInt(10);
        System.out.println("slumptal: " + slumptal);
        // Pausa programmet
        Thread.sleep(100);
        // Skapa ett slumptal mellan 0-9
        slumptal = tärning.nextInt(10);
        System.out.println("slumptal: " + slumptal);
    }
}
