package leetcode;

public class GoatLatin {

    public static void main(String [] args){
        String s = "I speak Goat Latin";
        toGoatLatin(s);
    }

    public static String toGoatLatin(String S){
        String[] arr = S.split(" ");
        String[] b = new String[arr.length];
        int l = 0;
        for(int i = 0;i<arr.length;i++){
            if(arr[i].charAt(0)=='a' || arr[i].charAt(0)=='e' ||arr[i].charAt(0)=='i'||arr[i].charAt(0)=='o'||arr[i].charAt(0)=='u' ||
                    arr[i].charAt(0)=='A' || arr[i].charAt(0)=='E' ||arr[i].charAt(0)=='I'||arr[i].charAt(0)=='O'||arr[i].charAt(0)=='U'){
                if(i==arr.length-1) {
                    arr[i] = arr[i] + "ma";
                    arr[i] = addA(arr[i], i);
                    b[l] = arr[i];
                    l++;
                }
                else{
                    arr[i] = arr[i] + "ma";
                    arr[i] = addA(arr[i], i);
                    b[l] = arr[i] + " ";
                    l++;
                }
            }
            else{
                if(i==arr.length-1){
                    arr[i] = arr[i].substring(1)+arr[i].charAt(0)+"ma";
                    arr[i] = addA(arr[i],i);
                    b[l] = arr[i];
                    l++;
                }
                else{
                arr[i] = arr[i].substring(1)+arr[i].charAt(0)+"ma";
                arr[i] = addA(arr[i],i);
                b[l] = arr[i]+" ";
                l++;
            }}
        }
        String h ="";
        for(int i = 0;i<b.length;i++){
            h+=b[i];
        }
        System.out.println(h);
        return h;
    }

    public static String addA(String s,int i){
        int j = 1;
        while(j<=i+1){
            s+="a";
            j++;
        }
        return s;
    }
}
