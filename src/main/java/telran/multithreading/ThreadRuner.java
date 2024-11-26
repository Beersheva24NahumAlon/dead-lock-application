package telran.multithreading;

public class ThreadRuner extends Thread {

    private void step(String name1, String name2, Object mutex1, Object mutex2) {
        synchronized (mutex1) {
            System.out.println("Locking %s by %s".formatted(name1, getName()));
            synchronized (mutex2) {
                System.out.println("Locking %s by %s".formatted(name2, getName()));
                System.out.println("Unlocking %s by %s".formatted(name2, getName()));
            }
            System.out.println("Unlocking %s by %s".formatted(name1, getName()));
        }
    }

    @Override
    public void run() {
        step("source 1", "source 2", Main.m1, Main.m2);
        step("source 2", "source 1", Main.m2, Main.m1);
    }
}
