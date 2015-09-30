package algoritms.linkedlists;

import org.testng.annotations.Test;
import algoritms.utilityclasses.LinkedListNode;


import static org.testng.Assert.assertEquals;
import static algoritms.utilityclasses.LinkedListNode.*;
import static java.lang.System.*;

/**
 * Created by Sigora on 05.05.2015.
 */
public class GetNthElementOfLinkedList {
    public static void main(String[] args) {
        LinkedListNode node = getTestLinkedList();

        out.print("List - >");
        printLinkedList(node);
        int index = 5;
        out.print("value at " + index + " = " + getNth(node, index));
    }

    public static Object getNth(LinkedListNode firstNode, int index){
        int counter = 1;
        while(true){
            if(firstNode == null)
                return null;
            if(index == counter )
                return firstNode.data;

            firstNode = firstNode.nextNode;
            counter ++;
        }
    }

    public static Object getNth2(LinkedListNode node, int index){
        Object value;
        int counter = 1;
        while(node != null){
            if(counter == index){
                return node.data;
            }
        }

        return null;
    }

    @Test
    public void testGetNth() throws Exception {
        assertEquals("a5", getNth(getTestLinkedList(), 5));
        assertEquals("a7", getNth(getTestLinkedList(), 7));
        assertEquals(null, getNth(getTestLinkedList(), 11));
        assertEquals(null, getNth(null, 4));
    }

    @Test
    public void testGetNth2() throws Exception {
        assertEquals("a5", getNth2(getTestLinkedList(), 5));
        assertEquals("a7", getNth2(getTestLinkedList(), 7));
        assertEquals(null, getNth2(getTestLinkedList(), 11));
        assertEquals(null, getNth2(null, 4));
    }
}
