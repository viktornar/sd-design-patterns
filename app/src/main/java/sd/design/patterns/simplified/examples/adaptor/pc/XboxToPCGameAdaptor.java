package sd.design.patterns.simplified.examples.adaptor.pc;

public class XboxToPCGameAdaptor implements PCGame {

    private final XboxGame xboxGame;

    public XboxToPCGameAdaptor(final XboxGame xboxGame) {
        this.xboxGame = xboxGame;
    }

    @Override
    public String getTitle() {
        return xboxGame.getName();
    }

    @Override
    public Integer getPegiAllowedAge() {
        switch (xboxGame.getPegiAgeRating()) {
            case P3:
                return 3;
            case P7:
                return 7;
            case P12:
                return 12;
            case P16:
                return 16;
            case P18:
                return 18;
        }
        throw new RuntimeException("Unsupported PEGI rating");
    }

    @Override
    public boolean isTripleAGame() {
        return xboxGame.getBudgetInMillionsOfDollars() > 50;
    }

    @Override
    public Requirements getRequirements() {
        return new Requirements(xboxGame.getMinimumGpuMemoryInMegabytes() / 1024,
                xboxGame.getDiskSpaceNeededInGB(), xboxGame.getRamNeededInGb(), xboxGame.getCoreSpeedInGhz(),
                xboxGame.getCoresNeeded());
    }
}
