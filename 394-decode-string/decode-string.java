class Solution {
    public String decodeString(String s) {
        Stack<Integer> countstack = new Stack<>();
        Stack<String> stringstack = new Stack<>();
        String currstr = "";
        int currnum = 0;
        for (char ch : s.toCharArray()) {
            if (Character.isDigit(ch)) {
                currnum = currnum * 10 + (ch - '0');
            } 
            else if (ch == '[') {
                countstack.push(currnum);
                stringstack.push(currstr);
                currstr = "";
                currnum = 0;
            } 
            else if (ch == ']') {
                int count = countstack.pop();
                String previousString = stringstack.pop();
                String repeated = "";
                for (int i = 0; i < count; i++) {
                    repeated += currstr;
                }
                currstr = previousString + repeated;
            } 
            else {
                currstr += ch;
            }
        }
        return currstr;
    }
}