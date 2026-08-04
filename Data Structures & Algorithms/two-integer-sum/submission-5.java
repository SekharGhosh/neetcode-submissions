class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        Map<Integer,Integer> indices =  new HashMap<>();

        for(int i=0;i<nums.length;i++){

            int cmplmnt = target - nums[i] ;
            if(indices.containsKey(cmplmnt)){
                return new int[]{indices.get(cmplmnt),i};
            }
            indices.put(nums[i],i);
        }
        return new int[]{};
       
    }
}
