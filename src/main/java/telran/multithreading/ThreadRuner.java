package telran.multithreading;

public class ThreadRuner extends Thread {
    private void step1() {
        synchronized (Main.m1) {
            System.out.println("Inreasing source 1 by %s".formatted(getName()));
            Main.src1++;
            synchronized (Main.m2) {
                System.out.println("Inreasing source 2 by %s".formatted(getName()));
                Main.src2++;
                System.out.println("Both sources are increased, values of sources - %d and %d"
                        .formatted(Main.src1, Main.src2));
            }
        }
    }

    private void step2() {
        synchronized (Main.m2) {
            System.out.println("Inreasing source 2 by %s".formatted(getName()));
            Main.src2++;
            synchronized (Main.m1) {
                System.out.println("Inreasing source 1 by %s".formatted(getName()));
                Main.src1++;
                System.out.println("Both sources are increased, values of sources - %d and %d"
                        .formatted(Main.src1, Main.src2));
            }
        }
    }

    @Override
    public void run() {
        step1();
        step2();
    }
}
