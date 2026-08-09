class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> hm=new HashMap<>();
        for(String s:strs){
            char ch[]=s.toCharArray();
            Arrays.sort(ch);
            String s1=String.valueOf(ch);

            if(!hm.containsKey(s1)){
                hm.put(s1,new ArrayList<>());
            }
            hm.get(s1).add(s);


        }  
        return new ArrayList<>(hm.values());
    }
}