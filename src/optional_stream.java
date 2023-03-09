import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class optional_stream {
    public static void main(String[] args)
    {
        //int num,cons;
        List<Integer> ll= Arrays.asList(1,2,3,4,5,6,7,8);
        ll .stream()
                .filter(e->e>5)
                .findFirst()
                .stream()
                .mapMulti((num,cons)->IntStream.rangeClosed(1,10)
            .forEach(e->cons.accept(e*e)))
            .forEach(System.out::println);
    }
}
