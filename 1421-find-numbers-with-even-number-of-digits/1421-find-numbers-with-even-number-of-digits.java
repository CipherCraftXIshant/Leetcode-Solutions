class Solution {
    public int findNumbers(int[] nums) {
        int n = nums.length;
        int sum = 0;
        int[] digits = new int[n];
        for(int i=0;i<n;i++){
            int count = 0;
            int temp = nums[i];
            if (temp == 0) {
                count = 1; 
            } else {
                while (temp > 0) {
                    count++;
                    temp /= 10;
                }
            }
            digits[i] = count; 
        }
        for(int i=0;i<n;i++){
            if(digits[i]%2==0){
                sum++;
            }
        }
        return sum;
    }
}