package leetcode;

public class NumbersWithSameConsecutiveDifference {

    public static void main(String [] args){
        numsSameConsecDiff(3,7);
    }
    public static int[] numsSameConsecDiff(int N, int K) {
        int[] arr = new int[N];
        int k= 0;
        String starting = "";
        int [] start = new int[N];
        for(int i = 0;i<N;i++){
            if(i == N-1){
                arr[i] = 1;
            }
            else{
                arr[i] = 0;
            }
        }
        for(int i = arr.length-1;i>=0;i--){
            start[k] = arr[i];
            k++;
        }
        for(int i = 0;i<start.length;i++){
            starting+=String.valueOf(start[i]);
        }
        int startingNumber = Integer.parseInt(starting);
        while(String.valueOf(startingNumber).length()==N){
            String abc = String.valueOf(startingNumber);
            if(abc.length()>=2){
                for(int i = 0;i<abc.length()-1;i++){
                    if(Math.abs(Integer.parseInt(String.valueOf(abc.charAt(i))))-Integer.parseInt(String.valueOf(abc.charAt(i+1)))==K){

                    }
                }
            }
        }
        return new int[2];

    }
}
