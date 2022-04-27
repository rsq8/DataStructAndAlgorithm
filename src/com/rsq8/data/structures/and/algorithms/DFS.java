package com.rsq8.data.structures.and.algorithms;

import java.util.LinkedList;
public class DFS {
    private boolean[] visited;
    private int[] edgeTo;
    private final int s;
    private LinkedQueue item;

    public DFS(Graph G, int s){
        this.item = new LinkedQueue();
        this.s = s;
        this.edgeTo = new int[G.getV()];
        visited = new boolean[G.getV()];
        dfs(G, s);
        /*for (int i = 0; i < G.getV(); i++){
            if(!visited[i]){
                dfs(G, i);
            }
        }
        while(!item.isEmpty()){
            System.out.print(item.remove() + ", ");
        }*/
    }

    private void dfs(Graph G, int v){
        visited[v] = true;
        item.add(v);
        LinkedList adj = G.adj(v);
        for (Object o : adj) {
            int w = (int) o;
            if (!visited[w]) {
                edgeTo[w] = v;
                dfs(G, w);
            }
        }
        //item.add(v);
    }

    public void print(){
        while(!item.isEmpty()){
            System.out.format("%d, ", item.remove());
        }
    }

}
