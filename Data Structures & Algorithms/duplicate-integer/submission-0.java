class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> list= new HashSet<>();
        for(int n: nums){
            if(list.contains(n))
             return true;
            list.add(n);
        }
        return false;}}