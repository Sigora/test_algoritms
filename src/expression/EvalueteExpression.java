package expression;

import java.util.Stack;

/**
 * Created by Sigora on 27.08.2015.
 */
public class EvalueteExpression {
    public static void main(String[] args) {
        System.out.println(EvalueteExpression.evaluate("10 * 2 + 6 + 6"));
        System.out.println(EvalueteExpression.evaluate("100 * 2 + 12"));
        System.out.println(EvalueteExpression.evaluate("100 * ( 2 + 12 )"));
        System.out.println(EvalueteExpression.evaluate("100 * ( 2 + 12 ) / 14"));
        System.out.println(EvalueteExpression.evaluate("100 - ( 2 + 12 ) / 14"));
    }


    public static long evaluate(String expression){
        Stack<Long> numbers = new Stack<>();
        Stack<Character> operation = new Stack<>();

        for(int i = 0; i < expression.length(); i++) {

            char [] tokens = expression.toCharArray();

            if(tokens[i] == ' '){
                continue;
            }

            if(isNumber(tokens[i])){
                StringBuffer buf = new StringBuffer();
                while (i < expression.length() && isNumber(tokens[i])){
                    buf.append(tokens[i]);
                    i++;
                }
                numbers.push(Long.parseLong(buf.toString()));
            }
            else if(tokens[i] == '('){
                operation.push(tokens[i]);
            }
            else if (isOperator(tokens[i])){
                while(!operation.isEmpty() && hasPrecedence(tokens[i],operation.peek())) {
                    numbers.push(evaluate(numbers.pop(),numbers.pop(),operation.pop()));
                }
                operation.push(tokens[i]);
            } else if (tokens[i] == ')'){
                while(operation.peek() != '(') {
                    numbers.push(evaluate(numbers.pop(),numbers.pop(),operation.pop()));
                }
                operation.pop();
            }

        }

        while(!operation.empty()){
            numbers.push(evaluate(numbers.pop(),numbers.pop(),operation.pop()));
        }

        return  numbers.pop();
    }

    public static boolean hasPrecedence(char op1, char op2)
    {
        if (op2 == '(' || op2 == ')')
            return false;
        if ((op1 == '*' || op1 == '/') && (op2 == '+' || op2 == '-'))
            return false;
        else
            return true;
    }

    public static Long evaluate(Long value1, Long value2, char operand){
        switch (operand){
            case '+':
                return value2 + value1;
            case '-':
                return value2 - value1;
            case '*':
                return value2 * value1;
            case '/':
                if(value2 == 0) throw  new UnsupportedOperationException("Cannot divide by zero");
                return value2 / value1;
        }

        return 0L;
    }

    public static boolean isNumber(char symbol){
        if(symbol >= '0' && symbol <= '9'){
            return true;
        }

        return false;
    }

    public static boolean isOperator(char symbol){
        if (symbol == '*' || symbol == '/' || symbol == '+' || symbol == '-'){
            return true;
        }

        return false;
    }

}
