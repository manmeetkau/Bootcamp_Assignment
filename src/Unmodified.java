import java.util.ArrayList;
import java.util.List;
public class Unmodified {
    public static void main(String[] args) {
        List<String> lang1 = new ArrayList<String>();
        lang1.add("Java");
        lang1.add("python");
        lang1.add("c++");

        List<String> unmmodifiable=List.copyOf(lang1);
        System.out.println(unmmodifiable);
unmmodifiable.add("node.js");
    }
}

