package sd.design.patterns.all.examples.prototype;

public class Dragon extends Monster {
	public Dragon(String name, boolean hasWings, int numHeads, boolean canBreatheFire) {
		super(name);
		this.hasWings = hasWings;
		this.canBreatheFire = canBreatheFire;
		this.numHeads = numHeads;
	}
	// Each concrete monster could determine how best to clone itself
	public Monster copy() throws CloneNotSupportedException {
		return (Monster)this.clone();
	}
}