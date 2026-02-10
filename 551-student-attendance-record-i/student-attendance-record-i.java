class Solution {
    public boolean checkRecord(String s) {
        int a =0 ;
        int l=0 ;
        int max = 0;
        for(char c : s.toCharArray()){
            if(c=='A'){
                a++;
            }
            if(a>=2) return false;
        }
        for(char c : s.toCharArray()){
            if(c=='L'){
                l++;
            }else{
                l=0;
            }
            max = Math.max(max,l);
        }
        return max < 3;
    }
}