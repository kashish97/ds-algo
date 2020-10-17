package interviewbit;

import java.util.HashMap;
import java.util.Map;

//
public class MaxNonNegativeSubArray {

    public static void main(String [] args){
        int [] arr = {2,3,4,-6,4,-9,-10};
        returnArray(arr);
    }

    public static void returnArray(int [] arr){
        int [][] a = new int [arr.length][arr.length];
        int j = 0;
        int k = 0;
        for(int i = 0;i<arr.length;i++){
            if(arr[i]>=0){
                a[j][k] = arr[i];
                k++;
            }
            else{
                j++;
                }
            }

        for(int [] b:a){
            for(int i:b){
                System.out.print(i);
            }
        }
    }

}
