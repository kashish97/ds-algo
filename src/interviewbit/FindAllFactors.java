package interviewbit;

import java.util.ArrayList;
import java.util.List;

public class FindAllFactors {
    public static void main(String [] args){
        findFactors(36);

    }

    public static ArrayList<Integer> findFactors(int n){
        int start = 0;
        int end = 1;
        ArrayList<Integer> returnList = new ArrayList<>();

        for(int i = 1;i<=Math.sqrt(n);i++){
            if(n%i==0){
                returnList.add(start,i);
                start++;
                if(i!=Math.sqrt(n)){
                    returnList.add(end,n/i);
                    end++;
                }
            }
        }
        System.out.println(returnList);
        return returnList;
    }
}
