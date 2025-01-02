/*You are given an m x n integer matrix matrix with the following two properties:

Each row is sorted in non-decreasing order.
The first integer of each row is greater than the last integer of the previous row.
Given an integer target, return true if target is in matrix or false otherwise.
*/
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int n=matrix.length; //rows
        int m=matrix[0].length; //columns
        int i=0, j=m-1;
        while(i<n && j>=0){
            
            if(target>matrix[i][j]) i++;
            else if (target<matrix[i][j]) j--;
            else return true;
             
        }
        return false;
        
    }
}