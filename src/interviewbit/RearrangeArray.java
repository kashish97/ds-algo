package interviewbit;

import java.util.ArrayList;

public class RearrangeArray {

    public static void main(String [] args){
        ArrayList<Integer> a = new ArrayList<>();
        a.add(1);
        a.add(0);
        arrange(a);
    }

    public static void arrange(ArrayList<Integer> a) {
        for(int i = 0;i<a.size();i++){
            int temp = a.get(i);
            a.set(i,convert(a.get(i),a));
        }
        System.out.println(a);
    }

    public static int convert(int a,ArrayList<Integer> arr){
        return arr.get(a);
    }
}
