package com.rsq8.data.structures.and.algorithms;

public class DirectedEdge implements Comparable<DirectedEdge>{
    private final int v;
    private final int w;
    private final double weight;

    public DirectedEdge(int v, int w, double weight){
        this.v = v;
        this.w = w;
        this.weight = weight;
    }

    public double weight(){
        return weight;
    }

    public int from(){
        return v;
    }

    public int to(){
       return w;
    }

    public String toString(){
        return String.format("%d->%d %.2f", v, w, weight);
    }

    @Override
    public int compareTo(DirectedEdge o) {
        if (this.weight() < o.weight()) return -1;
        else if (this.weight() > o.weight()) return 1;
        return 0;
    }
}
