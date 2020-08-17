package afteracademy;

import java.util.ArrayList;

public class MoveZeroesToEnd {

    public static void main(String [] args){
        ArrayList<Integer> input = new ArrayList<>();
        input.add(1);
        input.add(0);
        input.add(0);
        input.add(2);
        input.add(0);
        input.add(1);
        input.add(9);
        input.add(13);
        int [] inputArray = {1,0,0,2,0,1,9,13};
        printArray(input);
        System.out.println("   ===>");
       ArrayList<Integer>  arr1 = moveZeroes(input);
        printArray(arr1);



    }

    public static  ArrayList<Integer> moveZeroes(ArrayList<Integer> arr) {
        int count = 0;
        ArrayList<Integer> arr1 = new ArrayList<>();
        int j =0;
        for(int i = 0;i<arr.size();i++){
            if(arr.get(i)==0){
                count++;
            }
            if(arr.get(i)!=0){
                arr1.add(arr.get(i));
                j++;
            }

        }
        for(int i = arr1.size();i<arr.size();i++){
            arr1.add(0);
        }
        return arr1;
    }



    public static void printArray(ArrayList<Integer> arr){
        for(int i = 0;i<arr.size();i++){
            System.out.print(arr.get(i)+" ");
        }

    }
}
