import javax.swing.*;

public class PixelGraph {
	
	public PixelGraph() {
		JFrame frame = new JFrame();
		frame.setSize(Main.width, Main.height);
		frame.setVisible(true);
		
		frame.add(new PGGFX());
	}
}
