package interviewbit;

public class AddBinaryStrings {

    public static void add(String s1,String s2){
        int i = s1.length();
        int j = s2.length();

        int n = 0;
        if(i>j){
        n = i;
        }
        else if(j>i){
            n = j;

        }
        else{
        }
        String [] c  = new String[n];
        int k = c.length-1;
        if(i>j){
            while(j>=0){
                c[k] = String.valueOf(Integer.parseInt(String.valueOf(s1.charAt(i-1)))+Integer.parseInt(String.valueOf(s2.charAt(j-1))));
                k--;
                j--;
                i--;
            }}
            else{
                while(i>=0){
                    c[k] = String.valueOf(Integer.parseInt(String.valueOf(s1.charAt(i-1)))+Integer.parseInt(String.valueOf(s2.charAt(j-1))));
                    k--;
                    j--;
                    i--;
                }

            if(i>0){
                for(int m = i;m>=0;m--){
                    c[k] = String.valueOf(s1.charAt(m));
                }
            }
            else if(j>0){
                for(int m = j;m>=0;m--){
                    c[k] = String.valueOf(s2.charAt(m));
                }
            }
        }
    }
}
