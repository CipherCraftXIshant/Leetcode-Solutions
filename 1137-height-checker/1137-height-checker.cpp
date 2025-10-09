class Solution {
    public int heightChecker(int[] heights) {
        int n = heights.length;
        int count =0;
        ArrayList<Integer> expected = new ArrayList<>(n);
        for(int i=0;i<n;i++){
            expected.add(heights[i]);
        }
        Collections.sort(expected);
        for(int i=0;i<n;i++){
            if(heights[i] != expected.get(i)){
                count++;
            }
        }
        return count;
    }
}