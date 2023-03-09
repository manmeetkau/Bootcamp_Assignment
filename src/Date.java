import java.util.Scanner;
import java.time.LocalDate;
public class Date {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the date(YYYY-MM-DD");
        String date=sc.nextLine();
        LocalDate date1=LocalDate.parse(date);

        System.out.println("Enter the 2 date(YYYY-MM-DD");
        String date_2=sc.nextLine();
        LocalDate date2=LocalDate.parse(date_2);

        if(date1.isBefore((date2)))
            System.out.println("First date occurs before second date");

        else if(date1.isAfter((date2)))
            System.out.println("First date occurs after second date");

        else {
            System.out.println("date are same");
        }
    }
}
