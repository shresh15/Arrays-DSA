class Solution {
    boolean twoSum(int arr[], int target) {
        
        // code here
        int n=arr.length;
        HashSet<Integer>set=new HashSet<>();
        for(int i=0;i<n;i++){
            int complement= target-arr[i];
            if(set.contains(complement)) return true;
            set.add(arr[i]);
        }
        return false;
    }
}