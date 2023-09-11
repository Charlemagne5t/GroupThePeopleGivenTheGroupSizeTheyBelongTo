import java.util.*;
import java.util.stream.Collectors;

public class Solution {
    public List<List<Integer>> groupThePeople(int[] groupSizes) {
        Map<Integer, List<List<Integer>>> map = new HashMap<>();
        for (int i = 0; i < groupSizes.length; i++) {
            int size = groupSizes[i];
            if (!map.containsKey(size)) {
                map.put(size, new ArrayList<>());
                map.get(size).add(new ArrayList<>());
            }
            List<List<Integer>> currentListOfLists = map.get(size);
            List<Integer> currentList = currentListOfLists.get(currentListOfLists.size() - 1);
            if (currentList.size() < size) {
                currentList.add(i);
            } else {
                currentListOfLists.add(new ArrayList<>());
                currentList = currentListOfLists.get(currentListOfLists.size() - 1);
                currentList.add(i);

            }

        }
        return map.values().stream().flatMap(Collection::stream).collect(Collectors.toList());

    }
}
