package com.rsq8.data.structures.and.algorithms;

import java.util.LinkedList;
import java.util.Stack;

public class TopologicalSort {
    private Graph G;
    private int s;
    Stack<Object> sort;
    boolean[] visited;

    public TopologicalSort(Graph g, int s){
        this.G = g;
        this.s = s;
        this.visited = new boolean[G.getV()];
        this.sort = new Stack<>();
        //dfs(g, s);
        for (int i = 0; i < G.getV(); i++){
            if(!visited[i]){
                dfs(g, i);
            }
        }
        while(!sort.isEmpty()){
            System.out.print(sort.pop() + ", ");
        }
    }

    private void dfs(Graph g, int v){
        visited[v] = true;
        LinkedList adj = g.adj(v);
        for (Object o : adj) {
            int w = (int) o;
            if (!visited[w]) {
                dfs(g, w);
            }
        }
        sort.push(v);
    }

    public void print(){
        while(!sort.isEmpty()){
            System.out.format("%d, ", sort.pop());
        }
    }
}
