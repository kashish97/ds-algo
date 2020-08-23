package afteracademy;

import java.util.ArrayList;

public class WaveArray {

    public static void main(String [] args){

        int [] arr =  {3, 6, 5, 10, 7, 20};
        printArray(arr);
       // int [] arr1 = waveArray(arr);
      //  printArray(arr1);
    }

    // arr[0] >= arr[1] <= arr[2] >= arr[3] <= arr[4] .....
    public static ArrayList<Integer> waveArray(ArrayList<Integer> arr) {
        for(int i = 0;i<arr.size();i+=2){
            if(i>0 && arr.get(i-1)>arr.get(i)){
                int temp = arr.get(i-1);
                arr.add(i-1,arr.get(i));
                arr.add(i,temp);
            }
            if(i<arr.size()-1 && arr.get(i+1)>arr.get(i)){
                int temp = arr.get(i+1);
                arr.add(i+1,arr.get(i));
                arr.add(i,temp);
            }
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
