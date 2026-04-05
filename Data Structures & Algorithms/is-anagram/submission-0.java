class Solution {
    public boolean isAnagram(String s, String t) {
        
        if(s.length() != t.length()) {
            return false;
        }
        HashMap<Character, Integer> sMap = createHashMap(s);
        HashMap<Character, Integer> tMap = createHashMap(t);

        return sMap.equals(tMap);

    }

    public static HashMap<Character, Integer> createHashMap(String s) {
        HashMap<Character, Integer> charMap = new HashMap<>();
        for (char c : s.toCharArray()) {
            Integer charValue = charMap.get(c);
            if(charValue != null){
               charMap.put(c, charValue + 1);
            } else {
               charMap.put(c, 1);
            }
        }
        return charMap;
    }
}
