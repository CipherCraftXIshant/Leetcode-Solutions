class Solution {

    public void res(int idx,List<List<Integer>> ans,List<Integer>ds,int n,int k){
        if(ds.size()==k){
            ans.add(new ArrayList<>(ds));
            return;
        }
        for(int i=idx;i<=n;i++){

            ds.add(i);
            res(i+1,ans,ds,n,k);
            ds.remove(ds.size()-1);
        }
    }

    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> ans = new ArrayList<>();
        res(1,ans,new ArrayList<>(),n,k);
        return ans;
    }
}