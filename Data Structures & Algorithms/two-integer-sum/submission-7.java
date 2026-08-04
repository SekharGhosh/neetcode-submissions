class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> indices =  new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int matchedNum = target-nums[i];
            if(indices.containsKey(matchedNum)){
                return new int[]{indices.get(matchedNum),i};
            }
            indices.put(nums[i],i);
        }
        return new int[]{};
    }
}
