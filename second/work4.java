package homework.second;

class LongestCommonPrefix {
    public static String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }
        String prefix = strs[0];

        for (int i = 1; i < strs.length; i++) {
            int j = 0;
            while (j < prefix.length() && j < strs[i].length() && prefix.charAt(j) == strs[i].charAt(j)) {
                j++;
            }
            prefix = prefix.substring(0, j);

            if (prefix.isEmpty()) {
                return "";
            }
        }
        return prefix;
    }
}
public class work4{
    public static void main(String[] args) {
        // 测试示例
        String[] strs1 = {"flower", "flow", "flight"};
        System.out.println(LongestCommonPrefix.longestCommonPrefix(strs1)); // 输出："fl"

        String[] strs2 = {"dog", "racecar", "car"};
        System.out.println(LongestCommonPrefix.longestCommonPrefix(strs2)); // 输出：""
    }
}
