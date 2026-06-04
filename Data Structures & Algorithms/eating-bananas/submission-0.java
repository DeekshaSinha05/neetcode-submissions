class Solution {
    int count;
    public int minEatingSpeed(int[] piles, int h) {
        int right=0;
        for(int pile : piles)
            right = Math.max(right,pile);

        return binarySearch(1,right,h,piles);
    }

    private int binarySearch(int start, int end, int h, int[] piles){
        while(start<end)
        {
            int mid = start+(end-start)/2;
            count=0;
            for(int pile:piles){
                count += (int) Math.ceil((double)pile/mid);
        }
        if(count<=h) end = mid;
        else start = mid+1;
        
        }
        return start;
    }
}
