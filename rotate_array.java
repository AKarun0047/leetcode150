class Solution {
    public void rotate(int[] nums, int k) {
        k=k%nums.length;
        reverse(nums,0,nums.length-1);
        reverse(nums,0,k-1);
        reverse(nums,k,nums.length-1);

        
    }
    public void reverse(int[] nums, int start, int end){
        while(start < end){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}


/*
 
step 1 { 1,2,3,4,5,6,7}
step 2 revrerse whole array 
  {7,6,5,4,3,2,1}
step 3 
from 0 to k-1 mtlb 3-2 tk
{ 5,6,7 , 4,3,2,1}
step 4 
 {5,6,7,1,2,3,4}


 */