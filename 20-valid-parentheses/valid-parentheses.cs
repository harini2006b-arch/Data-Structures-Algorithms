using System.Text;

public class Solution {
    // Problem 20: Valid Parentheses
    public bool IsValid(string s) {
        StringBuilder sb = new StringBuilder(); // Fix 1: StringBuilder
        
        foreach(char c in s){
            if (c == '(' || c == '{' || c == '[') {
                sb.Append(c); // Fix 2: Appended 'c' inside bracket
            } else {
                if (sb.Length == 0) return false;
                
                char last = sb[sb.Length - 1]; // Fix 3: Added semicolon ';'
                
                // Fix 4: Corrected single quotes and fixed bracket nesting
                if ((c == ')' && last == '(') || 
                    (c == '}' && last == '{') || 
                    (c == ']' && last == '[')) {
                    sb.Length--;
                } else {
                    return false;
                }
            }
        }
        // Fix 5: Brought return inside the function brackets correctly
        return sb.Length == 0; 
    }
}
