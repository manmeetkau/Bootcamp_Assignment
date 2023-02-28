package Assignment1;

import java.util.*;
import java.lang.*;
import java.util.Scanner;
class output
{
    public static void main(String args[])
    {
        // boolean output=true;
        List<String> user=new ArrayList<>();
        System.out.println("Enter  your data below(send XDONE to exit)");
        Scanner input=new Scanner(System.in);
        while(true)
        {
            String line=input.nextLine();

            if("XDONE".equalsIgnoreCase(line))
            {
                break;
            }

            user.add(line);}
        System.out.println(user);
    }
}



