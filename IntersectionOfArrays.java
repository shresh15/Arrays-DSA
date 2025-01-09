//Given two integer arrays nums1 and nums2, return an array of their 
//intersection
//. Each element in the result must be unique and you may return the result in any order.
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
         HashSet<Integer>hs=new HashSet<>();
         int l1=nums1.length;
         int l2=nums2.length;
        
        for(int num: nums1){
            hs.add(num);
        }
        
        ArrayList<Integer>ans=new ArrayList<>();
         
         for(int num:nums2){
             if(hs.contains(num)){
                 ans.add(num);
                 hs.remove(num);
             } 
         }
         int[] result=new int[ans.size()];
         for(int i=0;i<result.length;i++){
            result[i]=ans.get(i);
         }
         
         return result;
    }
}