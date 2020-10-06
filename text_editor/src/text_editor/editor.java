package text_editor;
//this project is from a tutoral by
//https://www.geeksforgeeks.org/java-swing-create-a-simple-text-editor/#:~:text=To%20create%20a%20simple%20text%20editor%20in%20Java,it%20will%20contain%20two%20menus%20and%20a%20button%3A
//much of the code has been replaced with my own
//ALL RIGHTS RESERVED
import javax.swing.*; 
import java.io.*; 
import java.awt.event.*;
import java.awt.print.PrinterException;

import javax.swing.plaf.metal.*; 

public class editor extends JFrame implements ActionListener {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	//text area 
    JTextArea text = new JTextArea();
    
    //frame field
    JFrame frame = new JFrame("Editor");
    
	//constructor
    editor(){
    	        
        //exception handler
        try {
        	//set look and feel to metal
        	UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");
        	//set theme to ocean
        	 MetalLookAndFeel.setCurrentTheme(new OceanTheme());
        }
        catch(Exception e){
        	
        }
      
        
      //menu bar
      JMenuBar bar = new JMenuBar();
        
      //first item for the menu
      JMenu fileBar = new JMenu("File");
        
      //items for the file bar
      JMenuItem itm1 = new JMenuItem("New"); 
      JMenuItem itm2 = new JMenuItem("Open"); 
      JMenuItem itm3 = new JMenuItem("Save"); 
      JMenuItem itm4 = new JMenuItem("Print");
        
      //action listeners 
      itm1.addActionListener(this); 
      itm2.addActionListener(this); 
      itm3.addActionListener(this); 
      itm4.addActionListener(this); 
      
      //add the items
      fileBar.add(itm1); 
      fileBar.add(itm2); 
      fileBar.add(itm3); 
      fileBar.add(itm4);
      
      //edit menu
      JMenu editBar = new JMenu();
      
    //items for the edit bar
    JMenuItem itm5 = new JMenuItem("Cut"); 
    JMenuItem itm6 = new JMenuItem("Copy"); 
    JMenuItem itm7 = new JMenuItem("Paste"); 
    
    //action listeners
    itm5.addActionListener(this); 
    itm6.addActionListener(this); 
    itm7.addActionListener(this); 
    
    //add items
    editBar.add(itm5);
    editBar.add(itm6);
    editBar.add(itm7);
    
    //close 
    JMenuItem close = new JMenuItem("Close");
    
    //action listener
    close.addActionListener(this);
    
    //add the items to the main bar
    bar.add(fileBar);
    bar.add(editBar);
    bar.add(close);
    
    frame.setJMenuBar(bar); 
    frame.add(text); 
    frame.setSize(500, 500); 
    frame.show(); 
        
    }

	public static void main(String[] args) {
		//open the editor
		editor textEd = new editor(); 

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		//this is the even listener for the whole text editor
		//if any of the button are pressed it will execute from here
		
		String str = e.getActionCommand();
		
		//if/else for cut, copy, paste, and save
		if(str.equals("Cut")) {
			text.cut();
		}
		
		else if(str.equals("Copy")) {
			text.copy();
		}
		
		else if(str.equals("Paste")) {
			text.paste();
		}
		
		else if(str.equals("Save")) {
			 //file chooser obj
            JFileChooser file = new JFileChooser("Save Dialog: "); 
  
            //Invoke the showsSaveDialog function to show the save dialog 
            int r = file.showSaveDialog(null); 
  
            if (r == JFileChooser.APPROVE_OPTION) { 
  
                // Set the label to the path of the selected directory 
                File fi = new File(file.getSelectedFile().getAbsolutePath()); 
  
                try { 
                    //file writer obj 
                    FileWriter wrt = new FileWriter(fi, false); 
  
                    // Create buffered writer to write 
                    BufferedWriter buffWrt = new BufferedWriter(wrt); 
  
                    // Write 
                    buffWrt.write(text.getText()); 
  
                    buffWrt.flush(); 
                    buffWrt.close(); 
                } 
                catch (Exception evt) { 
                    JOptionPane.showMessageDialog(file, evt.getMessage()); 
                } 
		}
	}
	  
    else if (str.equals("Print")) { 
    	//print
    	try {
			text.print();
		} catch (PrinterException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} 
    }
		
		//open the file
    else if(str.equals("Open")) {
    	 // Create an object of JFileChooser class 
        JFileChooser open = new JFileChooser("f:"); 

        // Invoke the showsOpenDialog function to show the save dialog 
        int r = open.showOpenDialog(null); 

        // If the user selects a file 
        if (r == JFileChooser.APPROVE_OPTION) { 
            // Set the label to the path of the selected directory 
            File fi = new File(open.getSelectedFile().getAbsolutePath()); 

            try { 
                // String 
                String s1 = "", sl = ""; 

                // File reader 
                FileReader fr = new FileReader(fi); 

                // Buffered reader 
                BufferedReader br = new BufferedReader(fr); 

                // Initilize sl 
                sl = br.readLine(); 

                // Take the input from the file 
                while ((s1 = br.readLine()) != null) { 
                    sl = sl + "\n" + s1; 
                } 

                // Set the text 
                text.setText(sl); 
            } 
            catch (Exception evt) { 
                JOptionPane.showMessageDialog(frame, evt.getMessage()); 
            } 
        } 
        // If the user cancelled the operation 
        else
            JOptionPane.showMessageDialog(frame, "the user cancelled the operation"); 
    } 
    else if (str.equals("New")) { 
        text.setText(""); 
    } 
    else if (str.equals("close")) { 
        frame.setVisible(false); 
    } 
    }
		
} 
 




 

