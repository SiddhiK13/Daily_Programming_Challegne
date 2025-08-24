import java.util.*;

public class GroupAnagrams {
    public static List<List<String>> groupAnagrams(String[] strs) {
        // HashMap to store sorted word as key and list of anagrams as value
        Map<String, List<String>> map = new HashMap<>();

        for (String word : strs) {
            // Sort each word to create a key
            char[] chars = word.toCharArray();
            Arrays.sort(chars);
            String sortedWord = new String(chars);

            // Add word to corresponding group
            if (!map.containsKey(sortedWord)) {
                map.put(sortedWord, new ArrayList<>());
            }
            map.get(sortedWord).add(word);
        }

        // Return grouped anagrams
        return new ArrayList<>(map.values());
    }

    public static void main(String[] args) {
        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
        List<List<String>> result = groupAnagrams(strs);

        System.out.println(result);
    }
}
