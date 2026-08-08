class Solution {
    public int[] findOrder(int V, int[][] edges) {
        List<List<Integer>> adj = new ArrayList<>();
        int[] inDeg = new int[V];
        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }
        for (int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];
            adj.get(u).add(v);
            inDeg[v]++;
        }
        Queue<Integer> q = new LinkedList<>();
        for (int i = 0; i < inDeg.length; i++) {
            if (inDeg[i] == 0) {
                q.add(i);
            }
        }
        int[] arr = new int[V];
        int k = 0;
        while (!q.isEmpty()) {
            int rem = q.remove();
            arr[k++] = rem;
            for (int ngbr : adj.get(rem)) {
                inDeg[ngbr]--;
                if (inDeg[ngbr] == 0) {
                    q.add(ngbr);
                }
            }
        }

        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
        if(arr.length>=2 && arr[0]==arr[1]){
            return new int[]{};
        }

        return arr;
    }
}
