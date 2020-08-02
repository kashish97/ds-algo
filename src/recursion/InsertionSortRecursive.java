package recursion;

public class InsertionSortRecursive {

    public static void main(String [] args){

        int [] intArray = {20,35,-15,7,55,1,-22,34};
        System.out.print("Input Array ");
        for (int i = 0; i < intArray.length; i++) {
            System.out.print(intArray[i] + " ");
        }
        System.out.println(" ");

        int[] newArr = sort(intArray,0,7);
        System.out.print("Output Array ");

        for (int i = 0; i < newArr.length; i++) {
            System.out.print(newArr[i] + " ");
        }}



    public static int[] sort(int [] arr,int start,int end){
        if(start == end){
            return arr;
        }
        int newElem = arr[start+1];
        int j = start+1;
        while(j>0 && arr[j-1]>newElem){
            arr[j] = arr[j-1];
            j--;
        }
        arr[j] = newElem;
        System.out.println("Result ===============");
        for (int i = 0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        sort(arr,start+1,end);
        return arr;
    }


}
