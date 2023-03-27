package SpringExample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Loosely_coupled_Main
{
    public static void main(String[] args) {
      ///  CalArea calar = new CalArea(new Square());
        ApplicationContext applicationContext=SpringApplication.run(Loosely_coupled_Main.class,args);
       // ApplicationContext applicationcontext=SpringApplication.run(SpringApplication.class,args);
       CalArea calar= applicationContext.getBean(CalArea.class);
        int result = calar.Calarea();
        System.out.println(result);
  //
    }
}


