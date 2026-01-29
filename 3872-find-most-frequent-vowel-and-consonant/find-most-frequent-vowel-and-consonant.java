class Solution {
    public int maxFreqSum(String s) {
        int vowel = 0;
        int cons = 0;
        int [] freq = new int[26];
        for(char c : s.toCharArray()){
            char i = (char)(c -'a');
            freq[i]++;
            if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u'){
                vowel = Math.max(vowel,freq[i]);
            }
            else{
                cons = Math.max(cons,freq[i]);
            }
        }
        return vowel + cons;
    }
}