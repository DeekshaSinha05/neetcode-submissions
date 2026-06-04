class Solution {
    HashSet visited = new HashSet<>();
    public boolean isHappy(int n) {
        
        int squaredSum = getSquaredSum(n);
        while(!visited.contains(squaredSum)){
            visited.add(squaredSum);
            squaredSum = getSquaredSum(squaredSum);
            if(squaredSum==1) return true;
        }
        return false;
    }
    private int getSquaredSum(int n){
        int sum =0;
        while(n>0){
            int digit = n%10;
            sum += digit * digit;
            n = n/10;
        }
        return sum;
    }
}
