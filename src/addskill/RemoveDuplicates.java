package addskill;

public class RemoveDuplicates {

    public int removeDuplicates(int[] nums) {

        //Total count of unique elements
        int count = 1;
        //index of where the next unique element is inserted
        int j = 1;

        for(int i = 0;i<nums.length-1;i++){
            if(nums[i]!=nums[i+1]){
                nums[j]=nums[i+1];
                j++;
                count++;
            }
        }

        return count;
    }
}