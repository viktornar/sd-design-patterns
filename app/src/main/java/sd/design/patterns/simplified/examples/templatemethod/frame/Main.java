package sd.design.patterns.simplified.examples.templatemethod.frame;

import javax.swing.*;
import java.awt.*;

public class Main extends JFrame {
	private static final long serialVersionUID = 2L;

	public Main(String title) {
		super(title);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		this.setSize(300,300);
		this.setVisible(true);
	}

	public void paint(Graphics graphics) {
		super.paint(graphics);
		String msg = "I rule!!";
		graphics.drawString(msg, 100, 100);
	}

	public static void main(String[] args) {
		Main myFrame = new Main("Head First Design Patterns");
	}
}
