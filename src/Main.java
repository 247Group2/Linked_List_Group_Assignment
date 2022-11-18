import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
        CarStuff car1 = new CarStuff("Ford", 2021);
        CarStuff car2 = new CarStuff("Honda", 2016);
        CarStuff car3 = new CarStuff("Tesla", 2021);
        CarStuff car4 = new CarStuff("Toyota", 2019);

        mylist<String> carList = new mylist<String>("Linked List ");
        carList.insertAtBack(car1.name1 + car1.year1); //Insert Item into List A.S
        carList.insertAtBack(car2.name1 + car2.year1);// ''
        carList.insertAtBack(car3.name1 + car3.year1);// ''
        System.out.println("--------------------------------------");
        System.out.println("The original Linked List ");
        carList.print(); //prints list
        System.out.println("--------------------------------------");
        carList.insertAtFront(car4.name1 + car4.year1); //inserts item at front of list  Req 1 A.S
        System.out.println("Linked List After adding Item to front ");
        carList.print();
        System.out.println("--------------------------------------");
        carList.removeItem(2); //Removes item at specific index, if index is out of bounds prints "Index out of bounds" A.S.
        System.out.println("Linked List After removing item at index ");
        carList.print();
        System.out.println("--------------------------------------");



//For requirement 3: Rabindra Singh
        // print the list
        System.out.println("The Original linked list: " + carList);
        // Remove the last element
        Object lastElement = carList.removeLast();
        System.out.println("Element removed: "+ lastElement);
        System.out.println("The New linked list: " + carList);


    }
}