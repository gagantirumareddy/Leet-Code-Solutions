class Solution {
    public int findMin(int[] nums) {
        int i = 0;
        int j = nums.length - 1;
        
        while (i <= j) {
            int mid = i + (j - i) / 2;
            
            // If mid element is smaller than rightmost, 
            // the minimum is in the left half (including mid)
            if (nums[mid] < nums[j]) {
                j = mid;
            } 
            // If mid is greater than or equal to rightmost, 
            // the minimum must be in the right half
            else {
                i = mid + 1;
            }
        }
        // j ends up at the index of the minimum element
        return nums[j];
    }
}
