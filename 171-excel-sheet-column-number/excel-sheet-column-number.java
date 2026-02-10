class Solution {
    public int titleToNumber(String str) {
        int n = str.length();
        int result = 0;
        for(char c : str.toCharArray()){
            result = result*26 + (c -'A' +1);
        }
        return result;
    }
}