package sort;

public class ShellSort {

    public static void main(String[] args) {

        int[] intArray = {20, 35, -15, 7, 55, 1, -22};
        for(int gap = intArray.length/2;gap>0;gap=gap/2){
        for(int i = gap;i<intArray.length;i++) {
            int newElem = intArray[i];
            int j = i;
            while (j > 0 && intArray[j - gap] > newElem) {
                intArray[j] = intArray[j - gap];
                j = j-gap;
            }
            intArray[j] = newElem;

        }
        }
        printArray(intArray);
    }

    public static void printArray(int [] arr){
        for(int i = 0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}