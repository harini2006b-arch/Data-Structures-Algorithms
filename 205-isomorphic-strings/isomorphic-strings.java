class Solution {
    public boolean isIsomorphic(String s, String t) {
        Map<Character,Character>smap=new HashMap<>();
        Map<Character,Character>tmap=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char Maps=s.charAt(i);
            char Mapt=t.charAt(i);
            if(smap.containsKey(Maps)){
                if(smap.get(Maps)!=Mapt) {
                return false;
                }
            }
            else {
                smap.put(Maps,Mapt);
            }
            if(tmap.containsKey(Mapt)){
                if(tmap.get(Mapt)!=Maps){
                return false;
                }
            }
            else {
                tmap.put(Mapt,Maps);
            }
        }
        return true;
    }
}