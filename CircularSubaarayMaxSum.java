//Given a circular integer array nums of length n, return the maximum possible sum of a non-empty subarray of nums.
class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int maxSum=nums[0], minSum=nums[0];
        int cur_Max_sum=0,cur_Min_sum=0;
        int totalSum=0;
        int n=nums.length;
        for(int i=0;i<n;i++){
            cur_Max_sum= Math.max(  cur_Max_sum+nums[i],  nums[i]);
            cur_Min_sum= Math.min(  cur_Min_sum+nums[i],  nums[i]);

            maxSum=Math.max(maxSum,cur_Max_sum);
            minSum=Math.min(minSum,cur_Min_sum);
            totalSum+=nums[i];

        }
        //  int normalSum=maxSum;
        //     int cirSum=totalSum-minSum;
        //      if(minSum==totalSum) return normalSum;

        //      return Math.max(cirSum,maxSum);
        
    return maxSum < 0 ? maxSum : Math.max(maxSum, totalSum - minSum);
        
        
    }
}