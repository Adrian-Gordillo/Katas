public class kata69 {
    public static int countChange(final int money, final int[] coins) {

        int[] dp = new int[money + 1];
        dp[0] = 1;
        for (int coin : coins) {
            for (int i = coin; i <= money; i++) {
                dp[i] += dp[i - coin];
            }
        }
        return dp[money];
    }
}
