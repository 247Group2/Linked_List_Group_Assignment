public class carName {

    public void carLL() {

        CarStuff car1 = new CarStuff(2021, "Ford", "Mustang GT");
        CarStuff car2 = new CarStuff(2016, "Honda", "Accord");
        CarStuff car3 = new CarStuff(2021, "Tesla", "Model S Plaid");
        CarStuff car4 = new CarStuff(2020, "Toyota", "Corolla SE");
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

        myList<String> carList = new myList<>("Car List");
        carList.insert(vehicle1);
        carList.insert(vehicle2);
        carList.insert(vehicle3);
        carList.insert(vehicle4);
        carList.insert(vehicle5);
        carList.insert(vehicle11);


//      STEP 0
        System.out.println("\nSTEP 0: ORIGINAL LINKED LIST:");
        carList.print(); //prints list

//      STEP 1
        System.out.println("\n----------------------------------------------------------");
        carList.insertAtFront(vehicle10); //inserts item at front of list  Req 1 A.S
        System.out.println("STEP 1: VEHICLE ADDED TO THE FRONT:");
        carList.print();

//      ORIGINAL 1
        System.out.println("\n----------------------------------------------------------");
        carList.insertAtBack(vehicle9); //inserts item at front of list  Req 1 A.S
        System.out.println("ORIGINAL 1: VEHICLE ADDED TO THE BACK:");
        carList.print();

//      STEP 2- Rabindra Singh
        System.out.println("\n----------------------------------------------------------");
        carList.removeFromBack();
        System.out.println("STEP 2: VEHICLE REMOVED FROM BACK:");
        carList.print();

//      ORIGINAL 2
        System.out.println("\n----------------------------------------------------------");
        carList.removeFromFront();
        System.out.println("ORIGINAL 2: VEHICLE REMOVED FROM FRONT:");
        carList.print();

//      STEP 3- Rabindra Singh
        System.out.println("\n----------------------------------------------------------");
        System.out.println("STEP 3: NODE BY INDEX ");
        int searchKey = 2;
        if (carName.contains(searchKey)) {
            System.out.println("INDEX NUMBER NOT FOUND!: " + searchKey);
        } else {
            System.out.println("INDEX NUMBER FOUND!: " + searchKey);
        }
        carList.print();

//      STEP 4
        System.out.println("\n--------------------------------------");
        carList.insertIndex(3, vehicle8);
        System.out.println("STEP 4: VEHICLE ADDED BY INDEXING:");
        carList.print();

//      STEP 5
        System.out.println("\n--------------------------------------");
        carList.removeItem(4);
        System.out.println("STEP 5: VEHICLE REMOVED BY INDEXING:");
        carList.print();

//      STEP 6 NEEDS WORK****
        System.out.println("\n----------------------------------------------------------");
        carList.toStringPrint();
        System.out.println("STEP 6: Linked List After removing item at index ");
        carList.print();

//      STEP 7
        System.out.println("\n----------------------------------------------------------");
        System.out.println("STEP 7: TOTAL NUMBER OF NODES:");
        System.out.println("The number of nodes: " + carList.numberOfNodes());

//      STEP 8
        System.out.println("\n----------------------------------------------------------");
        carList.clearList();
        System.out.println("STEP 8: CLEARED LINKED LIST");
        carList.print();

    }

    private static boolean contains(int searchKey) {
        return false;
    }
}