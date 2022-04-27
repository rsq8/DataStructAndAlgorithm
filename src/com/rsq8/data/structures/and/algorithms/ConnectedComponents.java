package com.rsq8.data.structures.and.algorithms;

import java.util.LinkedList;

public class ConnectedComponents {
    private boolean[] visited;
    private int[] id;
    private int count;

    public ConnectedComponents(Graph G){
        this.visited = new boolean[G.getV()];
        this.id = new int[G.getV()];
        this.count = 0;
        for (int i = 0; i < G.getV(); i++){
            if(!visited[i]){
                dfs(G, i);
                count++;
            }
        }
    }

    private void dfs(Graph G, int v){
        visited[v] = true;
        id[v] = count;
        LinkedList adj = G.adj(v);
        for (int i = 0; i < adj.size(); i++){
            int w = (int)adj.get(i);
            if(!visited[w]){
                dfs(G, w);
            }
        }
    }

    public void print(){
        for (int i = 0; i < id.length; i++){
            System.out.format("component: %d, group: %d%n", i, id[i]);
        }
    }

}
