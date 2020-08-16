package search;

public class BinarySearch {

    public static void main(String [] args){
            int [] intArray = {-91,-22,-15,1,7,20,34,35,55,100};
            search(intArray,101,0,10);
    }

    public static void search(int [] arr,int n , int start,int end){
        if(end>start) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == n) {
                System.out.print("Element found at position " + mid);
                return;
            } else if (n < arr[mid]) {
                search(arr, n, 0, mid - 1);
            } else if (n > arr[mid]) {
                search(arr, n, mid + 1, end);
            }
        }

        System.out.print("Element not found");
        return;

    }
}
