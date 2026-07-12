class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int sorte[]=arr.clone();
        Arrays.sort(sorte);
        HashMap<Integer,Integer>map=new HashMap<>();
        int n=1;
        for(int i=0;i<arr.length;i++){
            if(!map.containsKey(sorte[i])){
                map.put(sorte[i],n++);
            }
        }
        for(int i=0;i<arr.length;i++){
            arr[i]=map.get(arr[i]);
        }
        return arr;
    }
}
