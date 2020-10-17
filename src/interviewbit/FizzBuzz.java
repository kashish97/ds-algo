package interviewbit;

import java.util.ArrayList;

public class FizzBuzz {


    public ArrayList<String> fizzBuzz(int A) {
        ArrayList<String> returnList = new ArrayList<>();
        for(int i = 1;i<=A;i++){
            if(i%3==0 && i%5!=0){
                returnList.add("Fizz");
            }
            else if(i%5==0 && i%3!=0){
                returnList.add("Buzz");
            }
            else if(i%3==0 && i%5==0){
                returnList.add("FizzBuzz");
            }
            else{
            returnList.add(String.valueOf(i));
        }}
        return returnList;
    }
}
