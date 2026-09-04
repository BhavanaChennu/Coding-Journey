 public static int removeDuplicates(int[] nums) {
     //code here...
     if(nums.length == 0) return 0;
     int i = 0 , j = 1;
     while( j < nums.length){
         if(nums[i] == nums[j]) j++;
         else{
            i++;
            nums[i] = nums[j];
         }
     }
     return i + 1;
     
 }