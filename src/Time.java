import java.text.SimpleDateFormat;
import java.text.DateFormat;
import java.util.TimeZone;
import java.util.Date;
public class Time {
    public static void main(String[] args)
    {
        Date today=new Date();
        DateFormat dformat=new SimpleDateFormat("dd-MM-YY HH:mm:SS");
        dformat.setTimeZone(TimeZone.getTimeZone("Asia/Delhi"));
        String st=dformat.format(today);
        System.out.println("Timezone Asia/Delhi"+st);

        dformat.setTimeZone(TimeZone.getTimeZone("America/Canada"));
        String st1=dformat.format(today);
        System.out.println("Timezone America/Canada"+st1);

        dformat.setTimeZone(TimeZone.getTimeZone("France/London"));
        String st2=dformat.format(today);
        System.out.println("Timezone France/London"+st2);
    }
}
