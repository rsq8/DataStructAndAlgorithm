package com.rsq8.data.structures.and.algorithms;

import java.util.LinkedList;

public class BFS {
    private boolean[] visited;
    private Graph G;
    private int s;
    private LinkedList<Integer> items;

    public BFS(Graph g, int s){
        this.G = g;
        this.s = s;
        this.visited = new boolean[G.getV()];
        this.items = new LinkedList<>();
        bfs(g, s);
    }

    private void bfs(Graph g, int s){
        LinkedQueue q = new LinkedQueue();
        visited[s] = true;
        q.add(s);
        while (!q.isEmpty()){
            int v = (int)q.remove();
            items.add(v);
            LinkedList<Integer> adj = g.adj(v);
            for (int w : adj) {
                if (!visited[w]) {
                    visited[w] = true;
                    q.add(w);
                    //items.add(w);
                }
            }
        }
    }

    public void print(){
        for (Integer item : items) {
            System.out.print(item + ", ");
        }
    }
}
