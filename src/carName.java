import java.util.LinkedList;

public class carName extends Throwable {

    public carName(String s) {

    }

    public carName() {

    }

    public static void name() {

        CarStuff car1 = new CarStuff("Tesla", 2021);
        CarStuff car2 = new CarStuff("Honda", 2016);
        CarStuff car3 = new CarStuff("Chevrolet", 2018);
        CarStuff car4 = new CarStuff("Ford", 2014);
        CarStuff car5 = new CarStuff("Toyota", 2013);
        CarStuff car6 = new CarStuff("Lamborghini", 2022);

        LinkedList<String> carList = new LinkedList<String>();

        // Add elements to LinkedList
        carList.add(car1.name + " " + car1.year);
        carList.add(car2.name + " " + car2.year);
        carList.add(car3.name + " " + car3.year);
        carList.add(car4.name + " " + car4.year);
        carList.add(car5.name + " " + car5.year);

        System.out.println(carList);

       //carList.addFirst(car6.name + " " + car6.year);
         //System.out.println("Adding Item to front: " + carList);






    }
}
