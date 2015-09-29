package utilityclasses;

/**
 * Created by Sigora on 06.05.2015.
 */
public class DoublyLinkedList {
    public DoublyLinkedList(Object data){
        this.data = data;
    }

    public DoublyLinkedList prevNode;
    public DoublyLinkedList nextNode;
    public Object data;

    public static DoublyLinkedList getTestLinkedList(){
        DoublyLinkedList list1 = new DoublyLinkedList("a1");
        DoublyLinkedList list2 = new DoublyLinkedList("a2");
        DoublyLinkedList list3 = new DoublyLinkedList("a3");
        DoublyLinkedList list4 = new DoublyLinkedList("a4");
        DoublyLinkedList list5 = new DoublyLinkedList("a5");
        DoublyLinkedList list6 = new DoublyLinkedList("a6");
        DoublyLinkedList list7 = new DoublyLinkedList("a7");
        DoublyLinkedList list8 = new DoublyLinkedList("a8");
        DoublyLinkedList list9 = new DoublyLinkedList("a9");
        DoublyLinkedList list10 = new DoublyLinkedList("a10");

        list1.push(list1, list2);
        list1.push(list2, list3);
        list1.push(list3, list4);
        list1.push(list4, list5);
        list1.push(list5, list6);
        list1.push(list6, list7);
        list1.push(list7, list8);
        list1.push(list8, list9);
        list1.push(list9, list10);
        list1.push(list10, null);

        return list1;
    }

    private void push(DoublyLinkedList prevNode, DoublyLinkedList nextNode){
        if (prevNode != null)
            prevNode.nextNode = nextNode;
        if(nextNode != null)
            nextNode.prevNode = prevNode;
    }

    public static void printLinkedList(DoublyLinkedList firstNode){
        while(firstNode != null){
            System.out.print(firstNode.data + " | ");
            firstNode = firstNode.nextNode;
        }
    }
}
