class Solution {
    public boolean isValid(String s) {
        
        if(s == null || s.isEmpty()) return false;

        char [] arr=s.toCharArray();
        Deque<Character> stack = new ArrayDeque<>();
        for(int i=0;i<arr.length;i++){
            if(arr[i]=='{' || arr[i]=='(' || arr[i]=='['){
                stack.push(arr[i]);
            }else{
                if(stack.isEmpty()){
                    return false;
                }
                char top = stack.pop();
                if((arr[i] == ')' && top != '(') || 
                   (arr[i] == ']' && top != '[') || 
                   (arr[i] == '}' && top != '{')) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
