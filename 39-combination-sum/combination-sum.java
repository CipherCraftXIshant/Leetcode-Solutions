class Solution {

    List<List<Integer>> result = new ArrayList<>();

    public void res(int i, int[] candidates, List<Integer> temp , int target){
        if(target == 0){
            result.add(new ArrayList<>(temp)) ;
            return;
        }
        if(target<0 || i >= candidates.length){
            return;
        }
        temp.add(candidates[i]);
        res(i,candidates,temp,target-candidates[i]);
        temp.remove(temp.size()-1);
        res(i+1,candidates,temp,target);
    }

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        res(0,candidates,new ArrayList<>(),target);
        return result;
    }
}