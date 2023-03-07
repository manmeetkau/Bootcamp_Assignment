import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> lists = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
        int num= lists.stream()
                .filter(x->x>5)
                .reduce(0,(ans,i)->ans+i);
        System.out.println(num);
    }
}