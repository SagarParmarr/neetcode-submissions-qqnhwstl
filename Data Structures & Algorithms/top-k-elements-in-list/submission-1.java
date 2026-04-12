class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> count = new HashMap<>();
        for(int n : nums){
            count.put(n, count.getOrDefault(n, 0) + 1);
        }
        List<Integer>[] buckets = new List[nums.length + 1];
        for (int i = 0; i < buckets.length; i++) {
            buckets[i] = new ArrayList<>();
        }

        for(Map.Entry<Integer, Integer> entry : count.entrySet()) {
            buckets[entry.getValue()].add(entry.getKey());
        }
        int[] result = new int[k];
        int index = 0;
        for (int i = buckets.length - 1;  i > 0 && index < k; i--) {
            for(int num : buckets[i]) {
                result[index] = num;
                index++;
                if(index == k) {
                    return result;
                }
            }
        }

       return  result;
    }

    // Time Complexity: O(n) 
    // Space Comlexity: O(n) why because each bucket can take individual array
}
