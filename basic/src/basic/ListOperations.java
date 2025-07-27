package basic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ListOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer NValue = scanner.nextInt();
        List<Integer> numList = new ArrayList<>();
        for (int i = 0; i < NValue; i++) {
            numList.add(scanner.nextInt());
        }
        Integer operations = scanner.nextInt();

        for (int i=0; i<operations; i++){
            String choice = scanner.next();
            if(choice.equalsIgnoreCase("Insert")){
                int number = scanner.nextInt();
                int index=scanner.nextInt();

                numList.add(index, number);

            } else if (choice.equalsIgnoreCase("Delete")) {
                int number = scanner.nextInt();
                numList.remove(number);
            }
        }

        for (int i: numList){
            System.out.print(i+",");
        }

    }
}
