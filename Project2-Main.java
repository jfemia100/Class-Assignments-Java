
import java.util.*;
/**
 * This class contains the main function for the program. 
 * @author JOE-FEM
 *
 */
public class Project2 {

	public static void main(String [] args){

		WordList myList1 = new WordList();
		WordList myList2 = new WordList();
		Word w;

		
		int NumOfRows = countRows("Words.txt");

		
		TextFileInput in = new TextFileInput("Words.txt");
		String line;
		StringTokenizer st;

		for(int i = 0; i < NumOfRows; i++){
			line = in.readLine();
			st = new StringTokenizer(line, ",");
			while(st.hasMoreTokens()){
				String words = st.nextToken();
				w = new Word(words);
				if(w.check() == true){
					myList2.insert(w);
					myList1.append(w);
				}
				else System.out.println(words);

			}
		}
		
		in.close();
		
		WordGUI gui = new WordGUI();
		gui.initialize();
		gui.PrintToFrame(myList2, myList1);
	
	}
	/**
	 * This method counts the number of rows in the text file
	 * @param myFile
	 * @return
	 */
	public static int countRows(String myFile){
		TextFileInput in = new TextFileInput(myFile);
		String line = in.readLine();

		int count = 0;
		
		while (line != null){
			line = in.readLine();
			count++;
		}
		
		in.close();
		return count;
	}

}
