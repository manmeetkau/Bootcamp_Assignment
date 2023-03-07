
    interface interf1{
        default void display()
        {
            System.out.println("default method get accessed");
        }
        public static void show()
        {
            System.out.println("static method get accessed");
        }
    }
    public class inter1 implements interf1
    {
        public static void main(String[] args)
        {
            inter1 In=new inter1();
            In.display();
            interf1.show();
        }
    }


