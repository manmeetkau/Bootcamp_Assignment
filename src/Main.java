public class Main {
    public static void main(String[] args) throws InterruptedException {
        Runnable_test rt=new Runnable_test(5);
        Thread t1=new Thread(rt);
        Runnable_test rt2=new Runnable_test(7);
        Thread t2=new Thread(rt2);
        t1.start();
        t1.join();
        t2.start();
    }
}