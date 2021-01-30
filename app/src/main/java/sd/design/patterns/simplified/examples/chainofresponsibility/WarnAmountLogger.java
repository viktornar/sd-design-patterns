package sd.design.patterns.simplified.examples.chainofresponsibility;

public class WarnAmountLogger extends AmountLogger {
    public static double AMOUNT_ERROR_LIMIT = 10.0;

    public WarnAmountLogger(AmountLogger nextProcessor) {
        super(nextProcessor);
    }

    @Override
    public void log(Double amount) {
        if (nextProcessor != null && amount < AMOUNT_ERROR_LIMIT) {
            nextProcessor.log(amount);
        } else {
            System.out.println("Warning your amount is small. Consider to save your money.");
        }
    }
}
