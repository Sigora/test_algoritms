package algoritms.utilityclasses;

/**
 * Created by Sigora on 05.07.2015.
 */
public class Stack {

    private StackNode headElement;
    private int length = 0;

    public void push(Object value){
        if(headElement == null){
            headElement = new StackNode();
            headElement.setValue(value);
        }
        else{
            StackNode newNode = new StackNode();
            newNode.setValue(value);
            newNode.setNextElement(headElement);
            headElement = newNode;
        }

        length ++;
    }

    public int length(){
        return length;
    }

    public Object pop(){
        StackNode nodeToReturn = headElement;
        headElement = headElement.getNextElement();
        length --;
        return nodeToReturn.getValue();
    }

    public Object peek(){
        if(this.headElement != null)
            return this.headElement.getValue();

        return null;
    }

    public void printStack(){
        StackNode node = headElement;
        while (node != null){
            System.out.println(node.getValue());
            node = node.getNextElement();
        }
    }
}
