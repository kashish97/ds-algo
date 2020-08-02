package sort;

public class InsertionSort {

    public static void main(String [] args){

        int [] intArray = {20,35,-15,7,55,1,-22};

        for(int i = 1;i<intArray.length;i++){
            int newElem = intArray[i];
            int j =i;
            while(j>0 && intArray[j-1]>newElem) {
                intArray[j] = intArray[j-1];
                j--;
            }
            intArray[j] = newElem;
        }
        printArray(intArray);
    }

    public static void  printArray(int []arr){
        for(int i = 0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
