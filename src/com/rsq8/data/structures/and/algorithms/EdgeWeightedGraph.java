package com.rsq8.data.structures.and.algorithms;

import java.util.TreeSet;

public class EdgeWeightedGraph {
    private final int V;
    private int E;
    private TreeSet<Edge>[] adj;

    public EdgeWeightedGraph(int v){
        this.V = v;
        this.E = 0;
        this.adj = (TreeSet<Edge>[]) new TreeSet[v];
        for (int i = 0; i < v; i++){
            adj[i] = new TreeSet<Edge>();
        }
    }

    public int getV() {
        return V;
    }

    public int getE() {
        return E;
    }

    public void addEdge(Edge e){
        int v = e.either();
        int w = e.other(v);

        adj[v].add(e);
        adj[w].add(e);
        E++;
    }

    public Iterable<Edge> adj(int v){
        return adj[v];
    }

    public Iterable<Edge> edges(){
        TreeSet<Edge> tree = new TreeSet<>();
        for (int i = 0; i < V; i++){
            for (Edge e: adj[i]){
                if (e.other(i) > i) tree.add(e);
            }
        }
        return tree;
    }
}
