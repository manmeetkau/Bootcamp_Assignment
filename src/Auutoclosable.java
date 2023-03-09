import java.io.*;
        public class Auutoclosable {
    // Java program to illustrate
// Automatic Resource Management
// in Java with multiple resource

        public static void main(String[] args)
        {
            // note the order of opening the resources
            try (Demo d = new Demo(); Demo1 d1 = new Demo1()) {
                int x = 10 / 0;
                d.show();
                d1.show1();
            }
            catch (ArithmeticException e) {
                System.out.println(e);
            }
        }
    }

    // custom resource 1
    class Demo implements Closeable {
        void show() { System.out.println("inside show"); }
        public void close()
        {
            System.out.println("close from demo");
        }
    }

    // custom resource 2
    class Demo1 implements Closeable {
        void show1() { System.out.println("inside show1"); }
        public void close()
        {
            System.out.println("close from demo1");
        }

    }
