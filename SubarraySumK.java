//Given an array of integers nums and an integer k, return the total number of subarrays whose sum equals to k.

//A subarray is a contiguous non-empty sequence of elements within an array.
class Solution {
    public int subarraySum(int[] nums, int k) {
        int n=nums.length;
        int cnt=0;
        int presum=0;
        
        HashMap<Integer,Integer>mpp=new HashMap<>();
        mpp.put(0,1);
        for(int i=0;i<n;i++){
            presum+=nums[i];
            int remove=presum-k;
            cnt=cnt+mpp.getOrDefault(remove,0);
            mpp.put(presum,mpp.getOrDefault(presum,0)+1);
            
            
        }
        return cnt;
        
    }
}