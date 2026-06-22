using System.Text;
public class Solution {
    public string RemoveDuplicates(string s) {
        StringBuilder sb= new StringBuilder();
        foreach(char c in s){
            if(sb.Length>0 && sb[sb.Length-1]==c){
                sb.Length--;
            }
            else
            sb.Append(c);
        }
        return sb.ToString();
    }
}