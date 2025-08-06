package Tavant;

import java.util.Arrays;
import java.util.List;

public class CheckIfAnyNumberIsEven {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3);
        Boolean isAnyEven = numbers.stream().anyMatch(n->n%2==0);

        System.out.println("is any even:"+isAnyEven);
    }
}
