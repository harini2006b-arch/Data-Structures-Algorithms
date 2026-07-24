class Solution { 
    public int vowelConsonantScore(String s) { 
        int v = 0; 
        int c = 0; 
        String lc = s.toLowerCase(); 
        for (int i = 0; i < lc.length(); i++) { 
            char ch = lc.charAt(i); 
            
            if (ch == ' ') { 
                continue; 
            } 
            
            if (Character.isLetter(ch)) { 
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') { 
                    v++; 
                } else { 
                    c++; 
                } 
            } 
        } 
                if (c == 0) { 
            return 0; 
        } 
        return (v / c); 
    } 
} 
