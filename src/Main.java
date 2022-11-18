public class Main {

    public static void main(String[] args) {

        mylist<String> l_list = new mylist<String>();
        // use add() method to add values in the linked list

//For requirement 3: Rabindra Singh
        // print the list
        System.out.println("The Original linked list: " + l_list);

        // Remove the last element
        Object lastElement = l_list.removeLast();
        System.out.println("Element removed: "+ lastElement);
        System.out.println("The New linked list: " + l_list);

        carName.name();
    }
}