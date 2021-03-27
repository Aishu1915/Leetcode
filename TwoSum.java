class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer>num=new HashMap<Integer,Integer>();
        for(int i=0;i<nums.length;i++){
            int complement=target-nums[i];
            if(num.containsKey(complement)){
                return new int[]{num.get(complement),i};
            }
            num.put(nums[i],i);
                
            }
        throw new IllegalArgumentException("no match");
        }
 }
