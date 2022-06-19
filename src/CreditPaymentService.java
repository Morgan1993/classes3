public class CreditPaymentService {
    public int calculate(int creditAmount, double percentage, int duration) {
        double percentageMonth = percentage / (100 * 12);
        return (int) (creditAmount * (percentageMonth / (1 - Math.pow(1 + percentageMonth,-duration))));
    }
}
