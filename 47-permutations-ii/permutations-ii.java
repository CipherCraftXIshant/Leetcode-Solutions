class Solution {

    public void helper(int[] nums ,List<Integer> ds, boolean [] isValid,List<List<Integer>> ans ){
        if(ds.size() == nums.length){
            ans.add(new ArrayList<>(ds));
            return;
        }
        for(int i=0;i<nums.length;i++){

            if(i>0 && nums[i] == nums[i-1] && !isValid[i-1]){
                continue;
            }

            if(isValid[i] == false){
                ds.add(nums[i]);
                isValid[i] = true;
                helper(nums,ds,isValid,ans);
                isValid[i] = false;
                ds.remove(ds.size()-1);
            }
        }
    }

    public List<List<Integer>> permuteUnique(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> ds = new ArrayList<>();
        boolean [] isValid = new boolean[nums.length];
        helper(nums,ds,isValid,ans);
        return ans;
    }
}