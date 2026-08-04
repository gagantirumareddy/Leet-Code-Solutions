class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        ArrayList<Integer>list=new ArrayList<>();
        int curr=nums[0];
        int end=nums[n-1];
        int index=0;
        while(curr<end){
            if(nums[index]==curr){
                curr++;
                index++;
                continue;
            }else{
                while(curr<nums[index]){
                    list.add(curr++);
                }
                curr++;
                index++;
            }
        }
        return list;

    }
}
