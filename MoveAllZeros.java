//Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.
class Solution {
    public void moveZeroes(int[] nums) {
        int c=0,temp=0;
        int len=nums.length;
        //if(len==1) return;
        for(int i=0;i<len;i++){
            if(nums[i]!=0){
                 temp=nums[c];
                 nums[c]=nums[i];
                 nums[i]=temp;
                 c++;
            }
        }
        
    }
}