class Solution {
    public void moveZeroes(int[] nums) {
        int i= 0;
        for(int j = 0 ; j < nums.length; j++){
            if(nums[j] != 0){
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                i++;
            }
        }
        ArrayList<Integer> list = new ArrayList<>();
        for(int k =0; k < nums.length; k++){
            System.out.print(list.add(nums[k]));
        }

    }
}