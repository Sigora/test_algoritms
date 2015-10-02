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
        Iterator<Integer> it1 = list1.iterator();
        while(it1.hasNext()){
            stack1.push(it1.next());
        }
        Iterator<Integer> it2 = list2.iterator();
        while(it2.hasNext()){
            stack2.push(it2.next());
        }

        LinkedList<Integer> result = new LinkedList();
        Integer val1 = 0;
        Integer val2 = 0;
        Integer incr = 0;
        while(!stack1.isEmpty() || !stack2.isEmpty()){

            if(!stack1.isEmpty()){
                val1 = stack1.pop();
            }
            if(!stack2.isEmpty()){
                val2 = stack2.pop();
            }

            if(val1 + val2 + incr > 9){
                result.push(val1 + val2 + incr - 10);
                incr = 1;
            }
            else{
                result.push(val1 + val2 + incr);
                incr = 0;
            }
        }

        System.out.println(result.toString());
    }

    private List<Integer> sumLinkedListNumbers(LinkedList<Integer> ... lists){
        LinkedList<Integer> result = new LinkedList<>();
        boolean allListsIsEmpty = false;

        List<Stack<Integer>> listOfStacks = new LinkedList<>();
        for(LinkedList list : lists){
            Stack
        }

        int incr = 0;
        while(!allListsIsEmpty){
            allListsIsEmpty = true;
            int sum = 0;
            for(LinkedList<Integer> list : lists){
                allListsIsEmpty &= list.isEmpty();
                if(!list.isEmpty()){
                    sum += list.iterator().next();
                }
            }
            if(sum + incr > 9){
                result.push((sum + incr) % 10);
                incr = (sum + incr) - (sum + incr) % 10;
            }
            else{
                result.push(sum + incr);
                incr = 0;
            }
        }

        return result;
    }
}
