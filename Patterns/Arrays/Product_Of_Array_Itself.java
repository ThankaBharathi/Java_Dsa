class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] output = new int[n];

        output[0] = 1;
        for(int i = 1;i < n;i++){
            output[i] = output[i-1] * nums[i-1];
        }
        int right = 1; 
        for(int i = n-1;i >=0;i--){
            output[i] *= right;
            right *= nums[i];
        }
        return output;
    }
}

// https://leetcode.com/problems/product-of-array-except-self/
// Product of Array except self (238) Medium

// In this problem i have take a optimal approach 
// First the problem statement is product the whole array elaments except itself for eg we have [1,2,3,4] o/p is [24,12,8,6]
// For this we want to do an prefix and suffix in the array but we do using single variable 
// For this we take a output array and initially output[0] = 1 and we run a iteration 
// from 1 to n-1 and and we store the prefix value as the formula output[i] = output[i-1] * nums[i -1] because we start a loop as from 1 
// if we start from 0 it will go as a out of bound and we initial the 0th index as we as 0 so that we do n-1; 
// After that we take a right variable  as 1 and we run a iteration from n-1 to 0
// and we store the suffix value as the formula output[i] = output[i] * right because
// and output value we do a output[i] * right because the right value is 1 and then last value is not modified 
// so we do a output[i] *= right because we want to store the suffix value in th    
// And we will update the right value as right * nums[1] as a array 
// From that we get an answer 

// Time complexity o(n)
// Space complexity is o(n) but in this question they dint take a memory for extra output array so that o(1)

