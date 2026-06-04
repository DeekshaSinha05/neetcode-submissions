class Solution {
    public int countComponents(int n, int[][] edges) {
        int count =n;
        UF uf = new UF(n);
        for(int[] e: edges){
            int a = e[0];
            int b = e[1];

            if(uf.find(a)!= uf.find(b)) {
                count--;
                uf.merge(a,b);
            }

        }

        return count;
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
            if (arr[a] == -1 ) return a;
            return arr[a] = find(arr[a]);
        }

        public void merge(int a, int b){
            int paraA = find(a);
            int paraB = find(b);
            if(paraA == paraB) return;
            arr[paraA] = paraB;
        }

    }
