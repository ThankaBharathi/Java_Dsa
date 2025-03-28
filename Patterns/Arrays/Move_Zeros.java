class Solution {
    public void moveZeroes(int[] nums) {
       int initial = 0;
       for(int i = 0;i<nums.length;i++){
        if(nums[i] != 0){
            int temp = nums[initial];
            nums[initial]= nums[i];
            nums[i]= temp;
            initial++;
        }
       }
    }
}

// https://leetcode.com/problems/move-zeroes/ (283)
// Optimal approach 
// where in this sum i have select a In place zero fill approach where this will be move points where a index is zero or not
//in this first i take a two pointers and two pointers also initialised at zero and loop will be run for length of an array 
// First it will check the number is != 0 if this is true it will swap a initial pointer and i pointer swap and i iterate the initial pointer and ith pointer 
// it false my index is zero means i will interate a i pointer 

//Time complexity = o(n)
//Space complexity = o(1)

