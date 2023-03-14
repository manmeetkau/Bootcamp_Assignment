public class BalanceAccountDemo {
    public static void main(String[] args) throws InterruptedException {
        BankAccount bankacc=new BankAccount(100);

        Runnable depositTask=()->{
            for(int i=0;i<5;i++){
                bankacc.Deposit(10);
                System.out.println(Thread.currentThread().getName()+"="+bankacc.getBalance());
            }
        };

        Runnable withdrawTask=()->{
            for(int i=0;i<5;i++){
                bankacc.withdraw(5);
                System.out.println(Thread.currentThread().getName()+"="+ bankacc.getBalance());
            }
        };

        Thread t1=new Thread(depositTask);
        Thread t2=new Thread(depositTask);

        Thread t3=new Thread(withdrawTask);
        Thread t4=new Thread(withdrawTask);
        System.out.println("------------Depositing--------------");
        t1.start();
        t1.join();
        System.out.println("------------Withdrawing--------------");
        t3.start();
        t3.join();
        System.out.println("-------------Depositing--------------");
        t2.start();
        t2.join();
        System.out.println("--------------Withdrawing--------------");
        t4.start();

        //   t4.start();
    }
}
