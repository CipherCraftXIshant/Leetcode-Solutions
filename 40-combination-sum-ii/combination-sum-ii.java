class Solution {

    public void res(int idx , List<List<Integer>> ans, List<Integer>ds  ,int[] candidates ,int target){
        if(target == 0){
            ans.add(new ArrayList<>(ds));
            return;
        }
        for(int i=idx ; i<candidates.length;i++){

            if(i>idx && candidates[i] == candidates[i-1]) continue;
            if(candidates[i]>target) continue;

            ds.add(candidates[i]);
            res(i+1 , ans,ds,candidates,target-candidates[i]);
            ds.remove(ds.size()-1);
        }
    }

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> ans = new ArrayList<>();
        res(0,ans,new ArrayList<>() , candidates , target);
        return ans;
    }
}