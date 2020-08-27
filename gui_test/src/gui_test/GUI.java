package gui_test;
//import the java packages
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class GUI implements ActionListener {
	
	//global variable count
	private int count = 0;
	//GUI constructors private
	private JFrame frame;
	private JButton button;
	private JLabel label;
	private JPanel panel;
	
	//gui constructor
	public GUI() {
		//create the window
		//frame constructor
		frame = new JFrame();
		//button constructor
		button = new JButton("Click Me!!!!!!");
		//button listener
		button.addActionListener(this);
		//label constructor
		label = new JLabel("Nuber of Clicks: 0");
		//panel constructor
		panel = new JPanel();
		
		//create the panel
		panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 30));
		panel.setLayout(new GridLayout(0, 1));
		//add the button
		panel.add(button);
		//add the label
		panel.add(label);
		
		//add the frame to the panel
		frame.add(panel, BorderLayout.CENTER);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("First GUI");
		frame.pack();
		frame.setVisible(true);
		
	}

	public static void main(String[] args) {
		//GUI obj
		new GUI();

	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// Increment count
		count++;
		label.setText("Number of Clicks: " + count);
		
	}

}
