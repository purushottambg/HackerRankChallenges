package Tavant;

import java.util.Arrays;

public class FindSeconHighestViaLoops {
    public static void main(String[] args) {
        int[] intArr = {1,5,7,6,43,658,758,34,6,76,45,5,3,76,4,658};
        Arrays.sort(intArr);

        int counter=0;
        if (intArr.length==2)
            System.out.println("Second Highest Num is:"+intArr[0]);
        else if (intArr.length<2) {
            System.out.println("Array too short");
        }else {
            for (int i = intArr.length - 1; i >= 0; i--) {
                if (intArr[i] != intArr[i - 1]) {
                    counter++;
                    if (counter == 2) {
                        System.out.println("Second Highest Num is:" + intArr[i]);
                        break;
                    }
                }
            }
        }
    }
}
