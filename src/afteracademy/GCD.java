package afteracademy;

public class GCD {

    public static void main(String [] args){
        int a = gcd(54,24);
        System.out.print(a);
    }
    public static int gcd(int a , int b){
        int max = 0;
        if(a>b){
            for(int i = 1;i<=b;i++){
                if(a%i==0 && b%i==0){
                    if(i>max){
                        max = i;
                    }
                }
            }
            return max;
        }
        else{
            for(int i = 1;i<=a;i++){
                if(a%i==0 && b%i==0){
                    if(i>max){
                        max = i;
                    }
                }
            }
            return max;
        }
    }
}
