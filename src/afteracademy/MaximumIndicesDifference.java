package afteracademy;

import java.util.ArrayList;

public class MaximumIndicesDifference {

    public static void main(String [] args){
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(72);
        arr.add(8);
        arr.add(10);
        arr.add(3);
        arr.add(2);
        arr.add(81);
        arr.add(30);
        arr.add(1);
        arr.add(32);
        int diff = findDifference(arr);
        System.out.print(diff);
    }

    public static int findDifference(ArrayList<Integer> arr){
        int start = 0;
        int end = arr.size()-1;
        int min = arr.get(start);
        int max = arr.get(end);
        while(start!=end){
            if(arr.get(start)<arr.get(end)){
                min = arr.get(start);
                if(end>start && arr.get(end)>arr.get(start) && arr.get(start)>max){
                    max = arr.get(start);
                }
            }
        }
        return 0;
    }
}
