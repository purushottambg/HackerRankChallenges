package stream;

import java.util.Arrays;
import java.util.List;

public class FilterAndPrintEvenNumber {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(12,43,65,7,56,34,65,76,45,23,65,32,47,41,65,87,45,4,32,23,21,54,12);
        nums.stream().filter(n->n%2==0).forEach(System.out::println);
    }
}
