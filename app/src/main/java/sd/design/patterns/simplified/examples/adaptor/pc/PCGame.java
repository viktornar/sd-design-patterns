package sd.design.patterns.simplified.examples.adaptor.pc;

public interface PCGame {
    String getTitle();
    Integer getPegiAllowedAge();
    boolean isTripleAGame();
    Requirements getRequirements();
}

