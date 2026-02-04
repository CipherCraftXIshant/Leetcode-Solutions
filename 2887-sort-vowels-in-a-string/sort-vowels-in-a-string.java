class Solution {
    public String sortVowels(String s) {
        ArrayList<Character> vowel = new ArrayList<>();

        for(char c : s.toCharArray()){
            if("AEIOUaeiou".indexOf(c)!=-1){
                vowel.add(c);
            }
        }
        Collections.sort(vowel);

        StringBuilder sb = new StringBuilder();
        int i=0;
        for(char c : s.toCharArray()){
            if("AEIOUaeiou".indexOf(c) != -1){
                sb.append(vowel.get(i++));
            }else{
                sb.append(c);
            }
        }
        return sb.toString();
    }
}