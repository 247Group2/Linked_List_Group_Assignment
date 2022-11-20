public class CarStuff {  //A.S. and K.S.

    public int carYear;
    public String carMake;
    public String carModel;

   // public CarStuff(String ford, int i, String honda, int i1){}
    public CarStuff(int year, String make, String model){
        this.carYear = year;
        this.carMake = make;
        this.carModel = model;

    }

    @Override
    public String toString() {  //Andrew Stine
        return carYear + " " + carMake + " " + carModel;
    }
}


