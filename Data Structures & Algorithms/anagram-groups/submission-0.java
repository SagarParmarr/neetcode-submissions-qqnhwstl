class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        // since it's all lowercase letters so we can apply this approach
        Map<String, List<String>> sMap = new HashMap<>();
        for(String s : strs) {
            int[] count = new int[26];
            char[] sCharArr = s.toCharArray();
            for(char c : sCharArr){
                count[c - 'a']++;
            }
            String countStr = Arrays.toString(count);
            sMap.putIfAbsent(countStr, new ArrayList<>());
            sMap.get(countStr).add(s);  
        }

        return new ArrayList<>(sMap.values());
    }
}
