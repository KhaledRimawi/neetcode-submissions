
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new ArrayList<>();
        boolean[] isUsed = new boolean[strs.length];

        for (int i = 0; i < strs.length; i++) {
            if (isUsed[i]) {
                continue;
            }

            List<String> group = new ArrayList<>();
            group.add(strs[i]);
            isUsed[i] = true;

            for (int j = i + 1; j < strs.length; j++) {
                if (!isUsed[j] && isAnagram(strs[i], strs[j])) {
                    group.add(strs[j]);
                    isUsed[j] = true;
                }
            }

            // ⭐ هذا كان ناقص
            result.add(group);
        }

        return result;
    }

    private boolean isAnagram(String s1, String s2) {
        if (s1.length() != s2.length()) return false;

        char[] c1 = s1.toCharArray();
        char[] c2 = s2.toCharArray();

        Arrays.sort(c1);
        Arrays.sort(c2);

        return Arrays.equals(c1, c2);
    }
}