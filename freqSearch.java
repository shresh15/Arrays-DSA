// Given a sorted array, arr[] and a number target, you need to find the number of occurrences of target in arr[]. 
class Solution {
    int countFreq(int[] arr, int target) {
        // code here
        HashMap<Integer,Integer>mpp=new HashMap<>();
        int n=arr.length;
        for(int i=0;i<n;i++){
            int value=mpp.getOrDefault(arr[i],0);
            mpp.put(arr[i],value+1);
            
        }
        for (Map.Entry<Integer, Integer> it : mpp.entrySet()) {
            if (it.getKey() ==target) {
               return it.getValue(); 
            }
        }
        return 0;
         
    }
}