package search;

public class LinearSearch {

    public static void main(String [] args){
        int [] intArray = {20,35,-15,7,55,1,-22,34,-91,100};
        search(100,intArray);
    }

    public static void search(int n,int[] arr){
        for(int i =0;i<arr.length;i++){
            if(arr[i]==n){
                System.out.println("Element found at "+i+"th position");
            }
        }
        System.out.println("Element not found");
    }
}
