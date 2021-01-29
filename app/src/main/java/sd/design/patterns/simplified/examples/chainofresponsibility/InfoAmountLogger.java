package sd.design.patterns.simplified.examples.chainofresponsibility;

public class InfoAmountLogger extends AmountLogger {
    public static double AMOUNT_WARN_LIMIT = 50.0;

    public InfoAmountLogger(AmountLogger nextProcessor) {
        super(nextProcessor);
    }

    @Override
    public void log(Double amount) {
        System.out.printf("Your amount is: %.2f%n", amount);

        if (nextProcessor != null && amount < AMOUNT_WARN_LIMIT) {
            nextProcessor.log(amount);
        }
    }
}
