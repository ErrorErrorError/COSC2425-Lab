package lab11;
/** a typical node class for a linked list
 * single traditional linked list node
 * templated to hold any object-based type
 * @author LJBaker
 *
 * @param <T> the object based type stored in the node
 * all data is public as this is used internally by a linked list
 * never used in any public sense
 */

public class Node<T>
{

    public T data; 
    public Node<T> link;

    //default constructor 
    public Node()
	{
	    this.data = null;
	    this.link = null;
	}//end of constructor

    public Node(T theData)
	{
	    this.data = theData;
	    this.link = null;
	}

    public Node(Node<T> theLink)
	{
	    this.data = null;
	    this.link = theLink;
	}

    public Node(T theData, Node<T> theLink)
	{
	    this.data = theData;
	    this.link = theLink;
	}

}//End of Node<T> public class. 