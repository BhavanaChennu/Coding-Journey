# Move Zeroes

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given an integer array `nums`, move all `0`'s to the end of it while maintaining the relative order of the non-zero elements.

 **Note**  that you must do this in-place without making a copy of the array.

 

 **Example 1:** 

```
Input: nums = [0,1,0,3,12]
Output: [1,3,12,0,0]

```

 **Example 2:** 

```
Input: nums = [0]
Output: [0]

```

 

 **Constraints:** 

- 1 <= nums.length <= 104
- -231 <= nums[i] <= 231 - 1

 

 **Follow up:**  Could you minimize the total number of operations done?

## Solution

**Language:** Java  
**Runtime:** 138 ms (beats 5.25%)  
**Memory:** 47.8 MB (beats 38.29%)  
**Submitted:** 2026-09-04T09:53:54.993Z  

```java
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
```

---

[View on LeetCode](https://leetcode.com/problems/move-zeroes/)