class Solution {
    public int countNonMinimum(int[] nums) {
        // write your code here 
        int N = nums.length;
        int count = 0;
        int M = nums[0];
        for (int i = 1; i < N; i++) {
            if (nums[i] < M) {
                M = nums[i];
            }
        }  
            
        for (int i = 0; i < N; i++) {
            if (nums[i] != M) {
                count++;
            }
        }
        
        return count;
    }
}
