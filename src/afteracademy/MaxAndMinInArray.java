package afteracademy;

import java.util.ArrayList;

public class MaxAndMinInArray {

    public static void main(String [] args){

    }
    public static ArrayList<Integer> findingMinMax(ArrayList<Integer> arr) {
        ArrayList<Integer> arr1 = new ArrayList<>();
       int max = arr.get(0);
       int min = arr.get(0);
       for(int i = 0;i<arr.size();i++){
           if(arr.get(i)>=max){
               max = arr.get(i);
           }
           else{
               min = arr.get(i);
           }
       }
       arr1.add(min);
       arr1.add(max);
       return arr1;
    }
}
