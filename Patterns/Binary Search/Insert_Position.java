class Solution {
    public int searchInsert(int[] nums, int target) {
     int start = 0; int end = nums.length -1;
     while(start <= end){
         int mid = start + (end - start) / 2;
         if(nums[mid] == target){
             return mid;
         }
         else if(target > nums[mid]){
             start = mid + 1;
         }
         else{
             end = mid - 1;
         }
     }
     return start;
 }
 }

 //https://leetcode.com/problems/search-insert-position/description/
 // Search Insert position (35)

 // Where in this problem i take a optimal solution as binary search 
 // In this i will do to find a element using binary search 
 // If the answer is found it will return the index
 // If the answer is not found it will return the index where the answer should be inserted
 // I will do a process until the condition is break start <= end
 // After this the start element is having a correct index of insertion so i return the start element 

 // Time complexity o(nlogn)
 // Space complexity o(1)