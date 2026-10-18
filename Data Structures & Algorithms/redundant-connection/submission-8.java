class DSU{
    int[] parent;
    int[] size;

    public DSU( int num) {
        parent = new int[num];
        size = new int[num];

        for(int i=0; i<num; i++){
            parent[i] = i;
            size[i] = 1;
        }
    }

    public int find(int n){
        if(parent[n]!=n)
            parent[n] = find(parent[n]);

        return parent [n];
    }

    public boolean union(int n1, int n2){
        int p1 = find(n1);
        int p2 = find(n2);
        System.out.println("p1: " + p1 + " n1: "+n1);
        System.out.println("p2: " + p2 + " n2: "+n2);
        if(p1 == p2)
            return false;
        if(size[p1]>=size[p2]){
            parent[p2] = parent[p1];
            size[p1] += size[p2];
        }else{
            parent[p1] = parent[p2];
            size[p2] += size[p1];
        }
        return true;
    }

    /* public boolen isConnected(int n1, int n2){
        return parent[n1] == parent[n2];
    } */
}


class Solution {
    public int[] findRedundantConnection(int[][] edges) {
        DSU dsu = new DSU(edges.length+1);

        for(int[] e : edges){
            if(!dsu.union(e[0], e[1]))
                return new int[]{e[0], e[1]};


        }

        return new int[0];
        
    }
}
