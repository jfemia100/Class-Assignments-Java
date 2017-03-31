/**
 * This class creates the list of nodes. It uses the class WordNode and links nodes to each other.
 * It contains the getLength, append, insert, and toString methods.
 * 
 * @author JOE-FEM
 *
 */

public class WordList {

	private WordNode first = new WordNode(null);
	
	private WordNode last = first;
	
	private int length = 0;
	
	/**
	 * This method returns the length since it is private
	 * @return
	 */
	public int getLength(){
		return length;
	}
	
	/**
	 * This method takes in a Word d and adds it to the end of the linked list
	 * @param d
	 */
	public void append(Word d){
		WordNode wn = new WordNode(d.words);
		last.next = wn;
		last = wn;
		length++;
	}
	
	/**
	 * This method takes in a Word d and inserts it into the linked list in alphabetical order
	 * @param d
	 */
	public void insert(Word d){
		
		// ***
		// When I run the program this method works, but for some reason it only 
		// sorts some of the words and I wasn't able to figure out why that was 
		// happening.
		
		WordNode wn = new WordNode(d.words);
		if(length == 0){
			last.next = wn;
			last = wn;
			length++;		
		}
		else{
			WordNode current = first.next;
			WordNode previous = null;
			String s = current.data;
			while(((d.words).compareTo(s) > 0) && (current != null)){

				previous = current;
				current = current.next;
				s = previous.data;
			}
			
			
			if (previous == null){
				wn.next = first.next;
				first.next = wn;
			}
			else{
				previous.next = wn;
				wn.next = current;
			}
			
			if(wn.next == null){
				last = wn;
			}
			
			length++;
		}
	}
	/*
	public void printList(){
		WordNode p = first.next;
		while(p != null){
			System.out.println(p.data);
			p = p.next;
		}
	}
	*/
	
	/**
	 * This method takes the linked list and turns it into a string so that it can be displayed
	 * in the GUI
	 */
	public String toString(){
	   
		String r = "";
	    WordNode p = first.next;
	    while (p != null){
	       
	    	r += p.data + "\n";
	    	p = p.next;
	    }
     
	    return r.toString(); 
	  }

	
}
