import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class LGGFX extends JPanel {
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		this.setBounds(0, 0, Main.width, Main.height);
		
		double lastY = Main.height/2;
		
		Graphics2D g2d = (Graphics2D) g;
		g2d.setColor(Color.BLUE);
		for (int i = 0; i < Main.width; i+=Main.sampleSize) {
			Random random = new Random();
			double rand = (ImprovedNoise.noise(Math.PI, i, i) * random.nextInt(128) + (Main.height/2));
			g2d.drawLine(i, (int) lastY, i+Main.sampleSize, (int) rand);
			lastY = rand;
		}
	}
}
