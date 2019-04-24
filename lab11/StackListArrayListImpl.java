package lab11;

import java.util.ArrayList;
import java.util.List;

public class StackListArrayListImpl<T> implements StackList<T> {

    private int sMaxSize;
    private List<T> arrayList;

    //This is a default constructor with no parameters
    public StackListArrayListImpl() {
        arrayList = new ArrayList<>();
        sMaxSize = DEFAULT_MAX_SIZE;
    }

    //This is a default constructor that accepts one parameter
    public StackListArrayListImpl(int maxSize) {
        setsMaxSize(maxSize);
        this.arrayList = new ArrayList<>();
    }

    //Checks the max Size set.
    private void setsMaxSize(int sMaxSize) {

        if (sMaxSize < 0 || sMaxSize > LARGEST) {
            this.sMaxSize = DEFAULT_MAX_SIZE;
        } else {
            this.sMaxSize = sMaxSize;
        }
    }

    /*
    this overrides the method empty and checks if the list is empty by checking the count
     */
    @Override
    public boolean isEmpty() {

        return arrayList.isEmpty();
    }

    /*
This checks if the list is full by comparing max size and count
 */
    @Override
    public boolean isFull() {
        return arrayList.size() == sMaxSize;
    }

    /*
this returns the size of the list
 */
    @Override
    public int getSize() {
        return arrayList.size();
    }

    /*
        This returns the max size.
     */
    @Override
    public int getMaxSize() {
        return sMaxSize;
    }

    /*
        This adds the object to the list if it's not full
     */
    @Override
    public void push(T element) {

        if (isFull()) {
            throw new RuntimeException("Reached Full Capacity");
        } else {

            arrayList.add(element);
        }
    }


    /*
    This returns the top item from the list and removes it from the stack.
     */
    @Override
    public T pop() {

        if (!isEmpty()) {
            T retVal = arrayList.get(getSize() - 1);

            arrayList.remove(getSize() - 1);

            return retVal;
        } else {
            throw new RuntimeException("Cannot return and remove an empty list");
        }
    }

    /*
        this returns the top item from the list and does not delete it from the list
     */
    @Override
    public T peek() {

        if (!isEmpty()) {
            return arrayList.get(getSize() - 1);
        } else {
            throw new RuntimeException("Cannot return an empty list");
        }

    }

    /*
    this clears the list
     */
    @Override
    public void clear() {
        arrayList.clear();
    }


    /*
    this returns the list as a string
     */
    @Override
    public String toString() {
        String retVal = "";

        for (int i = getSize() - 1; i >= 0; i--) {
            retVal += arrayList.get(i).toString() + "\n";
        }

        return retVal;

    }
}
