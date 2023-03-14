public class Synchronised_block {

        public  void printTable(int n) {
            synchronized (this) {//method not synchronized
                for (int i = 1; i <= 5; i++) {
                    System.out.println(n * i);
                    try {
                        Thread.sleep(400);
                    } catch (Exception e) {
                        System.out.println(e);
                    }
                }
            }

        }
    }

    class MyThread1 extends Thread{
        Synchronised_block t;
        MyThread1(Synchronised_block t){
            this.t=t;
        }
        public void run(){
            System.out.println("thread1");
            t.printTable(5);
        }

    }
    class MyThread2 extends Thread {
        Synchronised_block t;

        MyThread2(Synchronised_block t) {
            this.t = t;
        }

        public void run() {
            System.out.println("thread2");
            t.printTable(100);
        }
    }

    class TestSynchronization1 {
        public static void main(String args[]) throws InterruptedException {
            Synchronised_block obj = new Synchronised_block();//only one object
            MyThread1 t1 = new MyThread1(obj);
            MyThread2 t2 = new MyThread2(obj);
            t1.start();
            t1.join();
            t2.start();


        }
    }


