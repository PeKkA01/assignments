public class VolatileVariable {
    private static volatile boolean running = true;

    public static void main(String[] args) {
        new Thread(() -> {
            System.out.println("Worker thread started.");
            while (running) {
            }
            System.out.println("Worker thread stopped.");
        }).start();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Main thread is setting 'running' to false.");
        running = false;
    }
}