class Solution {
    public boolean isPalindrome(String s) {
        if(s== null || s.length()==0) return false;
        int left=0;
        int right=s.length()-1;
        while(left<=right){
            while(left<right && !isAlphaNumeric(s.charAt(left))){
                left++;
            }
            while(left<right && !isAlphaNumeric(s.charAt(right))){
                right--;
            }

            if(Character.toLowerCase(s.charAt(left))!=Character.toLowerCase(s.charAt(right))){
                    return false;
            }
            left++;
            right--;
        }
        return true;
        
    }
    private boolean isAlphaNumeric(char ch){
        return (ch>='A' && ch<='Z') || (ch>='a' && ch<='z') ||(ch>='0' && ch<='9');
    }
}
