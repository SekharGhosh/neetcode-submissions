class Solution {
    public int characterReplacement(String s, int k) {
        
        int  left = 0, maxf = 0;
        int res =0;
        Map<Character,Integer> map = new HashMap<>();

        for(int r=0;r<s.length();r++){
            char key = s.charAt(r);
            map.put(key,map.getOrDefault(key,0)+1);
            maxf = Math.max(maxf,map.get(key));
            while((r-left+1)-maxf > k){
                map.put(s.charAt(left),map.get(s.charAt(left))-1);
                left++;
            }

            res = Math.max(res,r-left+1);
        }
        return res;
    }
}
