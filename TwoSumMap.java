class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        int arr[]=new int[2];
        HashMap<Integer,Integer>mpp=new HashMap<>();
        int n=nums.length;
        for(int i=0;i<n;i++){
            // for(int j=i+1;j<nums.length;j++){
            //     if(nums[i]+nums[j]==target)
            //     {arr[0]=i;
            //     arr[1]=j;}
            // }
            int complement=target-nums[i];
            if (mpp.containsKey(complement)) {
                // If the complement exists in the map, return its index and the current index
                arr[0] = mpp.get(complement); // Index of the complement
                arr[1] = i; // Current index
                return arr;
            }
            mpp.put(nums[i],i);

        }
        return arr;
        
    }
}