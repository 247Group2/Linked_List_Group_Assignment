public class CarStuff {  //Andrew Stine
     public String name1;
    public int year1;
    public CarStuff(){}
    public CarStuff(String carname, int caryear){
        this.name1 = carname;
        this.year1 = caryear;
    }

    @Override
    public String toString() {  //Andrew Stine
        return name1 + " " + year1;
    }
}


