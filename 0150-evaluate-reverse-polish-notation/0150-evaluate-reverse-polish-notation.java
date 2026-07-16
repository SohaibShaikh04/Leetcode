class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st = new Stack<>();

        for(String token : tokens){
            if(!(token.equals("+")) && !(token.equals("-")) &&
               !(token.equals("*")) && !(token.equals("/")))
               {
                    st.push(Integer.parseInt(token));
               } // push the value if its not an operator 

            else
            {
                int b = st.pop(); // stack top pe right operand aaega as per algorithm
                int a = st.pop();

                 if (token.equals("+")) {
                    st.push(a + b);
                } 
                else if (token.equals("-")) {
                    st.push(a - b);
                } 
                else if (token.equals("*")) {
                    st.push(a * b);
                } 
                else {
                    st.push(a / b);
                }

                }

            }
            return st.pop();
        }
    }