class Solution {
    public void rotate(int[] nums, int k) {
       int n = nums.length;
       k = k % n;
        reverse(nums,0,n-1);
        reverse(nums,0,k-1);
        reverse(nums,k,n-1);

    }
     private void reverse(int[] nums,int start, int end){
     while(start < end){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        
     }
    }
}


// https://leetcode.com/problems/rotate-array/
// Roate Array (189) Medium

// Given an array, rotate the array to the right by k steps, where k is non-negativ
// Where i will take a optimal approach where in this reverse method to rotate an array 
// we can reverse the array in three parts
// First i want to check the array element n > k because suppose this condition is false means the rotation of array is same or array doesnt have elements
// if n > k then we can simply reverse the array from start to end and then reverse th
// In first i will reverse the whole array using reverse function i will made as start end and temp variables 
// In second i will reverse the array from start to k-1 index using reverse function i will
// In third i will reverse the array from k to end index using reverse function i will made as
// from these the problm get solved 

// Time complexity o(n)
// Space complexity o(1)