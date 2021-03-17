import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
	
	public static int width;
	public static int height;
	
	public static int sampleSize;
	
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setSize(400, 600);
		frame.setLayout(null);
		frame.setVisible(true);
		
		JButton pixelGraphButton = new JButton("New Pixel Graph");
		pixelGraphButton.setBounds(0, 0, 400, 150);
		pixelGraphButton.setFont(new Font(null, Font.PLAIN, 32));
		pixelGraphButton.setVisible(true);
		pixelGraphButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
				JFrame frame = new JFrame();
				frame.setLayout(null);
				frame.setSize(300, 300);
				frame.setVisible(true);
				
				JTextField widthField = new JTextField();
				widthField.setBounds(0, 50, 150, 50);
				widthField.setFont(new Font(null, Font.PLAIN, 24));
				widthField.setVisible(true);
				
				JTextField heightField = new JTextField();
				heightField.setBounds(150, 50, 150, 50);
				heightField.setFont(new Font(null, Font.PLAIN, 24));
				heightField.setVisible(true);
				
				JLabel widthLabel = new JLabel();
				widthLabel.setBounds(0, 0, 150, 50);
				widthLabel.setFont(new Font(null, Font.PLAIN, 24));
				widthLabel.setText("Width");
				widthLabel.setVisible(true);
				
				JLabel heightLabel = new JLabel();
				heightLabel.setBounds(150, 0, 150, 50);
				heightLabel.setFont(new Font(null, Font.PLAIN, 24));
				heightLabel.setText("Height");
				heightLabel.setVisible(true);
				
				JTextField sampleSizeField = new JTextField();
				sampleSizeField.setBounds(0, 150, 150, 50);
				sampleSizeField.setFont(new Font(null, Font.PLAIN, 24));
				sampleSizeField.setVisible(true);
				
				JLabel sampleSizeLabel = new JLabel();
				sampleSizeLabel.setBounds(0, 100, 150, 50);
				sampleSizeLabel.setFont(new Font(null, Font.PLAIN, 24));
				sampleSizeLabel.setText("Sample Size");
				sampleSizeLabel.setVisible(true);
				
				JButton runButton = new JButton("Run");
				runButton.setFont(new Font(null, Font.PLAIN, 24));
				runButton.setBounds(150, 150, 150, 50);
				runButton.setVisible(true);
				runButton.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {
						width = Integer.parseInt(widthField.getText());
						height = Integer.parseInt(heightField.getText());
						sampleSize = Integer.parseInt(sampleSizeField.getText());
						new PixelGraph();
					}
				});
				
				frame.add(heightLabel);
				frame.add(widthLabel);
				frame.add(heightField);
				frame.add(widthField);
				frame.add(sampleSizeLabel);
				frame.add(sampleSizeField);
				frame.add(runButton);
			}
		});
		
		JButton barGraphButton = new JButton("New Bar Graph");
		barGraphButton.setBounds(0, 150, 400, 150);
		barGraphButton.setFont(new Font(null, Font.PLAIN, 32));
		barGraphButton.setVisible(true);
		barGraphButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				JFrame frame = new JFrame();
				frame.setLayout(null);
				frame.setSize(300, 300);
				frame.setVisible(true);
				
				JTextField widthField = new JTextField();
				widthField.setBounds(0, 50, 150, 50);
				widthField.setFont(new Font(null, Font.PLAIN, 24));
				widthField.setVisible(true);
				
				JTextField heightField = new JTextField();
				heightField.setBounds(150, 50, 150, 50);
				heightField.setFont(new Font(null, Font.PLAIN, 24));
				heightField.setVisible(true);
				
				JLabel widthLabel = new JLabel();
				widthLabel.setBounds(0, 0, 150, 50);
				widthLabel.setFont(new Font(null, Font.PLAIN, 24));
				widthLabel.setText("Width");
				widthLabel.setVisible(true);
				
				JLabel heightLabel = new JLabel();
				heightLabel.setBounds(150, 0, 150, 50);
				heightLabel.setFont(new Font(null, Font.PLAIN, 24));
				heightLabel.setText("Height");
				heightLabel.setVisible(true);
				
				JTextField sampleSizeField = new JTextField();
				sampleSizeField.setBounds(0, 150, 150, 50);
				sampleSizeField.setFont(new Font(null, Font.PLAIN, 24));
				sampleSizeField.setVisible(true);
				
				JLabel sampleSizeLabel = new JLabel();
				sampleSizeLabel.setBounds(0, 100, 150, 50);
				sampleSizeLabel.setFont(new Font(null, Font.PLAIN, 24));
				sampleSizeLabel.setText("Sample Size");
				sampleSizeLabel.setVisible(true);
				
				JButton runButton = new JButton("Run");
				runButton.setFont(new Font(null, Font.PLAIN, 24));
				runButton.setBounds(150, 150, 150, 50);
				runButton.setVisible(true);
				runButton.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {
						width = Integer.parseInt(widthField.getText());
						height = Integer.parseInt(heightField.getText());
						sampleSize = Integer.parseInt(sampleSizeField.getText());
						new BarGraph();
					}
				});
				
				frame.add(heightLabel);
				frame.add(widthLabel);
				frame.add(heightField);
				frame.add(widthField);
				frame.add(sampleSizeLabel);
				frame.add(sampleSizeField);
				frame.add(runButton);
			}});
		
		JButton lineGraphButton = new JButton("New Line Graph");
		lineGraphButton.setBounds(0, 300, 400, 150);
		lineGraphButton.setFont(new Font(null, Font.PLAIN, 32));
		lineGraphButton.setVisible(true);
		lineGraphButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				JFrame frame = new JFrame();
				frame.setLayout(null);
				frame.setSize(300, 300);
				frame.setVisible(true);
				
				JTextField widthField = new JTextField();
				widthField.setBounds(0, 50, 150, 50);
				widthField.setFont(new Font(null, Font.PLAIN, 24));
				widthField.setVisible(true);
				
				JTextField heightField = new JTextField();
				heightField.setBounds(150, 50, 150, 50);
				heightField.setFont(new Font(null, Font.PLAIN, 24));
				heightField.setVisible(true);
				
				JLabel widthLabel = new JLabel();
				widthLabel.setBounds(0, 0, 150, 50);
				widthLabel.setFont(new Font(null, Font.PLAIN, 24));
				widthLabel.setText("Width");
				widthLabel.setVisible(true);
				
				JLabel heightLabel = new JLabel();
				heightLabel.setBounds(150, 0, 150, 50);
				heightLabel.setFont(new Font(null, Font.PLAIN, 24));
				heightLabel.setText("Height");
				heightLabel.setVisible(true);
				
				JTextField sampleSizeField = new JTextField();
				sampleSizeField.setBounds(0, 150, 150, 50);
				sampleSizeField.setFont(new Font(null, Font.PLAIN, 24));
				sampleSizeField.setVisible(true);
				
				JLabel sampleSizeLabel = new JLabel();
				sampleSizeLabel.setBounds(0, 100, 150, 50);
				sampleSizeLabel.setFont(new Font(null, Font.PLAIN, 24));
				sampleSizeLabel.setText("Sample Size");
				sampleSizeLabel.setVisible(true);
				
				JButton runButton = new JButton("Run");
				runButton.setFont(new Font(null, Font.PLAIN, 24));
				runButton.setBounds(150, 150, 150, 50);
				runButton.setVisible(true);
				runButton.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {
						width = Integer.parseInt(widthField.getText());
						height = Integer.parseInt(heightField.getText());
						sampleSize = Integer.parseInt(sampleSizeField.getText());
						new LineGraph();
					}
				});
				
				frame.add(heightLabel);
				frame.add(widthLabel);
				frame.add(heightField);
				frame.add(widthField);
				frame.add(sampleSizeLabel);
				frame.add(sampleSizeField);
				frame.add(runButton);
			}});
		
		
		frame.add(pixelGraphButton);
		frame.add(barGraphButton);
		frame.add(lineGraphButton);
	}
}
