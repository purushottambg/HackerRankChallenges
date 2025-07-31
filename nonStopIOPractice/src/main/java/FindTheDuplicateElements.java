import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FindTheDuplicateElements {
    public static void main(String[] args) {
        Set<Integer> duplicateElements = new TreeSet<>();
        List<Integer> uniqueElements = Arrays.asList(1,34,56,67,56,7,3,3,4,53,5,6,34,65,6,53,3).stream()
                .filter(n->!duplicateElements.add(n))
                .collect(Collectors.toList());

        System.out.println("Printing only duplicate elements!");
        for (int i: uniqueElements){
            System.out.print(i+" ");
        }
    }
}
