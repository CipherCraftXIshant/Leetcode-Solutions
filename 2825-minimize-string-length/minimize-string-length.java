class Solution {
    public int minimizedStringLength(String l) {
        HashSet<Character> set = new HashSet<>();
        for(char s : l.toCharArray()){
            // if(set.contains(s)){
            //     set.remove(s);
            // }
            // else{
            //     set.add(s);
            // }
            set.add(s);
        }
        return set.size();
    }
}