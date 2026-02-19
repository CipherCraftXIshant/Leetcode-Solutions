class Solution {

    public void helper(int[] nums , int idx , List<List<Integer>> ans){
        int n = nums.length;
        if(idx==n){
            List<Integer> l = new ArrayList<>();
            for(int i=0;i<n;i++){
                l.add(nums[i]);
            }
            ans.add(l);
            return ;
        }
        HashSet<Integer> set = new HashSet<>();
        for(int i=idx;i<n;i++){

            if(set.contains(nums[i])) continue;
            set.add(nums[i]);

            swap(nums,i,idx);
            helper(nums,idx+1,ans);
            swap(nums,i,idx);
        }
    }

    public void swap(int [] arr,int i , int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public List<List<Integer>> permuteUnique(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        helper(nums,0,ans);
        return ans;
    }
}