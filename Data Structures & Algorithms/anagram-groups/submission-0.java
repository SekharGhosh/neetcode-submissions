class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if(strs.length==0) return null;

        Map<String,List<String>> anagraMap= new HashMap<>();

        for(String str: strs){
            char[]words = str.toCharArray();
            Arrays.sort(words);
            String sortedStr = new String(words);
            anagraMap.computeIfAbsent(sortedStr,k -> new ArrayList<>()).add(str);

        }
        return new ArrayList<>(anagraMap.values());

    }
}
