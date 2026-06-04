class Solution {
    public int[] findRedundantConnection(int[][] edges) {
        int n = edges.length+1;
        UF uf = new UF(n);
        for (int[] e: edges){
            int a = e[0];
            int b = e[1];

            if(uf.find(a) == uf.find(b)) return e;

            uf.merge(a,b);
        }
        return new int[0];
    }
}
    class UF{
        int n;
        int[] arr;

        public UF(int n){
            this.n = n;
            arr = new int[n];
            Arrays.fill(arr, -1);
        }

     public int find(int a){
            if(arr[a] == -1) return a;
            return arr[a] = find(arr[a]);  
        }

     public void merge(int a, int b){
            int paraA = find(a);
            int paraB = find(b);

            if(paraA == paraB) return;
            arr[paraA] = paraB;
        }

    }

