package stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupStringsByLength {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("a", "bb", "ccc", "dd");
        Map<Integer, List<String>> val = names.stream()
                .collect(Collectors.groupingBy(n->n.length() ));

        System.out.println(val);
    }
}
