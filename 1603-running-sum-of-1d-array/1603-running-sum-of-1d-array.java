class Solution {
    public int[] runningSum(int[] nums) {
        
        if(nums.length ==0)
            return new int[]{};

        int runningSum = 0;

        for(int index = 0; index < nums.length; index++){
            nums[index] += runningSum;
            runningSum = nums[index];
        }

        return nums;
    }
}