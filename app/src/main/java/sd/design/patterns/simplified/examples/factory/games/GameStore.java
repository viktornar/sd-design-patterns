package sd.design.patterns.simplified.examples.factory.games;

public class GameStore {
	public Game getGame(String type) throws Exception {
		if (type.equals("fps")) {
			GameFactory fpsGameFactory = new FPSGameFactory();
			return fpsGameFactory.createGame();
		} else if (type.equals("rpg")) {
			GameFactory rpgGameFactory = new RPGGameFactory();
			return rpgGameFactory.createGame();
		} else {
			throw new Exception("Invalid kind of tree");
		}
	}
}