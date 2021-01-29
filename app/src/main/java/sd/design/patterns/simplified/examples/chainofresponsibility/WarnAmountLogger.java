package sd.design.patterns.simplified.examples.chainofresponsibility;

public class WarnAmountLogger extends AmountLogger {
    public WarnAmountLogger(AmountLogger nextProcessor) {
        super(nextProcessor);
    }

    @Override
    public void log(Double amount) {
        System.out.println("Warning your amount is small. Consider to save your money.");

        if (nextProcessor != null) {
            nextProcessor.log(amount);
        }
    }
}
