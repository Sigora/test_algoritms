package algoritms.linkedlists;

import java.util.*;

/**
 * Created by starnakin on 02.10.2015.
 */
public class SummNumbersInTwoLinkedLists {
    static LinkedList<Integer> list1 = new LinkedList(Arrays.asList(9,2,3));
    static LinkedList<Integer> list2 = new LinkedList(Arrays.asList(4,6));
    static LinkedList<Integer> list3 = new LinkedList(Arrays.asList(2,5,1));

    static Stack<Integer> stack1 = new Stack();
    static Stack<Integer> stack2 = new Stack();

    public static void main(String[] args) {
        System.out.println(sumLinkedListNumbers(list1, list2, list3));
    }

    private static List<Integer> sumLinkedListNumbers(LinkedList<Integer> ... lists){
        LinkedList<Integer> result = new LinkedList<>();


        List<Stack<Integer>> listOfStacks = new LinkedList<>();
        for(LinkedList<Integer> list : lists){
            Stack<Integer> stack = new Stack<>();
            Iterator<Integer> iter = list.iterator();
            while(iter.hasNext()){
                stack.push(iter.next());
            }
            listOfStacks.add(stack);
        }

        boolean allListsIsEmpty = false;
        int incr = 0;
        while(!allListsIsEmpty){
            allListsIsEmpty = true;
            int sum = 0;
            for(Stack<Integer> stack : listOfStacks){
                allListsIsEmpty &= stack.isEmpty();
                if(!stack.isEmpty()){
                    sum += stack.pop();
                }
            }
            if(sum + incr > 9){
                result.push((sum + incr) % 10);
                incr = ((sum + incr) - ((sum + incr) % 10))/10;
            }
            else{
                result.push(sum + incr);
                incr = 0;
            }
        }

        return result;
    }
}
