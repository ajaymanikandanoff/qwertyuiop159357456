class OddNumberThread extends Thread {
    public void run() {
        for (int i = 1; i <= 20; i += 2) {
            System.out.println("Odd Thread: " + i);
            try {
                Thread.sleep(1000);
            }
            catch (InterruptedException e) {
                System.out.println("Odd Thread interrupted.");
            }
        }
    }
}
class EvenNumberThread extends Thread {
    public void run() {
        for (int i = 2; i <= 20; i += 2) {
            System.out.println("Even Thread: " + i);
            try {
                Thread.sleep(1000);
            }
            catch (InterruptedException e) {
                System.out.println("Even Thread interrupted.");
            }
        }
    }
}

public class NumberThreads {
    public static void main(String[] args) {
        OddNumberThread odd = new OddNumberThread();
        EvenNumberThread even = new EvenNumberThread();
        // Start both threads
        odd.start();
        even.start();
    }
}
