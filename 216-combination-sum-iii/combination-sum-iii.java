class Solution {

    public void res(int start , int k , int target , List<Integer>temp,List<List<Integer>> result){
        if(temp.size() == k && target == 0){
                result.add(new ArrayList<>(temp));
                 return;
        }
        for(int i=start;i<=9;i++){
            if(i>target) break;
            temp.add(i);
            res(i+1,k,target-i,temp,result);
            temp.remove(temp.size()-1);
        }
    }

    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> result = new ArrayList<>();
        res(1,k,n,new ArrayList<>(),result);
        return result;
    }
}