class Solution {
    public int lengthOfLastWord(String s) {
        String[] word = s.split(" ");
        int n = word.length;
        int count = 0;
        count = word[n-1].length();
        return count;
    }
}