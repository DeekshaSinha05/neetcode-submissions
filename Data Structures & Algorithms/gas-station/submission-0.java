class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int totalSum =0;
        int curSum =0;
        int n = gas.length;
        int start=0;

        for(int i= 0;i<n;i++){
            int dif = gas[i] - cost[i];
            totalSum += dif;
            curSum += dif;
            if(curSum<0){
                curSum =0;
                start = i+1;
            }   
        }
        
    return totalSum>=0?start:-1;
    }
}
