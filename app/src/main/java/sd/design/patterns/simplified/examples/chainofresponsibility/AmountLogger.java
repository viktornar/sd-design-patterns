package sd.design.patterns.simplified.examples.chainofresponsibility;

public abstract class AmountLogger {

    // next element in chain or responsibility
    public AmountLogger nextProcessor;

    public AmountLogger(AmountLogger nextProcessor) {
        this.nextProcessor = nextProcessor;
    }

    public abstract void log(Double amount);
}
