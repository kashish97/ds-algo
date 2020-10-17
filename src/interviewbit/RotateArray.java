package interviewbit;

public class RotateArray {

    public static void main(String [] args){
        int [] arr = {1,2,3,4,5,6,7};
        rotate(arr,2);
    }

    public static void rotate(int [] arr,int d){
        for(int i = 0;i<d;i++){
            rotateByOne(arr,i);
        }
        for(int i = 0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void rotateByOne(int [] arr,int j){
        int temp = arr[0];
        for(int i = 0;i<arr.length-1;i++){
            arr[i] = arr[i+1];
        }
        arr[arr.length-1] = temp;
    }
//    public static void rotate2(int [] arr,int d){
//        int [] arr1 = new int[d];
//        for(int i = 0;i<d;i++){
//            arr1[i] = arr[i];
//        }
//        for(int i = 0;i<arr.length-d;i++){
//            arr[i] = arr[i+1];
//        }
//        int start = arr.length-d;
//        int c = 0;
//        while(start<arr.length){
//            arr[start] = arr1[c];
//            start++;
//            c++;
//        }
//
//        for(int i = 0;i<arr.length;i++){
//            System.out.print(arr[i]+" ");
//
//        }
//    }


}
