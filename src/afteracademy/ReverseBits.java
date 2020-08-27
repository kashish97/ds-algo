package afteracademy;

public class ReverseBits {

    public static void main(String [] args){
        getResult(13);
    }

    public static void getResult(int n){
        String a = getBinaryFromDecimal(n);
        //String b = reverse(a);
        int c = getDecimalFromBinary(a);
        System.out.println(c);
    }

    public static String getBinaryFromDecimal(int n){
        String a = "";
        String b = "";
        while(n!=0){
            a+=String.valueOf(n%2);
            n = n/2;
        }
        return a;
    }

    public static int getDecimalFromBinary(String s){
        int pow = 0;
        double sum = 0;
        for(int i = s.length()-1;i>=0;i--){
            double multiply = Math.pow(2,pow);
            sum+=(Integer.parseInt(String.valueOf(s.charAt(i))))*multiply;
            pow++;
        }
       // System.out.println(sum);
        return ((int) sum);
    }
}
