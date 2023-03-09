import java.util.Arrays;
import java.util.List;
public class take_drop {
    public static void main(String[] args) {
        List<Integer> ll = Arrays.asList(1,2,3, 4,5, 6,7, 8,9, 10,11, 12,13, 14,15, 16,17, 18,19, 20);
        System.out.println("takewhile");
        ll.stream()
                .takeWhile(e->e<10)
                .forEach(System.out::print);

        System.out.println("\n"+"dropwhile");
       ll.stream()
                .dropWhile(e->e<10)
                .forEach(System.out::print);
    }
}