public class FinancialForecast {

    // Recursive function to calculate future value
    public static double forecast(double initialValue, double growthRate, int years) {
        if (years == 0) {
            return initialValue;
        }
        return forecast(initialValue, growthRate, years - 1) * (1 + growthRate);
    }

    // Optimized recursive version with memoization
    public static double forecastMemo(double initialValue, double growthRate, int years, double[] memo) {
        if (years == 0) return initialValue;
        if (memo[years] != 0) return memo[years];
        memo[years] = forecastMemo(initialValue, growthRate, years - 1, memo) * (1 + growthRate);
        return memo[years];
    }

    public static void main(String[] args) {
        double initialValue = 10000; // ₹10,000
        double growthRate = 0.10;    // 10%
        int years = 5;

        System.out.println("Without memoization:");
        double futureValue = forecast(initialValue, growthRate, years);
        System.out.printf("Future Value after %d years = ₹%.2f\n", years, futureValue);

        System.out.println("With memoization:");
        double[] memo = new double[years + 1];
        double futureValueMemo = forecastMemo(initialValue, growthRate, years, memo);
        System.out.printf("Future Value after %d years = ₹%.2f\n", years, futureValueMemo);
    }
}
