package stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PrintStringsAndLength {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("Ramnavami", "Ganesh", "Ramayan", "Holi", "Christmas");

        Map<String, Integer> finalAns = strings.stream()
                .collect(
                    Collectors.toMap(
                        n->n,
                        n->n.length()
                    )
                );
        for (Map.Entry<String, Integer> map: finalAns.entrySet()){
            System.out.println(map.getKey()+" "+map.getValue());
        }
    }
}
