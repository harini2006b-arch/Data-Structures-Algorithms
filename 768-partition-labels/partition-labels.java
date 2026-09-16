class Solution {
    public List<Integer> partitionLabels(String s) {
        HashMap<Character,Integer>map=new HashMap<>();
        int n=s.length();
        for(int i=0;i<n;i++){
            map.put(s.charAt(i),i);
        }
        List<Integer>list=new ArrayList<>();
        int start=0;
        int end=0;
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            end=Math.max(end,map.get(ch));
            if(i==end){
                list.add(end-start+1);
                start=i+1;
            }
        }
        return list; 
    }
}