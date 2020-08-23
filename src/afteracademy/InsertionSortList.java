package afteracademy;

import java.util.ArrayList;

public class InsertionSortList {

    public static void main(String [] args){
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(3);
        arr.add(1);
        arr.add(5);
        ArrayList<Integer> arr1 = sort(arr);
        System.out.println(arr1);
    }

    public static ArrayList<Integer> sort(ArrayList<Integer> arr) {

        for(int i =1;i<arr.size();i++){
            int selected = arr.get(i);
            int j = i;
            while(j>0 && arr.get(j-1)>selected){
                arr.set(j,arr.get(j-1));
                j--;
            }
            arr.set(j,selected);
        }
        return arr;
    }
}
