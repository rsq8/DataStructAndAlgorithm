package com.rsq8.data.structures.and.algorithms;

//import edu.princeton.cs.algorithms.IndexMinPQ;

public class DijkstraSP {
    private  boolean[] visited;
    private EdgeWeightedDiGraph G;
    private int s;
    private double[] distTo;
    private DirectedEdge[] edgeTo;
    private IndexMinPQ<Double> frontier;

    public DijkstraSP(EdgeWeightedDiGraph G, int s){
        this.G = G;
        this.s = s;
        this.frontier = new IndexMinPQ<Double>(G.getV());
        this.visited = new boolean[G.getV()];
        this.distTo = new double[G.getV()];
        for (int i = 0; i < G.getV(); i++){
            distTo[i] = Double.POSITIVE_INFINITY;
        }
        distTo[s] = 0.0;
        sp(G,s);
    }

    private void sp(EdgeWeightedDiGraph g, int s){
        frontier.insert(s, 0.0);
        while(!frontier.isEmpty()){
            int v = frontier.delMin();
            for(DirectedEdge e: g.edges()){
                int w = e.to();
                double d = e.weight();
                if (e.from() == v){
                    if (distTo[w] == Double.POSITIVE_INFINITY){
                        distTo[w] = distTo[v] + d;
                        frontier.insert(w, distTo[v] + d);
                    } else {
                        if(distTo[v] + d < distTo[w]){
                            frontier.changeKey(w, distTo[v] + d);
                            distTo[w] = distTo[v] + d;
                        }
                    }
                }
            }
            visited[v] = true;
        }
    }

    public double distanceTo(int v){
        return distTo[v];
    }

}
