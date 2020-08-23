package afteracademy;

public class SquareRoot {

    public static void main(String [] args){
        find(11);
        System.out.print(findOther(11));
    }

    public static int find(int n){
        int start = 0;
        while(start*start<=n){
            start++;
        }
        System.out.print(start-1);
        return 0;
    }

    public static int findOther(int n){
        int start = 0;
        int end = n;
        int numb = 0;
        while(start<=end){
            int mid = (start+ end)/2;
            if(mid*mid == n){
                return mid;
            }
            else if(mid*mid>n)
                end = mid-1;
            else{
                start = mid+1;
                numb = mid;
            }

        }

        return numb;
    }
}
