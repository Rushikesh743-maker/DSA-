import java.util.HashMap;
class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer>M=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int sec=target-nums[i];
            if(M.containsKey(sec)){
                return new int[]{M.get(sec),i};
            }
            M.put(nums[i],i);
        }
        return new int[] {};
    }
}