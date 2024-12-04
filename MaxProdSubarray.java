// //Given an integer array nums, find a 
// subarray
//  that has the largest product, and return the product.

// The test cases are generated so that the answer will fit in a 32-bit integer.
class Solution {
    public int maxProduct(int[] nums) {
        int n=nums.length;
        int ans=Integer.MIN_VALUE;
        int pre=1;int suff=1;
        for(int i=0;i<n;i++){
            if(suff==0)suff=1;
            if(pre==0) pre=1;
            pre=pre* nums[i];
            suff=suff*nums[n-i-1];
            ans=Math.max(ans, Math.max(pre,suff));
        }
        return ans;
        
    }
}