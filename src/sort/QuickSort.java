package sort;

public class QuickSort {

    public static void main(String [] args){
        int [] intArray = {20,35,-15,7,55,1,-22,34,-91,100};
        System.out.print("Input Array ");
        for (int i = 0; i < intArray.length; i++) {
            System.out.print(intArray[i] + " ");
        }
        System.out.println(" ");
        minimise(intArray, 0, 9);
        System.out.print("Output Array ");
        for (int i = 0; i < intArray.length; i++) {
           System.out.print(intArray[i] + " ");
        }
    }
    public static void minimise(int [] arr,int start,int end){
        if(start<end) {
            int partition = partition(start, end, arr);
            minimise(arr, start, partition - 1);
            minimise(arr, partition + 1, end);
        }
    }

    public static int partition(int start,int end,int [] arr){
        int i = start-1;
        int pivot = end;
        for(int j = start;j<=end;j++){
            if(arr[j]<arr[pivot]){
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i+1];
        arr[i+1] = arr[pivot];
        arr[pivot] = temp;
        return i+1;
    }
}
