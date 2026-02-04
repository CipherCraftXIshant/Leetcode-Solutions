class Solution {
    public String reversePrefix(String word, char ch) {
        StringBuilder sb = new StringBuilder();
        int idx = word.indexOf(ch);
        if(idx==-1){
            return word;
        }

        sb.append(word.substring(0,idx+1));

        return  (sb.reverse().toString() + word.substring(idx+1));
    }
}