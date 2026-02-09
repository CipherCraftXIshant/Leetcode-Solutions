class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int n = nums.length;
        int count = 0;
        int l = 0;
        for(int i=0;i<n;i++){
            if(nums[i] == 0){
                l=0;
            }else if (nums[i] ==1) {
                l++;
            }
            count = Math.max(l,count);
        }
        return count;
    }
}