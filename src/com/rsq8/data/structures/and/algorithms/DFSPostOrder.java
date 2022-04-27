package com.rsq8.data.structures.and.algorithms;

import java.util.LinkedList;

public class DFSPostOrder {
    private Graph G;
    private int s;
    boolean[] visited;
    LinkedQueue item;

    public DFSPostOrder(Graph g, int s){
        this.G = g;
        this.s = s;
        this.visited = new boolean[G.getV()];
        this.item = new LinkedQueue();
        //dfs(g, s);
        for (int i = 0; i < G.getV(); i++){
            if(!visited[i]){
                dfs(g, i);
            }
        }
        while(!item.isEmpty()){
            System.out.print(item.remove() + ", ");
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
        item.add(v);
    }

    public void print(){
        while(!item.isEmpty()){
            System.out.format("%d, ", item.remove());
        }
    }

}
