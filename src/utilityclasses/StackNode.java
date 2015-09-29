package utilityclasses;

/**
 * Created by Sigora on 05.07.2015.
 */
public class StackNode {
    private Object value;
    private StackNode nextElement;

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }

    public StackNode getNextElement() {
        return nextElement;
    }

    public void setNextElement(StackNode nextElement) {
        this.nextElement = nextElement;
    }
}
