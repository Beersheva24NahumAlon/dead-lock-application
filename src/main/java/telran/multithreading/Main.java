package telran.multithreading;

public class Main {
    static final Object m1 = new Object();
    static final Object m2 = new Object();
    static int src1 = 0;
    static int src2 = 0;

    public static void main(String[] args) throws InterruptedException {
        ThreadRuner t1 = new ThreadRuner();
        ThreadRuner t2 = new ThreadRuner();
        t1.start();
        t2.start();
    }
}