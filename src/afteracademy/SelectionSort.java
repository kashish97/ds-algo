package afteracademy;

import java.util.ArrayList;
import java.util.Collections;

public class SelectionSort {

    public static void main(String [] args){

    }

    public static ArrayList<Integer> sort(ArrayList<Integer> arr){

        int max = 0;
        for(int i = arr.get(arr.size()-1);i>0;i--){
            for(int j = 1;j<i;j++) {
                if (arr.get(j) > max) {
                    max = j;
                }
                Collections.swap(arr, max, i);
            }
        }
        return arr;
    }
}
