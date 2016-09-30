import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    
    public static boolean isBalanced(String expression) {
        Stack<Character> stack = new Stack<Character>();
        for (int i = 0; i < expression.length(); i++) {
            char next = expression.charAt(i);
            
             if (next == '(' || next == '[' || next == '{') {
				stack.push(next );
            }
            
             if (next == ')' || next == ']' || next == '}') {
               
				if(stack.empty()) {
					return false;
				}
				char top = stack.pop();
				if(next == ')' && top != '(') {
					return false;
				}
                if(next == ']' && top != '[') {
					return false;
				}
                 if(next == '}' && top != '{') {
					return false;
				}
			}
        }
        
        if(stack.empty())
			return true;
      
        return false;
     }
  
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++) {
            String expression = in.next();
            boolean answer = isBalanced(expression);
            if(answer)
                System.out.println("YES");
            else System.out.println("NO");
        }
    }
}