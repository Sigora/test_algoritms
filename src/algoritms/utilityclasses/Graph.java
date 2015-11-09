package algoritms.utilityclasses;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * Created by Sigora on 27.10.2015.
 */
public class Graph<T> {
    //number of vertexes
    private int v;

    //Array of lists for Adjacency List Representation
    private LinkedList<T> adj[];

    public Graph (int v){
        this.v = v;
        adj = new LinkedList[v];
        for(int i = 0; i < v; i++){
            adj[i] = new LinkedList<T>();
        }
    }

    public void addEdge(int v, T w){
        adj[v].add(w);
    }

    public LinkedList<T> getAdjList(int v){
        return adj[v];
    }

    public int getVertexNumber(){
        return this.v;
    }

}
