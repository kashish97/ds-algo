package afteracademy;

public class ReverseArray {

    public static void main(String [] args){
        int [] arr = {1,2,3};
        printArray(arr);
        int [] arr1 = reverse(arr);
        printArray(arr1);
    }

    public static int [] reverse(int [] arr){
        int start = 0;
        int end = arr.length-1;
        while (start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        return arr;
    }

    public static void printArray(int [] arr){
        for(int i = 0;i<arr.length;i++){
            System.out.print(arr[i] +" ");
        }
        System.out.println(" ");
    }
}
