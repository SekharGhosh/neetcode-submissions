class Solution {
    public int longestConsecutive(int[] nums) {
        
        if(nums==null || nums.length==0) return 0;

        Set<Integer> set = new HashSet<>();
        for(int a: nums){
            set.add(a);
        }
        int longest=0;

        for(int n: set){
            if(!set.contains(n-1)){
                int curr=n;
                int currLen=1;
                while(set.contains(curr+1)){
                    curr++;
                    currLen++;
                }
                longest = Math.max(longest,currLen);
            }
        }
        return longest;
    }
}
