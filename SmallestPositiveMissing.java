//Given an unsorted integer array nums. Return the smallest positive integer that is not present in nums.

// You must implement an algorithm that runs in O(n) time and uses O(1) auxiliary space.

class Solution {
    public int firstMissingPositive(int[] nums) {

        int n=nums.length;

        for(int i=0;i<n;i++){

            while(nums[i]>=1 && nums[i]<=n && nums[i] != nums[nums[i]-1]){
                // swap
                int temp=nums[i];
                nums[i]=nums[temp-1];
                nums[temp-1]=temp;
            }
        }
        for(int i=1;i<=n;i++){
            if(i != nums[i-1]) return i;
        }
        return n+1;
        
    }
}