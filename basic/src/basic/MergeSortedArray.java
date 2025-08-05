package basic;

public class MergeSortedArray {
    public static void main(String[] args) {
        int[] arra1 = {1,3,5,7,9};
        int[] arra2 = {0,2,4,8,9};
        int[] finalArray = new int[arra1.length+arra2.length];
        int index1=0;
        int index2=0;

        int finallen = arra2.length+arra1.length-1;
        int finalindex=0;
        while (finalindex<finallen){
            if(arra1[index1]>arra2[index2]){
                finalArray[finalindex]=arra1[index1];
                index1+=1;
            } else if (arra1[index1]<arra2[index2]) {
                finalArray[finalindex]=arra2[index2];
                index2+=1;
            }
            finalindex+=1;
        }

        for (int i: finalArray){
            System.out.print(i+" ");
        }

    }
}
