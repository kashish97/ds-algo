package afteracademy;

import java.util.ArrayList;

public class MergeTwoSortedArrays {

    public static void main(String [] args){

    }


        public ArrayList<Integer> mergeSortedArray(ArrayList<Integer> arr1, ArrayList<Integer> arr2) {
            ArrayList<Integer> arr3 = new ArrayList<>(arr1.size()+arr2.size());
            int i = 0;int j = 0;int k = 0;
            while(i<arr1.size() && j<arr2.size()){
                if(arr1.get(i)<arr2.get(j)){
                    arr3.add(k,arr1.get(i));
                    i++;
                    k++;
                }
                else {
                    arr3.add(k,arr2.get(j));
                    j++;
                    k++;
                }
            }
            if(i!=arr1.size()){
                for(int m = i;m<arr1.size();m++){
                    arr3.add(k,arr1.get(m));
                    k++;
                }

            }
            else if(j!=arr2.size()){
                for(int m = j;m<arr2.size();m++){
                    arr3.add(k,arr2.get(m));
                    k++;
                }
            }
            return arr3;
        }
}
