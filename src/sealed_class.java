
    sealed interface Animal permits mammals,birds{
    public int numberoffeet();

      //  int nuberoffeet();
    }
    record mammals() implements Animal{
        @Override
        public int numberoffeet(){
            return 4;
        }

    }

    record birds() implements Animal{
        @Override
        public int numberoffeet() {
            return 2;
        }
    }

    public class sealed_class {
    public static void main(String[] args)
    {
        mammals mammal=new mammals();
        System.out.println("Numbber_of_feets_mammal="+mammal.numberoffeet());
        birds bird=new birds();
        System.out.println("Number_of_feets_birds="+bird.numberoffeet());

    }
}
