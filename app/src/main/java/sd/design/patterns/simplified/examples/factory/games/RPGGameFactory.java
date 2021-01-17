package sd.design.patterns.simplified.examples.factory.games;

public class RPGGameFactory implements GameFactory {
    public Game createGame() {
        return new RPGGame();
    }
}
