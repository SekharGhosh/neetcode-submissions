class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        if(nums.length==0 || k<=0)  
        return new int[0];
        int[]res = new int[k];
        Map<Integer,Integer> countMap = new HashMap<>();
        for(int n: nums){
            countMap.put(n,countMap.getOrDefault(n,0)+1);
        }

        PriorityQueue<Map.Entry<Integer,Integer>> minHeap = new PriorityQueue<>(Comparator.comparingInt(Map.Entry::getValue));

        for(Map.Entry<Integer,Integer> entry: countMap.entrySet()){
            minHeap.offer(entry);
            if(minHeap.size()>k){
                minHeap.poll();
            }
        }
        for(int i=k-1;i>=0;i--){
            res[i]=minHeap.poll().getKey();
        }
        return res;
    }
}
