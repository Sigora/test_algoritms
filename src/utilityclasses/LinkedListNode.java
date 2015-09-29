package utilityclasses;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Sigora on 05.05.2015.
 */
public class LinkedListNode {

    public LinkedListNode(LinkedListNode nextNode, Object data){
        this.data = data;
        this.nextNode = nextNode;
    }

    public LinkedListNode nextNode;
    public Object data;

    public static LinkedListNode getTestLinkedList(){
        LinkedListNode node10 = new LinkedListNode(null,"a10");
        LinkedListNode node9 = new LinkedListNode(node10,"a9");
        LinkedListNode node8 = new LinkedListNode(node9,"a8");
        LinkedListNode node7 = new LinkedListNode(node8,"a7");
        LinkedListNode node6 = new LinkedListNode(node7,"a6");
        LinkedListNode node5= new LinkedListNode(node6,"a5");
        LinkedListNode node4 = new LinkedListNode(node5,"a4");
        LinkedListNode node3 = new LinkedListNode(node4,"a3");
        LinkedListNode node2 = new LinkedListNode(node3,"a2");
        LinkedListNode node1 = new LinkedListNode(node2,"a1");

        return node1;
    }

    public static void printLinkedList(LinkedListNode firstNode){
        while(firstNode != null){
            System.out.print(firstNode.data + " | ");
            firstNode = firstNode.nextNode;
        }
    }
}
