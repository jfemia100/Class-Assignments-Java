import javax.swing.*; // JOptionPane

public class Project0 {

	public static void main(String[] args) {
	
		String inputSentence;
		int upperE, lowerE;
			
		while (true) {
			// User inputs a sentence
			inputSentence = JOptionPane.showInputDialog(null, "Please enter a sentence:");
			
			// Case that exits the while loop
			if (inputSentence.equalsIgnoreCase("Stop")) {
				System.exit(0);
			}
			
			// Methods to find the amount of upper and lower case e's
			upperE = bigE(inputSentence);
			lowerE = smallE(inputSentence);
			
			// Output message
			JOptionPane.showMessageDialog(null, "The sentence that you entered had " + upperE + " uppercase e's and " + lowerE + " lowercase e's.");
			
		}
	} //main

	
	public static int bigE(String sentence) {
	
		// Counts the amount of upper case e's in the sentence
		int count = 0;
		
		for(int i = 0; i < sentence.length(); i++){
			char b = sentence.charAt(i);
			if(b == 'E') count++;
		
		}
		
		return count;
	} 
	
	public static int smallE(String sentence){
	
	
		// Counts the amount of lower case e's in the sentence
		int count = 0;
		
		for(int i = 0; i < sentence.length(); i++){
			char b = sentence.charAt(i);
			if(b == 'e') count++;
		
		}
		
		return count;
	}
	
} // class Project0
