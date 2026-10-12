class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        int n = s.length();
        boolean[] dp = new boolean[n+1];
        dp[0] = true;

        for(int i =0; i<n; i++){
            if(!dp[i]) continue;

            for(String word: wordDict){
                int end = i + word.length();

                if(end <= n && s.startsWith(word, i))
                    dp[end] = true;
   

            }
            if (dp[n]) return true;
        }
    return dp[n];
    }
}
