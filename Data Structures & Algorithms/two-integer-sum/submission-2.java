class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer > list=new HashMap<>();
        for(int i=0; i<nums.length; i++){
            list.put(nums[i], i);
        }
        int diff;
       
        for(int i=0; i<nums.length; i++){
            diff=target-nums[i];
            if(list.containsKey(diff) && list.get(diff) !=i){
                int[] op={i, list.get(diff)};
                return op;
            }

        }
        return null;
    }
}