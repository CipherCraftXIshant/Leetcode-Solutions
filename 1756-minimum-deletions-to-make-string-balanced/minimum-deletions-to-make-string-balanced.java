class Solution {
    public int minimumDeletions(String s) {
        int r=0 , cnt=0;
        for(char c : s.toCharArray()){
            if(c=='b'){
                cnt++;
            }else if (cnt>0){
                r++;
                cnt--;
            }
        }
        return r;
    }
}