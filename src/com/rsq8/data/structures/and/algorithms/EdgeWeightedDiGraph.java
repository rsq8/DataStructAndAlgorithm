package com.rsq8.data.structures.and.algorithms;

import java.util.TreeSet;

public class EdgeWeightedDiGraph {
    private final int V;
    private int E;
    private TreeSet<DirectedEdge>[] adj;

    public EdgeWeightedDiGraph(int v){
        this.V = v;
        this.E = 0;
        this.adj = new TreeSet[v];
        for (int i = 0; i < v; i++){
            adj[i] = new TreeSet<>();
        }
    }

    public int getV() {
        return V;
    }

    public int getE() {
        return E;
    }

    public void addEdge(DirectedEdge e){
        adj[e.from()].add(e);
        E++;
    }

    public Iterable<DirectedEdge> adj(int v){
        return adj[v];
    }

    public Iterable<DirectedEdge> edges(){
        TreeSet<DirectedEdge> tree = new TreeSet<>();
        for (int i = 0; i < V; i++){
            for (DirectedEdge e: adj[i]){
                tree.add(e);
            }
        }
        return tree;
    }
}
