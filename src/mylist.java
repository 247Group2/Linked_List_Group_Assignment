import java.util.NoSuchElementException;

public class mylist < T > {

    public ListNode < T > first;
    public ListNode < T > last;

    public String name;		// string used in printing
    public mylist ()  {    // default constructor
    }
    //constructor creates an empty List with a name
    public mylist (String listName)
    {
        name = listName;
        first = last = null;
    }
    //insert item at the back
    public void insertAtBack (T insertItem)
    {
        if (isEmpty ())
        {
            first = last = new ListNode < T > (insertItem);
        }
        else
        {
            ListNode < T > current = first;
            while (current.nextNode != null)
            {
                current = current.nextNode;
            }
            current.nextNode = last = new ListNode < T > (insertItem);
        }
    }

    //determine whether list is empty
    public boolean isEmpty ()
    {
        return first == null;	// return true if list is empty
    }

    //output list contents
    public void print ()
    {
        if (isEmpty ())
        {
            System.out.printf ("Empty %s\n", name);
            return;
        }
        System.out.printf ("%s is: ", name);
        ListNode < T > current = first;

        //while not at end of list, output current node's data
        while (current != null)
        {
            System.out.printf ("%s ", current.data.toString());
            current = current.nextNode;
        }
        System.out.println ();
    }

    public int size ()		// returns the number of items in the list
    {
        int count = 0;
        ListNode < T > current = first;
        while (current != null)
        {

            count++;

            current = current.nextNode;

        }
        return count;
    }

    //remove first node from List
    public T removeFromFront() throws NoSuchElementException {
        if (isEmpty()) {// throw exception if List is empty
            throw new NoSuchElementException(name);
        }
        T removedItem = first.data;// retrieve data being removed

//update references firstNode and lastNode
        if (first == last) {
            first = last = null;
        } else {
            first = first.nextNode;
        }
        return removedItem;// return removed node data
    }

    public void add(T pink) {
    }

    public T removeLast() {
        return null;
    }
}