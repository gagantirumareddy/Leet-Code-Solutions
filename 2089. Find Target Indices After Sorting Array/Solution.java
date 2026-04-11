class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        int less=0;
        int equal=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<target){
                less++;
            }else if(nums[i]==target){
                equal++;
            }
        }
        ArrayList<Integer>list =new ArrayList();
        for(int i=less;i<equal+less;i++){
            list.add(i);
        }
        return list;
    }
}
