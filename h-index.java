class Solution {
    public int hIndex(int[] citations) {
        int n = citations.length;
        int []freq = new int[n+1];
        for ( int i:citations){
            if(i>n){
                freq[n]++;
            }else{
                freq[i]++;
            }
        }

        int cnt=0;
        for(int j=n;j>=0;j--){
            cnt+=freq[j];
            if(cnt>=j){
                return j;
            }
        }
        return 0;
        
    }
}