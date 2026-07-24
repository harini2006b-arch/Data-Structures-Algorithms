class Solution {
    public String reverseVowels(String s) {
        char[] chars = s.toCharArray();
        int left = 0;
        int right = s.length() - 1;
        while (left < right) {
            char cl = chars[left];
            if (cl != 'a' && cl != 'e' && cl != 'i' && cl != 'o' && cl != 'u' &&
                cl != 'A' && cl != 'E' && cl != 'I' && cl != 'O' && cl != 'U') {
                left++;
                continue; 
            }
            char cr = chars[right];
            if (cr != 'a' && cr != 'e' && cr != 'i' && cr != 'o' && cr != 'u' &&
                cr != 'A' && cr != 'E' && cr != 'I' && cr != 'O' && cr != 'U') {
                right--;
                continue;
            }
            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;
            left++;
            right--;
        }
        return new String(chars);
    }
}
