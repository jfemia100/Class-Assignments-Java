/**
 * This class is responsible for creating new nodes. It takes strings and sets pointers to the
 * next nodes in the list.
 * @author JOE-FEM
 *
 */
public class WordNode {
	
	public String data;
	public WordNode next;
	
	/**
	 * This constructor takes String d and turns it into a new node
	 * @param d
	 */
	public WordNode(String d){
		data = d;
		next = null;
	}
}
