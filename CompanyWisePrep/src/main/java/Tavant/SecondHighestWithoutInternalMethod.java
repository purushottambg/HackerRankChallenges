package Tavant;

public class SecondHighestWithoutInternalMethod {
    public static void main(String[] args) {
        int[] intArr = {1,5,7,6,43,658,758,34,6,76,45,5,3,76,4,658};
        int[] mainArr = new int[2];

        int carrier=0;
        int mainIndex=0;
        for (int i: intArr){
            if(i>carrier){
                carrier=i;
            }
        }

    }
}
