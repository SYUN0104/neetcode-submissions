class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

        for(int i : stones){
            maxHeap.add(i);
        }

        while(maxHeap.size() > 1){
            int x = maxHeap.poll();
            int y = maxHeap.poll();

            maxHeap.add(Math.abs(x - y));
        }
        return maxHeap.isEmpty() ? 0 : maxHeap.poll();
    }
}
