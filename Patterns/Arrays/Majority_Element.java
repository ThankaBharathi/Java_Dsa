
import java.util.Arrays;
class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length/2];
    }
}

// optimal approach
//https://leetcode.com/problems/majority-element/
//leetcode majority Element (169)

//Sorting Approach

// First i want find the majority element in the given array and the main condtion is majority element > n/2 of the given array
// Majority element is the element which is present more than n/2 times in the array
// First in this approach i will sort the array by Arrays.sort(nums) it will sort by internal sorting algorithm are (Quick sort and Tim Sort)
// After sorting the array i will return the middle element of the array which is the majority element of
// the array because majority element is the element which is present more than n/2 times in th
//so that the answer is find 

// Time complexity of this approach is O(n log n) because of sorting and space complexity is O(1)

//_______________________________________________________________________________________________________________________________________________

//Boyer-Moore Voting Algorithm

//what is boyer-moore Voting algorithm 

class Solution {
    public int majorityElement(int[] nums) {
    int element = nums[0];
    int count = 0;

    for (int i : nums) {
        if (count == 0) {
            element = i;
        }
        count += (i == element) ? 1 : -1;   // first it will check the i == element it is true it will return true and add 1 or it will be false it do subtract 1;
    }
    return candidate;
    }
 
}



// in this i will take a element and count where i will initialize count is zero and element as nums[0]; means zeroth index of an array
// then i will iterate the array and check if count is zero it will assign the element to candidat
// then i will check if i == element it will add 1 or it will be false it
// will subtract 1 from count
// then i will return the candidate which is the majority element of the array
// Meaning for this line ||count += (i == element) ? 1 : -1;||  First it will check the i and element is equal.
// this ? means if it is true it will do add one so that we put 1 and it is false it will -1 


//Time complexity o(n)
//Space complexity o(1)