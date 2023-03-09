import java.util.stream.IntStream;

public class Iterate_method {
    public static void main(String[] args)
    {
        IntStream
                .iterate(1,i->i<=10,i->i+3)
                .forEach(System.out::println);
    }
}
