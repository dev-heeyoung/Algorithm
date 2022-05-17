class Solution {
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> (Math.abs(a[0] * a[0]) + Math.abs(a[1] * a[1])) - (Math.abs(b[0] *b[0]) + Math.abs(b[1] * b[1])));
        
        for (int[] point: points) {
            pq.offer(point);
        }
        
        int[][] result = new int[k][];
        for (int i=0; i<k; i++) {
            result[i] = pq.poll();
        }
        
        return result;
    }
}