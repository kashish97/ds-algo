package recursion;

public class Factorial {

    private static int calculateFactorial(int num){
        int factorial;
        if(num == 0){
            return 1;
        }
        else{
            return num*calculateFactorial(num-1);
        }
    }

    public static void main(String [] args){
        System.out.print(calculateFactorial(5));

    }
}
