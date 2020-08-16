package afteracademy;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {

    public static void main(String [] args){
        String s = "LVII";
        int sum = convert(s);
        System.out.print(sum);

    }

    public static Integer convert(String str){

        Map<String,Integer> map = new HashMap<>();
        map.put("I",1);
        map.put("V",5);
        map.put("X",10);
        map.put("L",50);
        map.put("C",100);
        map.put("D",500);
        map.put("M",1000);
        map.put(" ",0);

        int sum = 0;

        str+=" ";

        String [] splitted = str.split("");
            for (int i = 0; i < splitted.length-1; i++) {
                if(map.get(splitted[i])<map.get(splitted[i+1])){
                    sum += map.get(splitted[i+1])-map.get(splitted[i]);
                    i++;
                }
                else{
                sum += map.get(splitted[i]);
            }
        }
        return sum;
    }

}