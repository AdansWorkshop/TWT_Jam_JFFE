import javax.swing.*;

public class LineGraph {
	public LineGraph() {
		JFrame frame = new JFrame();
		frame.setSize(Main.width, Main.height);
		frame.setVisible(true);
		
		frame.add(new LGGFX());
	}
}
