
import java.util.*;

public class Project1 {

	public static void main(String[] args){
	
		
		//countRows gives you the amount of rows in the text file
		int NumOfRows = countRows("Words.txt");
		
		//countWords gives you the total amount of words
		int NumOfWords = countWords("Words.txt", NumOfRows);
		
		//fillArray takes the words from the file and puts them into WordArray
		String [] WordArray = fillArray("Words.txt", NumOfRows, NumOfWords);
		
		// this prints the words that are not 3 letters to the console
		for(int i = 0; i < NumOfWords; i++){
			if(WordArray[i].length() != 3) System.out.println(WordArray[i]);
		}
		
		// this sorts the array of words taken from the file
		String [] SortedArray = selectionSort(WordArray, NumOfWords);
		
		// This array is the same as WordArray
		String [] OriginalArray = fillArray("Words.txt", NumOfRows, NumOfWords);
		
		//this calls the WordGUI Class and ouputs a JFrame with the unsorted and sorted arrays
		WordGUI gui = new WordGUI();
		gui.initialize();
		gui.PrintToFrame(OriginalArray, SortedArray);
		
	}
	
	// this method counts rows
	public static int countRows(String myFile){
		TextFileInput in = new TextFileInput(myFile);
		String line = in.readLine();

		int count = 0;
		
		//counts rows until there is nothing left
		while (line != null){
			line = in.readLine();
			count++;
		}
		
		in.close();
		return count;
	}
	
	// counts the amount of words
	public static int countWords(String myFile, int Num){
		TextFileInput in = new TextFileInput(myFile);
		String line;
		StringTokenizer st;

		int count = 0;
		
		//goes through the whole file and counts every word
		for(int i = 0; i < Num; i++){
			line = in.readLine();
			st = new StringTokenizer(line, ",");
			while(st.hasMoreTokens()){
				String words = st.nextToken();
				count++;
			}
		}
		
		in.close();
		return count;
		
	}
	
	//fills the array with strings from the file
	public static String [] fillArray(String myFile, int Rows, int Words){
		TextFileInput in = new TextFileInput(myFile);
		String line;
		StringTokenizer st;

		// uses the amount of words for the size of the array
		String [] Array = new String[Words];
		int count = 0;
		
		// puts each word into the array
		for(int i = 0; i < Rows; i++){
			line = in.readLine();
			st = new StringTokenizer(line, ",");
			while(st.hasMoreTokens()){
				String words = st.nextToken();
				Array[count] = words;
				count++;
			}
		}
		
		in.close();
		return Array;
		
	}
	
	// this method is used to sort the array of strings that was made from the file
	public static String [] selectionSort(String [] Array, int Num){
		for(int i = 1; i < Num; i++){
			int s = i - 1;
			for(int j = i; j < Num; j++){
				if(Array[j].compareTo(Array[s]) < 0) s = j;
			}
			String temp = Array[i - 1];
			Array[i - 1] = Array[s];
			Array[s] = temp;
		}
		return Array;
	}
	
}
