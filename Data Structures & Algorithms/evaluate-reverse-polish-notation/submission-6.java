class Solution {
        public int evalRPN(String[] tokens) {

                Stack<Integer> stack = new Stack<>();

                        for (String s : tokens) {

                                    if (!s.equals("+") &&
                                                    !s.equals("-") &&
                                                                    !s.equals("*") &&
                                                                                    !s.equals("/")) {

                                                                                                    stack.push(Integer.parseInt(s));

                                                                                                                } else {

                                                                                                                                int first = stack.pop();
                                                                                                                                                int second = stack.pop();

                                                                                                                                                                if (s.equals("+")) {
                                                                                                                                                                                    stack.push(second + first);

                                                                                                                                                                                                    } else if (s.equals("-")) {
                                                                                                                                                                                                                        stack.push(second - first);

                                                                                                                                                                                                                                        } else if (s.equals("*")) {
                                                                                                                                                                                                                                                            stack.push(second * first);

                                                                                                                                                                                                                                                                            } else {
                                                                                                                                                                                                                                                                                                stack.push(second / first);
                                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                                                                    }

                                                                                                                                                                                                                                                                                                                                            return stack.pop();
                                                                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                                                                }