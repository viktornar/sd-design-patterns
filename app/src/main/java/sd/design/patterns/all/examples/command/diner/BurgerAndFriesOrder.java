package sd.design.patterns.all.examples.command.diner;

public class BurgerAndFriesOrder implements Order {
	Cook cook;
	public BurgerAndFriesOrder(Cook cook) {
		this.cook = cook;
	}
	public void orderUp() {
		cook.makeBurger();
		cook.makeFries();
	}
}
