package sd.design.patterns.simplified.examples.chainofresponsibility;

public class ErrorAmountLogger extends  AmountLogger {
    public ErrorAmountLogger(AmountLogger nextProcessor) {
        super(nextProcessor);
    }

    @Override
    public void log(Double amount) {
        System.out.println("You almost do not have money. You need to borrow.");
    }
}
