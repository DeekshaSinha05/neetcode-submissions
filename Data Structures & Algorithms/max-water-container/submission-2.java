class Solution {
    int maxArea = 0;
    public int maxArea(int[] heights) {
        int curArea=0;
        int l=0, r=heights.length-1;
        while(l<r)
        {   int width = r-l;
            curArea = Math.min(heights[l],heights[r])* width;
            maxArea = Math.max(curArea, maxArea);
            if(heights[l]<=heights[r]) l++;
            else r--;
        }

        return maxArea;
    }
}
