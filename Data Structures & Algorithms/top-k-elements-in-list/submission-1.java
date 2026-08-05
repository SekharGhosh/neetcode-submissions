class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int[] res = new int[k];
        List<Integer> keyList =
            Arrays.stream(nums)
                .boxed()
                .collect(Collectors.groupingBy(java.util.function.Function.identity(),Collectors.counting()))
                .entrySet()
                .stream()
                .sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
                .limit(k)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());

        for (int i = 0; i < keyList.size(); i++) {
            res[i] = keyList.get(i);
        }
        return res;
    }
}