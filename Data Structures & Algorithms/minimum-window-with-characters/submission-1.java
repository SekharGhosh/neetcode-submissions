class Solution {
    public String minWindow(String s, String t) {
        
        if(s==null || t == null || s.length()< t.length()){
            return "";
        }
        int required[] = new int[128];

        for(char c: t.toCharArray()){
            required[c]++;
        }

        int left = 0,right = 0;
        int tLength = t.length();
        int minLength = Integer.MAX_VALUE;
        int minStart =0;

        while(right < s.length()){
            char rightChar = s.charAt(right);
            if(required[rightChar]>0){
                tLength--;
            }
            required[rightChar]--;
            right++;

            while(tLength == 0){
                
                if(right - left < minLength){
                    minLength = right -left;
                    minStart = left;
                }
                char leftChar = s.charAt(left);
                required[leftChar]++;
                if(required[leftChar] > 0){
                    tLength++;
                }
                left++;
            }
        }
        return minLength == Integer.MAX_VALUE
        ? ""
        : s.substring(minStart, minStart + minLength);

    }
}
