using System;
using System.Text;
using System.Collections.Generic;

public class Solution {
    public string ToGoatLatin(string sentence) {
        //code here
        var vowels = new HashSet<char> { 'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U' };
        string[] words = sentence.Split(' ');
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < words.Length; i++) {
            string word = words[i];
            
            if (vowels.Contains(word[0])) {
                result.Append(word);
            } else {
                result.Append(word.Substring(1)).Append(word[0]);
            }
            
            result.Append("ma");
            result.Append('a', i + 1);
            
            if (i < words.Length - 1) {
                result.Append(' ');
            }
        }

        return result.ToString();
    }
}
