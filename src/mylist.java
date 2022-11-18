import java.util.NoSuchElementException;

public class mylist<T> {

    public ListNode < T > first;
    public ListNode < T > last;

    public String name;		// string used in printing
    public mylist ()  {    // default constructor
    }
    //constructor creates an empty List with a name
    public mylist (String carList)
    {
        name = carList;
        first = last = null;
    }
        //insert atBack
    public void insertAtBack(T insertItem)
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

    //1.

    // 2. Remove an item from end. Throw an exception if the program attempts to remove an item from an empty list: Rabindra Singh
    public T removeFromEnd() throws NoSuchElementException {
        if (isEmpty()) {
            throw new NoSuchElementException(name);
        }
        T removedItem = last.data;

        if (last == first) {
            last = first = null;
        } else {
            last = last.nextNode;
        }
        return removedItem;
    }


    //3.Search for an item by index number (the number of its position in the list) and display the information for that library item.
    // Validate that the index number is within bounds and throw an appropriate exception if not: Rabindra Singh
    public T searchIndex(int index) throws carName {
        int size = this.size();
        if (index < 0 || index >= size)
            throw new carName("OUT OF BOUNDS!");
        else {
            ListNode<T> firstNode = null;
            ListNode<T> find = firstNode;
            for (int i = 0; i < index; i++)
                find = find.nextNode;
            return find.data;
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

// 6: Ameed
//count nodes in the list

//node structure
class Node {
  int data;
  Node next;
};

class LinkedList {
Node head;

LinkedList(){
  head = null;
}
int countNodes() {
  Node temp = new Node();
  temp = this.head;
  int i = 0;
  while(temp != null) {
    i++;
    temp = temp.next;
  }
  return i;  
}

// 7: Ameed
//display the content of the list
void PrintList() {
  Node temp = new Node();
  temp = this.head;
  if(temp != null) {
    System.out.print("The list contains: ");
    while(temp != null) {
      System.out.print(temp.data + " ");
      temp = temp.next;
    }
    System.out.println();
  } else {
    System.out.println("The list is empty.");
  }
}
}

