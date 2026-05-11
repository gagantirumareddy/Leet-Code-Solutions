class Solution {
    public int[] separateDigits(int[] nums) {
        List<Integer>newl=new ArrayList<>();
        for(int num:nums){
            String sh=Integer.toString(num);
            for(int i=0;i<sh.length();i++){
                newl.add(sh.charAt(i)-'0');
            }
        }
        int []ans=new int[newl.size()];
        for(int i=0;i<newl.size();i++){
            ans[i]=newl.get(i);
        }
        return ans;

    }
}
