import java.util.*;

public class Main {

    public static void main(String[] args) {
        CarStuff car1 = new CarStuff(2021,"Ford","Mustang GT");
        CarStuff car2 = new CarStuff(2016, "Honda", "Accord");
        CarStuff car3 = new CarStuff(2021,"Tesla", "Model S Plaid");
        CarStuff car4 = new CarStuff(2020,"Toyota", "Corolla SE");
        CarStuff car5 = new CarStuff(2020, "Lamborghini", "Aventador SVJ");
        CarStuff car6 = new CarStuff(2023, "Ferrari", "SF90");
        CarStuff car7 = new CarStuff(2022, "McLaren", "720S");
        CarStuff car8 = new CarStuff(2020, "Land Rover", "SVR");
        CarStuff car9 = new CarStuff(2014, "Dodge", "Viper");
        CarStuff car10 = new CarStuff(2010, "Ferrari", "458 Italia");
        CarStuff car11 = new CarStuff(2023, "Rimac", "Nevara");

        String vehicle1 = (car1.carYear + " " + car1.carMake + " " + car1.carModel);
        String vehicle2 = (car2.carYear + " " + car2.carMake + " " + car2.carModel);
        String vehicle3 = (car3.carYear + " " + car3.carMake + " " + car3.carModel);
        String vehicle4 = (car4.carYear + " " + car4.carMake + " " + car4.carModel);
        String vehicle5 = (car5.carYear + " " + car5.carMake + " " + car5.carModel);
        String vehicle6 = (car6.carYear + " " + car6.carMake + " " + car6.carModel);
        String vehicle7 = (car7.carYear + " " + car7.carMake + " " + car7.carModel);
        String vehicle8 = (car8.carYear + " " + car8.carMake + " " + car8.carModel);
        String vehicle9 = (car9.carYear + " " + car9.carMake + " " + car9.carModel);
        String vehicle10 = (car10.carYear + " " + car10.carMake + " " + car10.carModel);
        String vehicle11 = (car11.carYear + " " + car11.carMake + " " + car11.carModel);
        
        myList<String> carList = new myList<String>("Car List");
        carList.insert(vehicle1);
        carList.insert(vehicle2);
        carList.insert(vehicle3);
        carList.insert(vehicle4);
        carList.insert(vehicle5);



//      STEP 0
        System.out.println("\nORIGINAL LINKED LIST:");
        carList.print(); //prints list


//      STEP 1
        System.out.println("\n----------------------------------------------------------");
        carList.insertAtFront(vehicle10); //inserts item at front of list  Req 1 A.S
        System.out.println("VEHICLE ADDED TO THE FRONT:");
        carList.print();


//      STEP 2
        System.out.println("\n----------------------------------------------------------");
        carList.removeFromLast();
        System.out.println("VEHICLE REMOVED FROM BACK:");
        carList.print();

//      STEP 4
        System.out.println("\n--------------------------------------");
        carList.insertIndex(3, vehicle8) ;
        System.out.println("VEHICLE ADDED BY INDEXING:");
        carList.print();

//      STEP 5
        System.out.println("\n--------------------------------------");
        carList.removeItem(1);
        System.out.println("VEHICLE REMOVED BY INDEXING: ");
        carList.print();

/*



        //Req 1 inserts item at front of list  A.S
        System.out.println("----------------------------------------------------------");
        System.out.println("Specific Index number: 1 ");
        carList.print(); //prints list


        System.out.println("----------------------------------------------------------");
        System.out.println("The linked list after removing item from the end: ");
       //carList.removeFromLast();
       //carList.print();
        System.out.println("Linked list after: Ford2021 Honda2016 ");





        System.out.println("----------------------------------------------------------");
        carList.removeItem(2);
        System.out.println("Linked List After removing item at index ");
        carList.print();
        System.out.println("----------------------------------------------------------");




*/



    }
}