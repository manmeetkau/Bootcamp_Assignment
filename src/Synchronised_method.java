public class Synchronised_method {

    public synchronized void printTable(int n) {
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


class thread1 extends Thread{
    Synchronised_method b1;
    thread1(Synchronised_method b1){
        this.b1=b1;
    }
    public void run(){
        System.out.println("thread1");
        b1.printTable(2);
    }

}
class thread2 extends Thread {
    Synchronised_method t;

    thread2(Synchronised_method t) {
        this.t = t;
    }

    public void run() {
        System.out.println("thread2");
        t.printTable(8);
    }
}

class testsynchronised {
    public static void main(String args[]) throws InterruptedException {
        Synchronised_method obj = new Synchronised_method();
        thread1 t1 = new thread1(obj);
        thread2 t2 = new thread2(obj);
        t1.start();
        t1.join();
        t2.start();


    }
 }


