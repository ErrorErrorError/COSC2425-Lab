package lab11;

public class QueueListLinkedListImpl<T> implements QueueList<T> {


    private int sMaxSize;
    private Node<T> sFirst, sLast;
    private int count = 0;


    public QueueListLinkedListImpl() {
        this.sMaxSize = DEFAULT_MAX_SIZE;
        this.sLast = null;
        this.sFirst = null;
    }

    public QueueListLinkedListImpl(int largest) {
        this.sFirst = null;
        this.sLast = null;
        setsMaxSize(largest);
    }

    //Sets the max Size.
    private void setsMaxSize(int sMaxSize) {

        if (sMaxSize < 0 || sMaxSize > LARGEST) {
            this.sMaxSize = DEFAULT_MAX_SIZE;
        } else {
            this.sMaxSize = sMaxSize;
        }
    }

    /*
        this overrides the method empty and checks if the queue is empty by checking the count
     */
    @Override
    public boolean isEmpty() {
        return count == 0;
    }

    /*
        This checks if the list is full by comparing max size and count
    */
    @Override
    public boolean isFull() {
        return this.sMaxSize == this.count;
    }

    /*
        this returns the number of items in queue
     */
    @Override
    public int getSize() {
        return this.count;
    }


    /*
        this returns the max size
     */
    @Override
    public int getMaxSize() {
        return this.sMaxSize;
    }

    /*
        This adds elements to the back
     */
    @Override
    public void add(T element) {

        if (isFull()) {
            throw new RuntimeException("Cannot add element to queue. The queue is full.");
        } else {

            Node<T> temp = sLast;
            sLast = new Node<>(element);

            if (isEmpty()) {
                sFirst = this.sLast;
            } else {
                temp.link = this.sLast;
            }

            count++;
        }

    }

    /*
        this removes the element from the front
     */
    @Override
    public T remove() {
        if (isEmpty()) {
            throw new RuntimeException("Cannot remove element from an empty queue.");
        }

        T retVal = this.sFirst.data;
        sFirst = this.sFirst.link;

        if (sFirst == null) {
            this.sLast = null;
        }
        count--;

        return retVal;

    }

    /*
        this returns the first element from queue
     */
    @Override
    public T getFront() {

        if (isEmpty()) {
            throw new RuntimeException("Cannot get object from empty queue");
        }

        return sFirst.data;
    }

    /*
        this returns the last element from queue
    */

    @Override
    public T getRear() {

        if (isEmpty()) {
            throw new RuntimeException("Cannot get object from empty queue");
        }

        return sLast.data;
    }

    //This resets the queue and count
    @Override
    public void clear() {
        count = 0;
        sFirst = null;
        sLast = null;
    }

    //Returns into to string
    @Override
    public String toString() {
        String retVal = "";
        Node<T> test = sFirst;
        while (test != null) {
            retVal += test.data.toString() + "\n";
            test = test.link;
        }

        return retVal;
    }
}
