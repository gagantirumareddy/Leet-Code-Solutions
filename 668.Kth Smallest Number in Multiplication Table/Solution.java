class Solution {
    public int count(int mid,int m,int n){
        int total=0;
        for(int i=1;i<m+1;i++){
            total+=Math.min(n,mid/i);
        }
        return total;
    }
    public int findKthNumber(int m, int n, int k) {
        int low=1;
        int high=m*n;
        int mid=0;
        while(low<high){
            mid=(low+high)/2;
            int c=count(mid,m,n);
            if(c>=k){
            high=mid;
           }else{
            low=mid+1;
            }
        }
        return low;
    }
}
