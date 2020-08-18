package afteracademy;

import java.util.ArrayList;

public class LargestElementInArray {

    public static void main(String [] args){

    }

    public static int largestElement(ArrayList<Integer> arr) {
        int largest = arr.get(0);
        for(int i = 0;i<arr.size();i++){
            if(arr.get(i)>largest){
                largest = arr.get(i);
            }
        }
        return largest;
    }
}
