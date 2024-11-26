package telran.multithreading;

public class Main {
    static final Object m1 = new Object();
    static final Object m2 = new Object();

    public static void main(String[] args) {
        ThreadRuner t1 = new ThreadRuner("source 1", m1, "source 2", m2);
        ThreadRuner t2 = new ThreadRuner("source 2", m2, "source 1", m1);
        t1.start();
        t2.start();
    }
}