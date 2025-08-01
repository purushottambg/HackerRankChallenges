package stream;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class CountTheCharInString {
    public static void main(String[] args) {
        String val = "This is the string where we Will Call and Check Ats What All The Chars Are Repeaatated";
        String[] vals = val.split(" ");
        Map<Character, Long> countChar = Arrays.stream(vals)
                .flatMap(n->n.chars().mapToObj(c->(char) c ) )
                .collect(
                        Collectors.groupingBy(n->n, Collectors.counting())
                )
                .entrySet().stream()
                .filter(var->var.getValue()>3)
                .collect(Collectors.toMap(var->var.getKey(), var->var.getValue()
                ));

        for (Map.Entry<Character, Long> var : countChar.entrySet()){
            System.out.println(var.getKey()+" "+var.getValue());
        }
    }
}
