package stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MapIntegerToTheirSquares {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(12,43,65,7,56,34,65,76,45,23,65,32,47,41,65,87,45,4,32,23,21,54,12);
        Map<Integer, Integer> numsAndSquare = nums.stream()
            .collect(Collectors
                .toMap(
                    n->n,
                    n->n*n,
                    (oldValue, newValue)->oldValue
                )
            );

        for ( Map.Entry<Integer, Integer> map:  numsAndSquare.entrySet()  ){
            System.out.println(map.getKey()+" "+map.getValue());
        }
    }
}
