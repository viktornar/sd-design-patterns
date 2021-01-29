package sd.design.patterns.simplified.examples.chainofresponsibility;

public class Main {
    public static void main(String... args) {
        AmountLogger amountLogger = new InfoAmountLogger(new WarnAmountLogger(null));

        amountLogger.log(20.0);
    }
}
