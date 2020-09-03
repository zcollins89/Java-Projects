package int_bin_hex_oct;
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
import javax.swing.JTextField;

//import gui_test.GUI;
public class convertTo implements ActionListener {
	//private int parseInt = Integer.parseInt(intIn);
	//GUI constructors private
	private JFrame frame;
	private JButton button;
	private JLabel bin;
	private JLabel hex;
	private JLabel oct;
	private JPanel panel;
	private static JTextField input_number;
	
	
	//gui constructor
	private convertTo() {
		//create the window
		//frame constructor
		frame = new JFrame();
		//button constructor
		button = new JButton("Click to convert");
		//button listener
		button.addActionListener(this);
		button.setBounds(10, 80, 80, 25);
		//number text field
		input_number = new JTextField();
		input_number.setBounds(100, 20, 165, 25);
		//label constructor bin hex oct
		bin = new JLabel("Binary: ");
		hex = new JLabel("Hex: ");
		oct = new JLabel("Octal: ");
		//panel constructor
		panel = new JPanel();
						
		//create the panel
		panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 30));
		panel.setLayout(new GridLayout(0, 1));
		//text box
		panel.add(input_number);
		//add the button
		panel.add(button);
		//add the labels
		panel.add(bin);
		panel.add(hex);
		panel.add(oct);
				
		//add the frame to the panel
		frame.add(panel, BorderLayout.CENTER);
		frame.setSize(800, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Convert to Binary, Hex, and Octal");
		frame.pack();
		frame.setVisible(true);
		
	}

	public static void main(String[] args) {
		//GUI obj
		new convertTo();

}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		//variables
		String getInt = input_number.getText();  
		int intIn = Integer.parseInt(getInt);
		//convert to the bin hex and oct
		bin.setText("Binary: " + Integer.toBinaryString(intIn));
		hex.setText("Hex: " + Integer.toHexString(intIn));
		oct.setText("Octal: " + Integer.toOctalString(intIn));
		
	}	

}
