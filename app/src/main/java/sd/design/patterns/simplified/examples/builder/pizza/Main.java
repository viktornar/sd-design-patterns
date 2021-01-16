package sd.design.patterns.simplified.examples.builder.pizza;

public class Main {

	// Fluent Interface pattern (return the builder each time so we can string the calls together)
	// Builder pattern (we have two different builders so the "same construction process can create
	//   different representations").
	// Builder is a solution to the telescoping constructor anti-pattern, where we have multiple,
	//   complex constructor methods with various args for all various combinations of options
	//   in construction options.

	// Builder has similarities to Abstract Factory.
	// But difference is that Builder provides a step by step API for building a product
	public static void main(String[] args) {
		PizzaBuilder meatBuilder = new PizzaBuilder();

		Pizza meat = meatBuilder
				.addSauce("NY style sauce")
				.addTomatoes("sliced tomatoes")
				.addCheese("mozzerella")
				.addSausage()
				.addPepperoni()
				.build();

		meat.prepare();
		meat.bake();
		meat.cut();
		meat.box();
		System.out.println(meat);

		
		String sb = new StringBuilder().append("\nTesting String Builder\n").append(meat).insert(0, "====").toString();
		System.out.println(sb);
	}
}
