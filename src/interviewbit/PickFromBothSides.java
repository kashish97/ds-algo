package interviewbit;

import java.util.ArrayList;

public class PickFromBothSides {

    public static void main(String [] args){
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        int sum = pick(arr,1);
        System.out.print(sum);
    }
//926 434
    public static int pick(ArrayList<Integer> A, int B){
        int count = 0;
        int start = 0;
        int sum = 0;
        int end = A.size()-1;
        while(count<B){
            if(A.get(start)>A.get(end)){
                sum+=A.get(start);
                start++;
                count++;
            }
            else{
                sum+=A.get(end);
                end--;
                count++;
            }
        }
        System.out.println(""+B+"  "+count);
        return sum;
    }
}
