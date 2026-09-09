import java.lang.Math;

class Solution {
    public int maxWater(int arr[]) {
        // Code Here
        int left = 0 , right = arr.length-1;
        int maxArea = 0;
        while(left < right){
            int heights = Math.min(arr[left] , arr[right]);
            int width = right - left;
            int area = heights * width ;
            maxArea = Math.max(maxArea , area);
            if(arr[left] <= arr[right])   
                    left ++;
            else 
                    right--;
        }
        return maxArea;
    }
}