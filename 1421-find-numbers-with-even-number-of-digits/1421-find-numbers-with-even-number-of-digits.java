class Solution {
    public int findNumbers(int[] nums) {
        int n = nums.length;
        int sum = 0;
        for(int i=0;i<n;i++){
            int count = 0;
            int temp = Math.abs(nums[i]);

            if(temp == 0){
                count = 1;
            }
            else{
                while(temp>0){
                    count++;
                    temp=temp/10;
                }
            }
            if(count%2==0){
                sum++;
            }
        }
        return sum;
}
}