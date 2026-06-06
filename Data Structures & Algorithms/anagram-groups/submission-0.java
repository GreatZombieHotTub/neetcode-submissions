class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> hm= new HashMap<>();

        if(strs.length==0){
            return new ArrayList<>();
        }

        
        for(String s: strs){
            int[] arr= new int[26];
            for(char c: s.toCharArray()){
                arr[c-97]++;
            }
            String key= Arrays.toString(arr); //automatically sorted

            if(hm.containsKey(key)){ 
                hm.get(key).add(s);}
            else { 
                hm.put(key, new ArrayList<>());
                hm.get(key).add(s);}
            }
        return new ArrayList<>(hm.values());
    }
}
