import java.util.Arrays;
import java.util.List;

    public class optional {
        public static void main(String[] args)
        {
            List<Integer> lists = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
            int res=lists.stream()
                    .filter(e->e>3)
                    .filter(e->e%2==0)
                    .map(e->e*2)
                    .findFirst().get();
            System.out.println(res);
        }
    }



