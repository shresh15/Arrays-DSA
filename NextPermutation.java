class Solution {
    public void nextPermutation(int[] nums) {
        int n=nums.length;
        int ind=-1;
        for(int i=n-2;i>=0;i--){
            if(nums[i]<nums[i+1]){ind=i; break;}
        }
    
    if(ind==-1){ 
        reverse(nums,0,n-1);
         return;}
         

    for(int i=n-1;i>ind;i--){
        if(nums[i]>nums[ind]) {
            int temp=nums[i];
            nums[i]=nums[ind];
            nums[ind]=temp;
            break;
        }
    }

    reverse(nums,ind+1,n-1);
}

   int[]reverse(int[]nums,int f,int l){
    while(f<l){
        int temp=nums[f];
        nums[f]=nums[l];
        nums[l]=temp;
        f++;
        l--;
    }
    return nums;
   }
}