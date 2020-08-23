package afteracademy;

import java.util.ArrayList;
import java.util.Collections;

public class MinimumAbsoluteDifference {

    public static void main(String [] args){
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(7);
        arr.add(-12);
        arr.add(22);
        arr.add(-8);
        arr.add(-16);
        arr.add(18);



        ArrayList<ArrayList<Integer>> arrInput = calculateDiff(arr);
        System.out.println(arrInput);
    }

    public static ArrayList<ArrayList<Integer>> calculateDiff(ArrayList<Integer> arr){
        Collections.sort(arr);
        ArrayList<ArrayList<Integer>> arrfinal= new ArrayList<>();
        int minDiff = arr.get(1)-arr.get(0);
        for(int i = 0;i<arr.size()-1;i++){
            if((arr.get(i+1)-arr.get(i))<minDiff){
                minDiff = arr.get(i+1)-arr.get(i);
            }
        }

        for(int i = 0;i<arr.size()-1;i++){
            if(arr.get(i+1)-arr.get(i) == minDiff){
                ArrayList<Integer> arr1 = new ArrayList<>();
                arr1.add(arr.get(i));
                arr1.add(arr.get(i+1));
                arrfinal.add(arr1);
            }

        }
        return arrfinal;
    }
}
