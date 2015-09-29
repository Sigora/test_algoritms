package linkedlists;

import utilityclasses.DoublyLinkedList;

import static utilityclasses.DoublyLinkedList.*;

/**
 * Created by Sigora on 06.05.2015.
 */
public class RevertLindedList {
    public static void main(String[] args) {
        DoublyLinkedList list = getTestLinkedList();
        printLinkedList(list);
        DoublyLinkedList reversedList = reverceList2(list);
        printLinkedList(reversedList);
    }

    public static DoublyLinkedList reversedList(DoublyLinkedList list){
        DoublyLinkedList nextNode;
        while(list.nextNode != null){
            nextNode = list.nextNode;

            list.nextNode = list.prevNode;
            list.prevNode = nextNode;

            list = nextNode;
        }

        list.nextNode = list.prevNode;
        list.prevNode = null;

        return list;
    }

    public static DoublyLinkedList reverceList2(DoublyLinkedList head){
        DoublyLinkedList temp = null;
        while(head != null){
            temp = head.prevNode;
            head.prevNode = head.nextNode;
            head.nextNode = temp;
            head = head.prevNode;
        }

        if(temp != null)
            return temp.prevNode;
        else
            return head;
    }

}
