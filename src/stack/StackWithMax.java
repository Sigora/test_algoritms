package stack;

import utilityclasses.Stack;

/**
 * Created by Sigora on 05.07.2015.
 */
public class StackWithMax {

    private Stack elements = new Stack();
    private Stack maxvalues = new Stack();

    private Object maxValue;

    private int length = 0;


    public void push(Object element){
        if(maxValue == null || ((Comparable)element).compareTo(maxValue) > 0){
            maxValue = element;
        }

        elements.push(element);
        maxvalues.push(maxValue);
        length++;
    }

    public Object pop(){
        length --;

        maxvalues.pop();
        return elements.pop();
    }

    public Object getMaxVelue(){
        return maxvalues.peek();
    }

    public int length(){
        return length;
    }

    public static void main(String[] args) {
        StackWithMax node = new StackWithMax();
        node.push(6);
        System.out.println("Max " + node.getMaxVelue());
        node.push(9);
        System.out.println("Max " + node.getMaxVelue());
        node.push(5);
        System.out.println("Max " + node.getMaxVelue());
        node.push(2);
        System.out.println("Max " + node.getMaxVelue());

        for(int i = 0; node.length() > 0; i ++){
            System.out.println("Max " + node.getMaxVelue());
            System.out.println("Element " + node.pop());
        }
        //node.printStack();
    }

}
