public class CarStuff {
    public String name;
    public int year;
    public CarStuff(){}
    public CarStuff(String carname, int caryear){
        this.name = carname;
        this.year = caryear;
    }

    @Override
    public String toString() {
        return name + " " + year;
    }
}


