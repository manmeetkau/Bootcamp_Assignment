import java.util.stream.IntStream;

public class range_closed {
    public static void main(String[] args) {
        IntStream.range(1, 5)
                .forEach(System.out::print);

        System.out.println("\n"+"Range_Closed");
        IntStream.rangeClosed(1,6)
                .forEach(System.out::print);
    }
}
