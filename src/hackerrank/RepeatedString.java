package hackerrank;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class RepeatedString {
    public static void main(String [] args)
    {
        repeatedString("bcabab",8);
    }
    //bcabab

//add bnam city hno in l lo
    // Complete the repeatedString function below.
    static void repeatedString(String s, long n) {
        int c = 0;
        int c2 = 0;
        if(s.equals("a")){
            //return n;
        }
        for(int i = 0;i<s.length();i++){
            if(s.charAt(i)=='a'){
                c++;
            }
        }

//        if(s=="a"){
//            S;
//        }
        //UD DD UD UU
        //+1 0 -1 -2 +1 0 +1 +1
        long multiply = n/s.length();
        long count = multiply*c;
        long rem = n%s.length();
        for(int i = 0;i<rem;i++){
            if(s.charAt(i)=='a'){
                c2++;
            }
        }
        System.out.println(c+c2);

    }

}
