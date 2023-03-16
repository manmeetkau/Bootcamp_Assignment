public class BankAccount {
        private volatile int Balance;

        public BankAccount(int Balance){
            this.Balance=Balance;
        }

        public synchronized void Deposit(int Amount)
        {
            Balance+=Amount;
        }

        public synchronized void withdraw(int Amount){
            if(Balance<Amount){
                throw new IllegalArgumentException("Insufficient Balance");
            }
            Balance-=Amount;
        }

        public int getBalance(){
            return this.Balance;
        }
    }

