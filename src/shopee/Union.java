package shopee;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.*;

public class Union {
    public static void main(String[] args) {
        int[][] isConnected = {{1,1,0},{1,1,0},{0,0,1}};
        UnionFind un = new UnionFind(isConnected.length);
        for(int i = 0; i < isConnected.length; i++){
            for(int j = i+1; j < isConnected[i].length; j++){
                if(isConnected[i][j] == 1){
                    un.union(i,j);
                }
            }
        }
        System.out.println(un.size);
    }
}

class UnionFind{
    int[] root;
    int size;
    public UnionFind(int n) {
        root = new int[n];
        for(int i = 0; i < n; i++){
            root[i] = i;
        }
        size = n;
    }
    public int find(int i){
        if(i == root[i]){
            return i;
        }
        return root[i] = find(root[i]);
    }
    public void union(int p,int q){
        int rootp = find(p);
        int rootq = find(q);
        if(rootp != rootq){
            root[p] = rootq;
            size--;
        }
    }
}
