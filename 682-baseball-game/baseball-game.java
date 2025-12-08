class Solution {
    public int calPoints(String[] ops) {

        Stack<Integer> stack = new Stack<>();

        for (String op : ops) {

            if (op.equals("C")) {
                stack.pop();
            }
            else if (op.equals("D")) {
                stack.push(stack.peek() * 2);
            }
            else if (op.equals("+")) {
                int last = stack.pop();
                int secondLast = stack.peek();
                stack.push(last); 
                stack.push(last + secondLast);
            }
            else {
                stack.push(Integer.parseInt(op));
            }
        }

        int sum = 0;
        for (int x : stack) sum += x;

        return sum;
    }
}