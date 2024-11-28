//Given an array arr[]. The task is to find the largest element and return it.
class Solution {
    public static int largest(int[] arr) {
        Arrays.sort(arr);
        int n=arr.length;
        return arr[n-1];
        // code here
    }
}