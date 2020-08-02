package sort;

public class MergeSort {

    public static void main(String [] args) {

        int [] intArray = {20,35,-15,7,55,1,-22,34};
        System.out.print("Input Array ");
        for (int i = 0; i < intArray.length; i++) {
            System.out.print(intArray[i] + " ");
        }
        System.out.println(" ");

        int[] newArr = divide(0, 7, intArray);
        System.out.print("Output Array ");

        for (int i = 0; i < newArr.length; i++) {
            System.out.print(newArr[i] + " ");
        }}

        public static int[] divide ( int start, int end, int[] arr){
            if (end - start == 0) {
                int [] arr1 = new int[1];
                arr1[0] = arr[start];
                return arr1;
            }
            int mid = (start + end)/2;
            int[] arr1 = divide(start, mid, arr);
            int[] arr2 = divide(mid + 1, end, arr);
            int[] finalArray = merge(arr1, arr2);
            return finalArray;
        }

    public static int[] merge(int [] arr1,int [] arr2){
        int i = 0;
        int j = 0;
        int k =0;
        int[] newArr = new int[arr1.length+arr2.length];
        while(i<arr1.length && j<arr2.length){
            if(arr1[i]<arr2[j]){
                newArr[k] = arr1[i];
                i++;
                k++;
            }
            else{
                if(arr1[i]>arr2[j]){
                    newArr[k] = arr2[j];
                    j++;
                    k++;
            }
        }

    }
        if(i!=arr1.length){
            for(int m = i;m<arr1.length;m++){
                newArr[k]=arr1[m];
                k++;
            }
        }
        else{
            for(int m = j;m<arr2.length;m++){
                newArr[k]=arr2[m];
                k++;
            }
        }

        return newArr;
    }
}
