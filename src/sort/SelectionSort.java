package sort;

public class SelectionSort {

    public static void main(String [] args){

        int [] intArray = {20,35,-15,7,55,1,-22};

        for(int unsorted = intArray.length-1;unsorted>0;unsorted-- ){
            int greatest = 0;
            for(int i = 1;i<=unsorted;i++){
                if(intArray[greatest]<intArray[i]){
                    greatest = i;
                }
                swap(intArray,greatest,unsorted);
            }
        }
        printArray(intArray);
    }

    public static void swap(int [] arr,int i ,int j){
        if(i == j){
            return;
        }
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void  printArray(int []arr){
        for(int i = 0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
