import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {
  public static void main(String[] args) {

    String[] input = { "cat", "act", "are", "era", "god" };
    Collection<List<String>> groupedStr = groupAnagrams(input);
    System.out.println(groupedStr);
  }

  public static Collection<List<String>> groupAnagrams(String[] input) {

    Map<String, List<String>> answer = new HashMap<>();
    for (String s : input) {
      char[] arr = s.toCharArray();
      Arrays.sort(arr);
      String key = String.valueOf(arr);
      answer.computeIfAbsent(key, k -> new ArrayList<>());
      answer.get(key).add(s);

    }
    return answer.values();
  }

}
