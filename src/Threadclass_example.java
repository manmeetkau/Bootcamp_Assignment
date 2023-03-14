public class Threadclass_example extends Thread{

        int num;
        public Threadclass_example(int num) {
            this.num = num;
        }

        @Override
        public void run() {
            System.out.println(Thread.currentThread().getName()+" number="+num);
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    public static void main(String[] args) throws InterruptedException {
        Threadclass_example tc=new Threadclass_example(10);
        Threadclass_example tc2=new Threadclass_example(20);
        tc.start();
        tc.join();
        tc2.start();
        }
}

