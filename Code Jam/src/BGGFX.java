import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class BGGFX extends JPanel {
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		this.setBounds(0, 0, Main.width, Main.height);
		
		Graphics2D g2d = (Graphics2D) g;
		g2d.setColor(Color.BLUE);
		for (int i = 0; i < Main.width; i+=Main.sampleSize) {
			Random random = new Random();
			double rand = ImprovedNoise.noise(Math.PI, i, i) * random.nextInt(128) + 400;
			g2d.fillRect(i, (int) (800-rand), Main.sampleSize, (int) (800-rand));
		}
	}
}
