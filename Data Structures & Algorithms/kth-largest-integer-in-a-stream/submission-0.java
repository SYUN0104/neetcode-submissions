class KthLargest {
    private PriorityQueue<Integer> minHeap;
    private int k;

    public KthLargest(int k, int[] nums) {
        this.k = k;
        this.minHeap = new PriorityQueue<>(k);

        for(int i : nums){
            this.minHeap.add(i);
            if(this.minHeap.size() > k){
                this.minHeap.poll();
            }
        }
    }

    public int add(int val) {
        minHeap.add(val);
        if(minHeap.size() > k){
            minHeap.poll();
        }

        return minHeap.peek();
    }
}
