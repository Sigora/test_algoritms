package algoritms.graph;

import java.util.LinkedList;

/**
 * Created by starnakin on 05.10.2015.
 */
public class CheckIfThereIsCycleInGraph {

    private static class Graph{
        int vNumber;
        LinkedList<Integer> [] vectorsArray;

        public Graph(int vNumber){
            this.vNumber = vNumber;
            vectorsArray = new LinkedList[vNumber];
        }

        public void addEdge(int v, int n){
            vectorsArray[v].addLast(n);
        }
    }

    public static void main(String[] args) {
        Graph graph = new Graph(4);
        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 2);
        graph.addEdge(2, 0);
        graph.addEdge(2, 3);
        graph.addEdge(3, 3);


    }


}
