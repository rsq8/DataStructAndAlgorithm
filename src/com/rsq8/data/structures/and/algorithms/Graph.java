package com.rsq8.data.structures.and.algorithms;

import java.util.LinkedList;

public class Graph {
    private final int V;
    private final LinkedList<Integer>[] adj;

    public Graph(int v){
        this.V = v;
        adj = new LinkedList[V];
        for (int i = 0; i < V; i++){
            adj[i] = new LinkedList<>();
        }
    }

    public void addEdge(int v, int w){
        adj[v].add(w);
        adj[w].add(v);
    }

    public void addDirectedEdge(int v, int w){
        adj[v].add(w);
    }

    public int getV() {
        return V;
    }

    public LinkedList<Integer> adj(int v){
        return adj[v];
    }
}
