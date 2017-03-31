// Import Statements

import javax.swing.*;
import java.awt.*;

public class WordGUI{
	//all the static values for the class
	static JFrame myFrame;
	static Container myContainer;
	static TextArea sorted, notsorted;
	

	// this method initializes the JFrame
	public static void initialize(){
		myFrame = new JFrame();
		myFrame.setSize(1000, 500);
		myFrame.setLocation(100, 100);
		myFrame.setTitle("Not Sorted and Sorted");
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		myFrame.setVisible(true);

	}
	
	// this method adds content to the JFrame
	public static void PrintToFrame(String [] Array, String [] Array1){
		Container myContainer = myFrame.getContentPane();
		TextArea sorted = new TextArea();
		TextArea notsorted = new TextArea();
		
		myContainer.add(sorted, BorderLayout.EAST);
			for(int i = 0; i < Array1.length; i++){
				if(Array1[i].length() == 3){
					sorted.append(Array1[i]+ "\n");
				}
			}
		
		myContainer.add(notsorted, BorderLayout.WEST);
			for(int i = 0; i < Array.length; i++){
				if(Array[i].length() == 3){
					notsorted.append(Array[i]+"\n");
				}
			}
			
		myFrame.setVisible(true);

	}

}
