import java.util.Scanner;

interface StringManipulation {
    private static String lendtring(String str) {
        return new StringBuilder(str).reverse().toString().toUpperCase();
    }

    static String togetstring(String str) {
        return lendtring(str);
    }
}

public class private_method{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the text=");
        String str1=sc.next();
        System.out.println(StringManipulation.togetstring(str1));
    }
}