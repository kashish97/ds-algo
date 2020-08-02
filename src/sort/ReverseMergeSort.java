package sort;

public class ReverseMergeSort {

    public static void main(String [] args){
        int [] intArray = {20,35,-15,7,55,1,-22,34};
        System.out.print("Input Array ");
        for (int i = 0; i < intArray.length; i++) {
            System.out.print(intArray[i] + " ");
        }
        System.out.println(" ");
        int[] newArr = divide(intArray,0, 7);
        System.out.print("Output Array ");

        for (int i = 0; i < newArr.length; i++) {
            System.out.print(newArr[i] + " ");
        }}

    public static int[] divide(int [] arr, int start, int end){
        if(end - start == 0){
            int [] array = new int[1];
            array[0] = arr[start];
            return array;
        }
        int mid = (start + end)/2;
        int [] arr1 = divide(arr,start,mid);
        int [] arr2 = divide(arr,mid+1,end);
        int [] finalarr = join(arr1,arr2);
        return finalarr;
    }

    public static int[] join(int [] arr1,int [] arr2){
        int i = 0;
        int j = 0;
        int k = 0;
        int [] finalarr = new int[arr1.length+arr2.length];
        while(i<arr1.length && j<arr2.length){
            if(arr1[i]<arr2[j]){
                finalarr[k] = arr2[j];
                j++;

            }
            else{
                finalarr[k] = arr1[i];
                i++;

            }
            k++;
        }
        while(i<arr1.length){
            finalarr[k] = arr1[i];
            k++;
            i++;
        }
        while(j<arr2.length){
            finalarr[k] = arr2[j];
            k++;
            j++;
        }
        return finalarr;

    }
}
