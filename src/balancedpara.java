import java.util.Stack;

public class balancedpara{


public static boolean isBalancedParanthesis(String s) {
	
	
        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else if (c == ')' || c == '}' || c == ']') {
                if (stack.isEmpty()) {
                    return false;
                }

                char top = stack.pop();
                if ((c == ')' && top != '(') ||
                    (c == '}' && top != '{') ||
                    (c == ']' && top != '[')) {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }

    public static void main(String[] args) {
       
    	
    	
    	String input1 = "(){}[]";
        String input2 = "{[()]}";
        String input3 = "{[}]";
        String input4 = "{[(])}";

        System.out.println("Is " + input1 + " balanced? " + isBalancedParanthesis(input1));
        System.out.println("Is " + input2 + " balanced? " + isBalancedParanthesis(input2));
        System.out.println("Is " + input3 + " balanced? " + isBalancedParanthesis(input3));
        System.out.println("Is " + input4 + " balanced? " + isBalancedParanthesis(input4));
    }
}
