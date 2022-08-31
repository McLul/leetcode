import static java.util.Map.Entry.*;
import static java.util.stream.Collectors.*;

class Solution {
    public int findLeastNumOfUniqueInts(int[] arr, int k) {
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        for (int i = 0; i < arr.length ; i++) {
            if (map.get(arr[i]) == null) {
                map.put(arr[i],1);
            } else {
                map.put(arr[i], map.get(arr[i]) + 1);
            }
        }
        // sort then start removing k elements from smallest keys/values
        LinkedHashMap<Integer,Integer> sorted = map
            .entrySet()
            .stream()
            .sorted((comparingByValue()))
            .collect( toMap(e -> e.getKey(), e -> e.getValue(), (e1, e2) -> e2, LinkedHashMap::new));
        int resultSize = sorted.entrySet().size();
        for (Map.Entry<Integer,Integer> entry : sorted.entrySet()) {
            int value = entry.getValue();
            if (k >= value) {
                k -= value;
                resultSize--;
            }
        }
        return resultSize;
    }
}