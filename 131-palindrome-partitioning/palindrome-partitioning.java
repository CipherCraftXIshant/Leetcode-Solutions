class Solution {

    public void res(int idx,String s , List<String> ds , List<List<String>> ans){
        if(idx == s.length()){
            ans.add(new ArrayList<>(ds));
            return;
        }
        for(int i=idx;i<s.length();i++){

            String part = s.substring(idx,i+1);

            if(isPalindrome(part)){
                ds.add(part);
                res(i+1,s,ds,ans);
                ds.remove(ds.size()-1);
        }
        }
    }

    public boolean isPalindrome(String str){
        int a = 0;
        int b = str.length()-1;
        while(a<b){
            if(str.charAt(a)!=str.charAt(b)){
                return false;
            }
            a++;
            b--;
        }
        return true;
    }

    public List<List<String>> partition(String s) {
        List<List<String>> ans = new ArrayList<>();
        res(0,s,new ArrayList<>(),ans);
        return ans;
    }
}