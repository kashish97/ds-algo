package afteracademy;

public class PowerFunction {

    public static void main(String [] args){
        int res = calculatePower(4,4);
        System.out.print(res);
    }

    public static int calculatePower(int k, int n) {
        int newNum = k;
        // write your awesome code here
        if(n>2){
        for(int i =2;i<=n;i++){
            newNum *= k;
        }}
        else if(n<=2){
            newNum = k*k;
        }
        return newNum;
    }


}
