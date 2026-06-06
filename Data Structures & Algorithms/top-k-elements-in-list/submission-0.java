class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> occur= new HashMap<>();

        if(nums.length==k){ return nums;}

        //making the hashmap
        for(int i: nums){
            occur.put(i, occur.getOrDefault(i,0)+1);
        }

        //make the heap priority queue MIN HEAP so i can take starting ele
        //order of o/p doesnt matter
        Queue<Integer> heap= new PriorityQueue<>((a,b)-> occur.get(a)- occur.get(b));

        for(int x: occur.keySet()){
            
            heap.add(x);
            if(heap.size()>k) heap.poll();
        }

        int[] result= new int[k];
        for(int i=0; i<k; i++){
            result[i]=heap.poll();
        }



        return result;
    }
}
