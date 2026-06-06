class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer > list=new HashMap<>();
        for(int i=0; i<nums.length; i++){
            list.put(nums[i], i);
        }
        int diff;
        int[] op= new int[2];

        for(int i=0; i<nums.length; i++){
            diff=target-nums[i];
            if(list.getOrDefault(diff, -1)!=-1 && list.get(diff) != i){
                op[0]=i;
                op[1]=list.getOrDefault(diff, -1);
                return op;
            }

        }
        return op;
    }
}
