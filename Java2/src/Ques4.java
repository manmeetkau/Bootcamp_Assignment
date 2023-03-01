// A Class that uses above MyException
        public class Ques4 {
            // Driver Program
            public static void main(String args[])
            {
                try {
                    // Throw an object of user defined exception
                    throw new Expect("Custom_Exception");
                }
                catch (Expect ex) {
                    System.out.println("Caught");
                    System.out.println(ex.getMessage());
                }
            }
        }




