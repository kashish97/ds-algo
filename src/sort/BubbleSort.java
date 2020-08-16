package sort;

public class BubbleSort {

    public static void main(String [] args){

        int [] intArray = {40,35,-15};

        for(int unsorted = intArray.length-1;unsorted>0;unsorted--){
            for(int i = 0;i<unsorted;i++){
                if(intArray[i]>intArray[i+1]){
                    swap(intArray,i,i+1);
                }
            }
        }
        printArray(intArray);
    }
    public static void swap(int []arr,int i,int j){
        if(i == j)
            return;
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void printArray(int [] arr){
        for(int i = 0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
