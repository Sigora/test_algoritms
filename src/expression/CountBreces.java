package expression;

import java.util.Stack;

/**
 * Created by Sigora on 28.08.2015.
 */
public class CountBreces {

    public static void main(String[] args) {
        System.out.println(isExpressionCorrect("(((}}}"));
        System.out.println(isExpressionCorrect("((()))"));
        System.out.println(isExpressionCorrect("([()])"));
    }

    public static String isExpressionCorrect(String expression){
        char [] tokens = expression.toCharArray();

        Stack<Character> charStack = new Stack<>();

        for(int i = 0; i < tokens.length; i++){

            if(tokens[i] != '(' && tokens[i] != '{' && tokens[i] != ')' && tokens[i] != '}'
                    && tokens[i] != '[' && tokens[i] != ']'){
                continue;
            }

            if(tokens[i] == '(' || tokens[i] == '{' || tokens[i] == '['){
                charStack.push(tokens[i]);
            }

            if(tokens[i] == ')'){
                if(charStack.peek() == '('){
                    charStack.pop();
                }
                else{
                    return "Brace " + charStack.peek() + " was found instead '('";
                }
            }

            if(tokens[i] == '}'){
                if(charStack.peek() == '{'){
                    charStack.pop();
                }
                else{
                    return "Brace " + charStack.peek() + " was found instead '{'";
                }
            }

            if(tokens[i] == ']'){
                if(charStack.peek() == '['){
                    charStack.pop();
                }
                else{
                    return "Brace " + charStack.peek() + " was found instead '['";
                }
            }
        }

        if(charStack.isEmpty())
            return "Expression is correct";
        else
            return "Braces that don't have corresponding values " + charStack.toString();
    }

}
