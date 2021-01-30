package sd.design.patterns.simplified.examples.chainofresponsibility;

public class Main {
    public static void main(String... args) {
        AmountLogger amountLogger = new InfoAmountLogger(
                new WarnAmountLogger(
                        new ErrorAmountLogger(null)
                )
        );

        amountLogger.log(9.0);
    }
}
