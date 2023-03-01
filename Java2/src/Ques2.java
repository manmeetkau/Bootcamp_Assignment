import java.util.Scanner;
public class Ques2 {
        public static void main(String args[]) {
            int myArray[]=new int[3];
            myArray[0]=1;
            myArray[1]=2;
            myArray[2]=3;
            //try blocka
            try{

                myArray[3]=10/0;
                System.out.println("Array element 10 : " + myArray[5]);

            }
            //catch block
            catch(ArithmeticException e){
                System.out.println("ArithmeticException::Number divided by zero");
            }
            catch(ArrayIndexOutOfBoundsException e)
            {
                System.out.println("ArrayIndexOutOfBounds :: Accessed index out of bounds");
            }
            catch(Exception e)
            {
                System.out.println("Exception :: " + e.getMessage ());
            }

            //finally block
            finally{
            System.out.println("Rest of the code continues...");}
            System.out.println("Array_elements="+myArray[0]+myArray[1]);
        }
    }




