class Solution {
    public boolean isTrionic(int[] nums) {
        int p=-1;
        int q =-1;
        int n = nums.length;

        for(int i=0;i<n-1;i++){
            if(nums[i]>=nums[i+1]){
                p=i;
                break;
            }
        }
        if(p<=0) return false;

        for(int i=p;i<n-1;i++){
            if(nums[i]<=nums[i+1]){
                q=i;
                break;
            }
        }
        if(q<=0) return false;

        int val = 0;
        for(int i=q;i<n-1;i++){
            if(nums[i]>=nums[i+1]){
                val = 1;
                break;
            }
        }
        if(val==0 && q<=n-1) return true;
        return false;
    }
}