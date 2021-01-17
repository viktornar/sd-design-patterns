package sd.design.patterns.simplified.examples.factory.games;

public class FPSGameFactory implements GameFactory {
    public  Game createGame() {
        return new FPSGame();
    }
}
