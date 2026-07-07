public class Solution {
    public bool CanConstruct(string ransomNote, string magazine) {
        int[] charCounts = new int[26];
        foreach (char c in magazine) {
            charCounts[c - 'a']++;
        }

        foreach (char c in ransomNote) {
            int index = c - 'a';
            charCounts[index]--;
            
            if (charCounts[index] < 0) {
                return false;
            }
        }

        return true;
    }
}
