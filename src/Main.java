public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();

        double payAmount;
        payAmount = service.calculate(1_000_000, 1);
        System.out.println("Сумма ежемесячного платежа: " + (int) payAmount + " рублей.");

        payAmount = service.calculate(1_000_000, 2);
        System.out.println("Сумма ежемесячного платежа: " + (int) payAmount + " рублей.");

        payAmount = service.calculate(1_000_000, 3);
        System.out.println("Сумма ежемесячного платежа: " + (int) payAmount + " рублей.");
    }
}
