class Solution {
    public static int evalRPN(String[] tokens) {
        Stack<String> stack = new Stack<>();
        for (String s : tokens) {
            if (!s.equals("+") && !s.equals("-") && !s.equals("*") && !s.equals("/")) {
                stack.push(s);
            } else {
                if (s.equals("+")) {
                    int sum = Integer.parseInt(stack.pop()) + Integer.parseInt(stack.pop());
                    stack.push(Integer.toString(sum));
                } else if (s.equals("-")) {
                    int first = Integer.parseInt(stack.pop());
                    int second = Integer.parseInt(stack.pop());
                    int diff = second - first;
                    stack.push(Integer.toString(diff));
                } else if (s.equals("*")) {
                    int prod = Integer.parseInt(stack.pop()) * Integer.parseInt(stack.pop());
                    stack.push(Integer.toString(prod));
                } else if (s.equals("/")) {
                    int first = Integer.parseInt(stack.pop());
                    int second = Integer.parseInt(stack.pop());
                    int div = second / first;
                    stack.push(Integer.toString(div));
                }
            }
        }

        return Integer.parseInt(stack.pop());
    }
}