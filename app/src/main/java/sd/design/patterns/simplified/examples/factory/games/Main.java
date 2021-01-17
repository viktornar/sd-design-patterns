package sd.design.patterns.simplified.examples.factory.games;

public class Main {
	public static void main(String[] args) throws Exception {
		GameStore gameStore = new GameStore();
		Game d = gameStore.getGame("fps");
		Game c = gameStore.getGame("rpg");

		d.display();
		c.display();
	}
}