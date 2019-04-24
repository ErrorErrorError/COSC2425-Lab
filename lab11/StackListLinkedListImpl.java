package lab11;

public class StackListLinkedListImpl<T> implements StackList<T> {

    private int sMaxSize;
    private Node<T> sFirst;
    private int count = 0;

    //This is a default constructor with no parameters
    public StackListLinkedListImpl() {
        this.sMaxSize = DEFAULT_MAX_SIZE;
        this.sFirst = null;
    }

    //This is a default constructor that accepts one parameter
    public StackListLinkedListImpl(int sMaxSize) {
        setsMaxSize(sMaxSize);
        this.sFirst = null;
    }

    //Sets the max Size.
    private void setsMaxSize(int sMaxSize) {

        if(sMaxSize < 0 || sMaxSize > LARGEST)
        {
            this.sMaxSize = DEFAULT_MAX_SIZE;
        }

        else
        {
            this.sMaxSize = sMaxSize;
        }
    }

    /*
    this overrides the method empty and checks if the Node is empty by checking the count
     */
    @Override
    public boolean isEmpty() {

        return count == 0;
    }

    /*
    This checks if the stack is full by comparing max size and count
     */
    @Override
    public boolean isFull() {
        return sMaxSize == count;
    }

    /*
    this returns the size of the stack
     */
    @Override
    public int getSize() {
        return count;
    }

    /*
    this returns the max size
     */
    @Override
    public int getMaxSize() {
        return sMaxSize;
    }

    /*
    this inserts the object in the stack
     */
    @Override
    public void push(T element) {

        if(isFull()) {
            throw new RuntimeException("Reached Max Capacity");
        }

        else
        {
            Node<T> temp = new Node<>();

            if(sFirst == null)
            {
                temp.data = element;
                sFirst = temp;
            }

            else
            {
                temp.data = element;
                temp.link = sFirst;

                sFirst = temp;

            }

            count++;
        }
    }


    /*
    This returns the top item from the stack and removes it from the stack.
     */
    @Override
    public T pop() {

        if(!isEmpty())
        {
            T retObj = sFirst.data;
            sFirst = sFirst.link;
            count--;

            return retObj;
        }

        else
        {
            throw new RuntimeException("Cannot return and remove an empty stack");
        }
    }

    /*
    This returns the object from the top stack without erasing it from the stack
     */
    @Override
    public T peek() {

        if(!isEmpty())
        {
            return sFirst.data;
        }

        else
        {
            throw new RuntimeException("Cannot return an empty stack");
        }

    }

    /*
    this clears the stack and counter
     */
    @Override
    public void clear() {


        sFirst = null;
        count = 0;
    }


    /*
    this is a toString to understand what values are in the node
     */
    @Override
    public String toString() {
        String retVal = "";

        Node<T> test = sFirst;
        while(test != null)
        {
            retVal += test.data.toString() + "\n";

            test = test.link;
        }

        return retVal;

    }

}
