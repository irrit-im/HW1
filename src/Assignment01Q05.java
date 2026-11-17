public class Assignment01Q05 {

    public static int findShortestPath(int[][] m, int i, int j) {
        int size = m.length;
        boolean[] exited = new boolean[size];
        int[] reachedQ = new int[size];
        int p = 0;
        int head = -1;
        int[] queued = new int[size]; 
        int node = i;
        while (node != j && head < p) {
            for (int k = 0; k < size; k++) { // add all adjacent to the queue
                if (m[node][k] == 1 && queued[k]==0 && !exited[k]) {
                    reachedQ[p] = k;
                    p++;
                    queued[k] = queued[node] + 1;
                }
            }
            exited[node] = true;
            head++;
            node = reachedQ[head];            //get next node
        } 
        if (node == j) {
            return queued[j];
        } 
        else {
            return -1;
        }
    }

    public static void main(String[] args) {
        System.out.println(
            findShortestPath(new int[][]{{0,0,0}, {0,0,0}, {0,0,0}}, 0, 1)); // -1
        System.out.println(
            findShortestPath(new int[][]{{0,0,0}, {0,0,0}, {0,0,0}}, 1, 1)); // 0
        System.out.println(
            findShortestPath(new int[][]{{0,1,0,0}, {0,0,1,0}, {0,0,0,1}, {1,0,0,0}}, 0, 2)); // 2
        System.out.println(
            findShortestPath(new int[][]{{0,1,0,1}, {0,0,0,1}, {0,0,0,0}, {0,0,1,0}}, 0, 2)); // 2
    }
}