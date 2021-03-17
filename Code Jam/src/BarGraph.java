import javax.swing.*;

public class BarGraph {
	public BarGraph() {
		JFrame frame = new JFrame();
		frame.setSize(Main.width, Main.height);
		frame.setVisible(true);
		
		frame.add(new BGGFX());
	}
}
