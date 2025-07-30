class Solution {
public:
    vector<int> rearrangeArray(vector<int>& nums) {
        int s = 0, e=1;
        int n = nums.size();
        vector<int>ans(n);
        for(int i =0;i<n;i++){
            if(nums[i] < 0){
                ans[e] = nums[i];
                e += 2;
            }
            if(nums[i]>0){
                ans[s] = nums[i];
                s+=2;
            }
        }
        return ans;
        
    }
};