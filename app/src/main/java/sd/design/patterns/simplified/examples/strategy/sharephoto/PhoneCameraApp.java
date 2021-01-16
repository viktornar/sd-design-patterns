package sd.design.patterns.simplified.examples.strategy.sharephoto;

public class PhoneCameraApp {
	ShareStrategy shareStrategy;
	
	public void setShareStrategy(ShareStrategy shareStrategy) {
		this.shareStrategy = shareStrategy;
	}
	public void share() {
		shareStrategy.share();
	}
	public void take() {
		System.out.println("Taking the photo");
	}
	public void save() {
		System.out.println("Saving the photo");
	}
}
