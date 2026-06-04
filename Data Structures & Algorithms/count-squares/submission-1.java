class CountSquares {

    // Store points as:
    // x-coordinate -> (y-coordinate -> how many times this point exists)
    private Map<Integer, Map<Integer, Integer>> points = new HashMap<>();

    public CountSquares() {
        // No initialization logic needed beyond the map
    }

    public void add(int[] point) {
        int x = point[0];
        int y = point[1];

        // If this x-coordinate is not present yet, create a map for it
        // Then increase the count of how many times (x, y) appears
        points
            .computeIfAbsent(x, k -> new HashMap<>())
            .put(y, points.get(x).getOrDefault(y, 0) + 1);
    }

    public int count(int[] point) {
        int x = point[0];
        int y = point[1];
        int result = 0;

        // If there are no points with the same x-coordinate,
        // we cannot form any square using (x, y)
        if (!points.containsKey(x)) return 0;

        // Get all points that lie vertically above or below (x, y)
        Map<Integer, Integer> sameX = points.get(x);

        // Try every possible vertical partner (x, y2)
        for (int y2 : sameX.keySet()) {

            // Skip the same point
            if (y2 == y) continue;

            // Vertical distance gives the side length of the square
            int side = y2 - y;

            // How many times point (x, y2) exists
            int countY2 = sameX.get(y2);

            // Check square on the RIGHT side:
            // (x, y), (x, y2), (x + side, y), (x + side, y2)
            result += countY2
                      * getCount(x + side, y)
                      * getCount(x + side, y2);

            // Check square on the LEFT side:
            // (x, y), (x, y2), (x - side, y), (x - side, y2)
            result += countY2
                      * getCount(x - side, y)
                      * getCount(x - side, y2);
        }

        // Return total number of squares found
        return result;
    }

    // Helper method:
    // Returns how many times point (x, y) exists
    // Returns 0 if the point does not exist
    private int getCount(int x, int y) {
        return points.getOrDefault(x, Map.of()).getOrDefault(y, 0);
    }
}
