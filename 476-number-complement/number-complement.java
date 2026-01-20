class Solution {
    public int findComplement(int num) {
        String st = Integer.toBinaryString(num);
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<st.length();i++){
            sb.append(st.charAt(i) == '0' ? '1' : '0');
        }
        return Integer.parseInt(sb.toString(),2);
    }
}