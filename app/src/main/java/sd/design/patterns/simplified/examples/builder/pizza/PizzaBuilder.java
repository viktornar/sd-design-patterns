package sd.design.patterns.simplified.examples.builder.pizza;

import java.util.ArrayList;
import java.util.List;

public class PizzaBuilder {
	String name;
	List<String> toppings = new ArrayList<>();

	public PizzaBuilder() {
		this.name = "Meat Lovers Pizza";
	}

	public PizzaBuilder addCheese(String cheese) {
		// meat lovers like moz
		this.toppings.add(cheese);
		return this;
	}
	public PizzaBuilder addSauce(String sauce) {
		this.toppings.add(sauce);
		return this;
	}
	public PizzaBuilder addTomatoes(String tomatoes) {
		this.toppings.add(tomatoes);
		return this;
	}
	public PizzaBuilder addGarlic() {
		this.toppings.add("garlic");
		return this;
	}
	public PizzaBuilder addOlives() {
		this.toppings.add("olives");
		return this;
	}
	public PizzaBuilder addSpinach() {
		this.toppings.add("spinach");
		return this;
	}
	public PizzaBuilder addPepperoni() {
		this.toppings.add("pepperoni");
		return this;
	}
	public PizzaBuilder addSausage() {
		this.toppings.add("sausage");
		return this;
	}

	public Pizza build() {
		Pizza pizza = new Pizza();
		pizza.setName(this.name);
		pizza.addToppings(toppings);
		return pizza;
	}
}