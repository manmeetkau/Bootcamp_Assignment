import java.util.Arrays;
import java.util.Optional;
import java.util.stream.*;
import java.util.List;
public class presentt_or {
    public static void main(String[] args) {
        List<Integer> lists= Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        System.out.println("orElseThrow O/P");
     int x= lists.stream()
                .filter(e->e>5)
                .findFirst()
                .orElseThrow();
     System.out.println("Element Greater than 5="+x);

     System.out.println("\n"+"ifPresentOrElse O/P");
     lists.stream()
             .filter(e->e>11)
             .findFirst()
             .ifPresentOrElse(System.out::println,()->System.out.println("value doesn't Exist"));

     System.out.println("\n"+"or O/P");
     lists.stream()
             .filter(e->e>8)
             .findFirst()
             .or(()-> Optional.of(-1)).ifPresentOrElse(System.out::println,()->System.out.println("Value doesn't exist"));
    }
}
