/**
 * This class takes strings and turns them into a Word object with a length of three letters
 * 
 * @author JOE-FEM
 *
 */
public class Word {
	
		static int Word_Size = 3;
		
		String words;
		
		/**
		 * This constructor takes the string w and turns it into a Word
		 * 
		 * @param w
		 */
		public Word(String w){
			
			words = w;
			
		}
		
		/**
		 * This method checks to see if the Word is the correct length, it returns true or false
		 * 
		 * @return
		 */
		public boolean check(){
			if(words.length() != Word_Size) return false;
			else return true;
		}
}
