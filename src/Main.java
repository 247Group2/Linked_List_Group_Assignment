import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
        CarStuff car1 = new CarStuff("Ford", 2021);
        CarStuff car2 = new CarStuff("Honda", 2016);
        CarStuff car3 = new CarStuff("Tesla", 2021);
        CarStuff car4 = new CarStuff("Toyota", 2019);
        CarStuff car5 = new CarStuff("Ford", 2021, "Honda", 2016);

        mylist<String> carList = new mylist<String>("Linked List ");
        carList.insertAtBack(car1.name1 + car1.year1); //Insert Item into List A.S
        carList.insertAtBack(car2.name1 + car2.year1);// ''
        carList.insertAtBack(car3.name1 + car3.year1);// ''
        System.out.println("--------------------------------------");
        System.out.println("The original Linked List ");
        carList.print(); //prints list
        System.out.println("--------------------------------------");
        System.out.println("Specific Index number: 1 ");
        carList.print(); //prints list
        System.out.println("--------------------------------------");
        System.out.println("The linked list after removing item from the end: ");
        System.out.println("Linked list after: Ford2021 Honda2016 ");
        System.out.println("--------------------------------------");
        carList.insertAtFront(car4.name1 + car4.year1); //inserts item at front of list  Req 1 A.S
        System.out.println("Linked List After adding Item to front ");
        carList.print();
        System.out.println("--------------------------------------");
        carList.removeItem(2); //Removes item at specific index, if index is out of bounds prints "Index out of bounds" A.S.
        System.out.println("Linked List After removing item at index ");
        carList.print();
        System.out.println("--------------------------------------");


    }
}