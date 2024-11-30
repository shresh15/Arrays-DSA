//Given an integer array nums, rotate the array to the right by k steps, where k is non-negative.
class Solution {
    public void rotate(int[] nums, int k) {
        int n=nums.length;
         k=k%n;
        reverse(nums,n-k,n-1);
        reverse(nums,0,n-k-1);
        reverse(nums,0,n-1);
    }

    int[] reverse(int[]arr,int f,int l){
        while(f<l)
        {int temp=0;
        temp=arr[f];
        arr[f]=arr[l];
        arr[l]=temp;
        f++;
        l--;
        }
        return arr;
    }
}