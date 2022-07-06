package LeetcodeProbs;

public class RichestCustomerWealth_1672 {
    public int maximumWealth(int[][] accounts) {
        int maxTotal = -1;

        for (int i=0;i<accounts.length;i++) {
            int total = 0;
            for (int z=0;z<accounts[i].length;z++) {
                total += accounts[i][z];
            }

            if (total > maxTotal) {
                maxTotal = total;
            }
        }

        return maxTotal;
    }
}
