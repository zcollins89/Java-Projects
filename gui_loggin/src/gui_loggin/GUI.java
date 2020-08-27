package gui_loggin;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class GUI implements ActionListener {
	
	//GUI constructors private
	private static JFrame frame;
	private static JButton button;
	private static JLabel userLabel;
	private static JLabel passLabel;
	private static JPanel panel;
	private static JTextField userText;
	private static JPasswordField passText;
	private static JLabel success;

	public static void main(String[] args) {
		//GUI!!!!!!
		//Swing obj constructors
		panel = new JPanel();
		frame = new JFrame();
		frame.setSize(800, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.add(panel);
		
		//user label
		panel.setLayout(null);
		userLabel = new JLabel("User");
		//label position
		userLabel.setBounds(10, 20, 80, 25);
		panel.add(userLabel);
		
		//user text field
		userText = new JTextField(20);
		userText.setBounds(100, 20, 165, 25);
		panel.add(userText);
		
		//password label
		panel.setLayout(null);
		passLabel = new JLabel("Password");
		//label position
		passLabel.setBounds(10, 50, 80, 25);
		panel.add(passLabel);
		
		//password text field
		passText = new JPasswordField(20);
		passText.setBounds(100, 50, 165, 25);
		panel.add(passText);
		
		//button
		button = new JButton("Login");
		button.setBounds(10, 80, 80, 25);
		button.addActionListener(new GUI());
		panel.add(button);
		
		
		//if successful login
		success = new JLabel("");
		success.setBounds(10, 110, 300, 25);
		panel.add(success);
		
		frame.setVisible(true);
		
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		//check username and password
		String user = userText.getText();
		String password = passText.getText();
		System.out.println("User Name is: " + user + "." + " " 
		+ "Password is: " + password + ".");
		
		//if correct the login else don't login
		if(user.equals("User") && password.equals("Password")) {
			success.setText("Login Successful!!");
		}
		
		else {
			userText.setText("");
			passText.setText("");
			success.setText("INVALID Username or Password!!");
			
		}
		
	}

}
