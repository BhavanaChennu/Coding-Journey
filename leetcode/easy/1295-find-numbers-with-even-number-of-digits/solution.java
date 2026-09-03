class Solution {
    public int findNumbers(int[] nums) {
        int totalCount = 0;
        for(int i = 0 ; i < nums.length; i++){
            int res = extractDigits(nums[i]);
            if(res % 2 == 0) totalCount++;
        }
        return totalCount;
    }
    public int extractDigits(int n){
        int count = 0;
        while( n > 0){
            int r = n % 10;
            count ++;
            n = n/ 10;
        }
        return count;
    }
}