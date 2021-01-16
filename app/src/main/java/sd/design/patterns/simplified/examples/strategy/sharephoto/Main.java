package sd.design.patterns.simplified.examples.strategy.sharephoto;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        PhoneCameraApp cameraApp = new PhoneCameraApp();
        String share = getSharing();

        switch (share) {
            case ("t"):
                cameraApp.setShareStrategy(new Txt());
                break;
            case ("e"):
                cameraApp.setShareStrategy(new Email());
                break;
            case ("s"):
                cameraApp.setShareStrategy(new Social());
                break;
            default:
                cameraApp.setShareStrategy(new Txt());
        }
        cameraApp.take();
        cameraApp.save();
        cameraApp.share();
    }

    public static String getSharing() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Share with txt (t), email (e), or social media (s)?");
        String appName = scanner.next();
        scanner.close();
        return appName;
    }
}
