import java.util.Scanner;

public class String_API {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = "Welcome Everyone To The New";
        String blank = "\n\t";
        String result = str.transform(string -> new StringBuilder(str).substring(17,27).toString());
        String textB= """
         
            "name" : "%s",
            "RollNO" : "%s"
         1
         """.formatted("Mahesh", "32");
        String trans="\"Helllo \\nWorld\"";
        System.out.println("Formatted example:\n"+textB);
        System.out.println("Stripindent example:"+textB.stripIndent());
        System.out.print("Enter the no. of times you want to print a text =");
        int count = sc.nextInt();
        System.out.println(str.repeat(count));

        System.out.print("strip example:" + str.strip().equals("Welcome Everyone To The New"));
        System.out.print("\n"+"blank example:" + blank.isBlank());
        String text = str.indent(15);
        System.out.print("\n"+"indent example:" + text);
        text = str.indent(-5);
        System.out.print("indent example:" + text);
        System.out.print("tranform:" + result);
        System.out.println("\n"+"translateEscape example:"+textB.translateEscapes());
    }
}