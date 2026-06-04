class Solution {
    public boolean validTree(int n, int[][] edges) {
        if(edges.length != n-1) return false;
        UF uf = new UF(n);
        for(int[] e: edges){
            int n1 = e[0], n2 = e[1];
            if(uf.find(n1) == uf.find(n2)) return false;
            uf.merge(n1,n2);
            
        }
      return true;  

    }

    class UF {
    int[] arr;
    int n;

    UF(int n) {
        this.n = n;
        arr = new int[n];
        Arrays.fill(arr, -1);
    }

    int find(int a) {
        if (arr[a] == -1) return a;
        return arr[a] = find(arr[a]); // path compression
    }

    void merge(int a, int b) {
        int para = find(a);
        int parb = find(b);
        if (para == parb) return;
        arr[para] = parb;
    }
}
}
