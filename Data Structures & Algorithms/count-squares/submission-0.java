class CountSquares {
    // x -> (y -> count)
    private Map<Integer, Map<Integer, Integer>> points = new HashMap<>();
    
    public CountSquares() {
    }
    
    public void add(int[] point) {
        int x = point[0], y = point[1];
        points.computeIfAbsent(x, k-> new HashMap<>())
        .put(y, points.get(x).getOrDefault(y,0) + 1);
        
    }
    
    public int count(int[] point) {
        int x = point[0], y = point[1];
        int result = 0;
        // If no points with same x, no square possible
        if(!points.containsKey(x)) return 0;

        Map<Integer, Integer> sameX = points.get(x);
        
        // Iterate over all points vertically aligned with (x, y)
        for(int y2: sameX.keySet()){
            if(y2 == y) continue; // same point

            int side = y2-y;
            int countY2 = sameX.get(y2);

            result += countY2 * getCount(x+side,y) * getCount(x+side,y2);
            result += countY2 * getCount(x-side,y) * getCount(x-side,y2);
        }
        return result;
    }

    private int getCount(int x, int y){
        return points.getOrDefault(x, Map.of()).getOrDefault(y, 0);}

}

