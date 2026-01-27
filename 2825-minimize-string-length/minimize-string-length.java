class Solution {
    public int minimizedStringLength(String l) {
        int count = 0;
        boolean[] seen = new boolean[26];
        for(char s : l.toCharArray()){
            // if(set.contains(s)){
            //     set.remove(s);
            // }
            // else{
            //     set.add(s);
            // }
            if(!seen[s - 'a']){
                seen[s - 'a'] = true;
                count++;
            }
        }
        return count;
    }
}