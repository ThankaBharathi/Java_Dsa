class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length == 0) return 0;
        int i =0;
        for(int j = 0;j<nums.length;j++){
            if(nums[i] != nums[j]){
                i++;
                nums[i] = nums[j];
            }
        }
        return i+1;
    }
}

//https://leetcode.com/problems/remove-duplicates-from-sorted-array/description/  
//Remove Duplicates from Sorted Array (26)

// In this problem we want to remove the duplicates in-place such that each unique element appears only once. 
//The relative order of the elements should be kept the same. Then return the number of unique elements in nums.

//For this problem only one approach is there 2 pointers that is 
//First i will check the array have elements are not if not return 0; 
//next i will initialize the i pointer =0 and j pointer = 0 j pointer will traverse the whole array 
//i will check the condtion if(i != j) if this is true i will increment the ith pointer one time and replace the j element into ith position
// for example [1,1,2,2,3] means after this ith pointer come to 1 index and j will be in 2nd index i will replace 2nd index element into ith place like nums[i] = nums[j];
//i will increment the j pointer one time and repeat the same process until j pointer reach the
// Return the answer as i+1 because it will be whole start from 0th index so that i+1 or whole element - unique element == i+1;

// Time complexity o(n)
// Space complexity o(1)