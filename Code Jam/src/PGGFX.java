import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class PGGFX extends JPanel {
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		this.setBounds(0, 0, Main.width, Main.height);
		
		Graphics2D g2d = (Graphics2D) g;
		
		for (int i = 0; i < Main.width; i+=Main.sampleSize) {
			for (int j = 0; j < Main.height; j+=Main.sampleSize) {
				Random random = new Random();
				g2d.setColor(Color.getHSBColor(1, 0, (float) ImprovedNoise.noise(3.14 * random.nextDouble(), i, j) + 1));
				g2d.fillRect(i, j, Main.sampleSize, Main.sampleSize);
			}
		}
	}
}
