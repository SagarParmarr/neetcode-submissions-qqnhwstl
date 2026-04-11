class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> eleCount = new HashMap<>();

        for(int n : nums ) {
           eleCount.put(n,  eleCount.getOrDefault(n, 0) + 1);
        }
        System.out.println(eleCount);

        List<int[]> arr = new ArrayList<>();
        for(Map.Entry<Integer, Integer> entry : eleCount.entrySet()){
            arr.add(new int[]{entry.getValue(), entry.getKey()});
        }
        arr.sort((a, b) -> b[0] - a[0]);

        int[] result = new int[k];
        for (int i=0; i< k; i++) {
            result[i] = arr.get(i)[1];
        }
        return result;
    }
}
