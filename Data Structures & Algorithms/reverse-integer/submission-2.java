class Solution {
    public int reverse(int x) {
      int rev = 0;

      final int MAX_DIV_10 = Integer.MAX_VALUE/10;  
      final int MAX_LAST_DIGIT = Integer.MAX_VALUE%10;  
      final int MIN_DIV_10 = Integer.MIN_VALUE/10;
      final int MIN_LAST_DIGIT = Integer.MIN_VALUE%10;

      while (x != 0){
        int digit = x % 10;
        x /= 10;

        if(rev > MAX_DIV_10 || (rev == MAX_DIV_10 && digit > MAX_LAST_DIGIT)) return 0;

        if(rev < MIN_DIV_10 || (rev == MIN_DIV_10 && digit < MIN_LAST_DIGIT)) return 0;

        rev = rev * 10 + digit;
      }
      return rev;
    }
}