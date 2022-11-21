import java.util.*;

public class myList<T> {

    public ListNode<T> first;
    public ListNode<T> last;

    public String name; // string used in printing
    public myList() { // default constructor
    }
    //constructor creates an empty List with a name
    public myList(String listName) {
        name = listName;
        first = last = null;
    }

    // determine whether list is empty
    public boolean isEmpty() {
        return first == null;    // return true if list is empty
    }

    // returns the number of items in the list
    public int size(){

        int count = 0;
        ListNode<T> current = first;
        while (current != null) {

            count++;

            current = current.nextNode;

        }
        return (count);
    }

//  INPUTTING THE DATA
    public void insert(T insertData) {
        ListNode node = new ListNode(insertData);
        node.data = insertData;
        node.nextNode = null;

        if (first == null) {
            first = node;
        } else {
            ListNode n = first;
            while (n.nextNode != null) {
                n = n.nextNode;
            }
            n.nextNode = node;
        }
    }

//  1.INSERT AT FRONT - ANDREW STINE
    public void insertAtFront(T insertItem) {
        if (isEmpty()) {
            first = last = new ListNode<>(insertItem);
        } else {
            first = new ListNode<>(insertItem, first);
        }
    }

//  INSERT AT BACK - ORIGINAL CODE
    public void insertAtBack(T insertItem) {
        if (isEmpty()) {
            first = last = new ListNode<>(insertItem);
        } else {
            ListNode<T> current = first;
            while (current.nextNode != null) {
                current = current.nextNode;
            }
            current.nextNode = last = new ListNode<>(insertItem);
        }
    }

    //output list contents
    public void print() {
        if (isEmpty()) {
            System.out.printf("Empty %s\n", name);
            return;
        }
        System.out.printf("%s is: ", name);
        ListNode<T> current = first;

        //while not at end of list, output current node's data
        while (current != null) {
            System.out.printf("%s ", current.data.toString());
            current = current.nextNode;
        }
        System.out.println();
    }

//  2. REMOVE FROM BACK - RABINDRA SINGH
    public void removeFromBack() throws NoSuchElementException {
        if (isEmpty()) {
            throw new NoSuchElementException(name);
        }

        ListNode<T> current = first;
        ListNode<T> previous = null;

        while (current.nextNode != null) {
            previous = current;
            current = current.nextNode;
        }
        previous.nextNode = null;
    }

//  REMOVE FROM FRONT - ORIGINAL
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

//  3. INDEX SEARCH - RABINDRA SINGH

    public  boolean findIndex(T searchKey){
        if(first == null){
            return false;
        }
        ListNode<T> current = first;
        while(current != null){
            if(current.data == searchKey){
                return true;
            }
            current = current.nextNode;
        }
        return false;
    }

   /*public T searchForItem(int index) throws IndexOutOfBoundsException {
        int size = this.size();
        if (index < 0 || index >= size)
            throw new IndexOutOfBoundsException("OUT OF BOUNDS!");
        else {
            ListNode<T> find = first;
            for (int i = 0; i < index; i++)
                find = find.nextNode;

            return find.data;
        }
    }


    */


//  4. SPECIFIC INDEX NUMBER - KEVIN SHIELDS
    public void insertIndex(int index, T insertItem) {
        ListNode<T> node = new ListNode<>(insertItem);

        if (index == 1) {
            node.nextNode = first;
            first = node;
        } else {
            ListNode<T> lastNode = first;
            int count = 1;

            while (count < index - 1) {
                lastNode = lastNode.nextNode;
                count++;
            }
            ListNode<T> currentNode = lastNode.nextNode;
            lastNode.nextNode = node;
            node.nextNode = currentNode;
        }
    }

//  5. REMOVE ITEM FROM INDEX NUMBER - ANDREW STINE
    public void removeItem(int index) {
        try { // Tries the code below
            ListNode<T> rem = first;
            for (int i = 0; i < index - 1; i++) {
                rem = rem.nextNode;
            }
            rem.nextNode = rem.nextNode.nextNode;
        } catch (Exception e) {
            System.out.println("Index Out Of Bounds!! ");
        }
    }

//  6. PRINT ALL ITEMS TO TO-STRING
    public void toStringPrint() {
        StringBuilder result = new StringBuilder(first.toString());
        ListNode<T> current = first;
        while (current.getNext() != null) {
            result.append(current.getData()).append("\n");
            if (current.getNext() != null) {
                result.append(", ");
            }
            current = current.getNext();
        }
    }



//  7. DISPLAY NODE TOTAL - AMEED SHAIKH
 /*  public void PrintList() {
       ListNode temp = new ListNode();
       temp = this.first;
        if (temp != null) {
           System.out.print("The list contains: ");
           while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.nextNode;
           }
            System.out.println();
        } else {
           System.out.println("The list is empty.");
      }
   }
*/
//Req 7
    public int numberOfNodes(){
        ListNode temp = first;
        int count = 0;
        while (temp != null) {
            count++;
            temp = temp.nextNode;

           // System.out.println(count);
        }
        return count;
    }


//  8. CLEAR LIST
    public void clearList() {
        first = null;
    }






}

//    public void countNodes() {
//
//        ListNodeNode<T> temp = new ListNode<T>();
//            temp = this.first;
//            int i = 0;
//            while (temp != null) {
//                i++;
//                temp = temp.nextNode ;
//            }
//            return i;
//        }



/*
// 6 : Ameed
//count nodes in the list

//node structure
class Node {
    int data;
    Node next;
}

class LinkedList {
    Node head;

    LinkedList() {
        head = null;
    }

    int countNodes() {
        Node temp = new Node();
        temp = this.head;
        int i = 0;
        while (temp != null) {
            i++;
            temp = temp.next;
        }
        return i;
    }
}
/*
        // 7: Ameed
//display the content of the list
        public void PrintList() {
            Node temp = new Node();
            temp = this.head;
            if (temp != null) {
                System.out.print("The list contains: ");
                while (temp != null) {
                    System.out.print(temp.data + " ");
                    temp = temp.next;
                }
                System.out.println();
            } else {
                System.out.println("The list is empty.");
            }
        }
    }

STEP 3


 */






