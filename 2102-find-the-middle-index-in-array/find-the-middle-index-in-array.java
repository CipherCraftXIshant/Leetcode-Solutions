class Solution {
    public int findMiddleIndex(int[] nums) {
        int n = nums.length;

        int [] prefix = new int[n];
        int [] sufix = new int[n];

        prefix[0] = 0;
        int preffix = 0;
        for(int i=1;i<n;i++){
            preffix += nums[i-1];
            prefix[i] = preffix;
        }

        sufix[n-1] = 0;
        int suffix = 0;
        for(int i=n-2;i>=0;i--){
            suffix += nums[i+1];
            sufix[i] = suffix;
        }

        for(int i=0;i<n;i++){
            if(prefix[i] == sufix[i]) return i;
        }
        return -1;
    }
}