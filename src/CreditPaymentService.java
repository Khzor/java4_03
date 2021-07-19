public class CreditPaymentService {
    public double calculate(int creditAmount, int creditTerm) {
        double monthlyRate = 0.0999 / 12;
        double monthsCount = creditTerm * 12;
        double annuityCoefficient = monthlyRate * Math.pow(1 + monthlyRate , monthsCount) / (Math.pow(1 + monthlyRate , monthsCount) - 1);
        double paymentAmount = creditAmount * annuityCoefficient;

        return paymentAmount;
    }
}
