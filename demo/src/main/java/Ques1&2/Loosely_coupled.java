package Spring1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Loosely_coupled
{
    public static void main(String args[]) {

        CalArea calar = new CalArea(new Square());
        int result = calar.Calarea();
        System.out.println(result);
  //   SpringApplication.run(SpringApplication.class,args);
    }
}


