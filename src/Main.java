public class Main {
    public static void main(String[] args) {
        CreditPaymentService creditPaymentService = new CreditPaymentService();
        System.out.println("Ежемесячный платеж " + creditPaymentService.calculate(
                1000000,
                9.99,
                12
        ));
        System.out.println();
        System.out.println("Ежемесячный платеж " + creditPaymentService.calculate(
                1000000,
                9.99,
                24
        ));
        System.out.println();
        System.out.println("Ежемесячный платеж " + creditPaymentService.calculate(
                1000000,
                9.99,
                36
        ));
    }
}