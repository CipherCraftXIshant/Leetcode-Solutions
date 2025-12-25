class Solution {
    public int largestRectangleArea(int[] heights) {
        Stack<Integer> s = new Stack<>();
        int max = 0;
        int i = 0;

        while (i <= heights.length) {
            int val = (i < heights.length) ? heights[i] : 0;

            if (s.isEmpty() || val >= heights[s.peek()]) {
                s.push(i);
                i++;
            } else {
                int h = heights[s.pop()];
                int w = s.isEmpty() ? i : i - s.peek() - 1;
                max = Math.max(max, h * w);
            }
        }
        return max;
    }
}