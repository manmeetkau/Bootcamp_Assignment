public class deadlock {
    private static class ThreadDemo1 implements Runnable{
        public void run() {
             {
                System.out.println("Thread 1: Holding lock 1...");

                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                }
                System.out.println("Thread 1: Waiting for lock 2...");

            }
        }
    }

    private static class ThreadDemo2 extends Thread {
        public void run() {
           {
                System.out.println("Thread 2: Holding lock 2...");

                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                }
                System.out.println("Thread 2: Waiting for lock 1...");


            }
        }
    }
    public static void main(String args[]) throws InterruptedException {
        ThreadDemo1 T1 = new ThreadDemo1();
        Thread th1=new Thread(T1);
        ThreadDemo2 T2 = new ThreadDemo2();
        Thread th2=new Thread(T2);
        th1.start();
        th1.join();
        th2.start();
    }
}


