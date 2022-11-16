import java.util.LinkedList;

public class carName extends Throwable {

    public carName(String s) {

    }

    public carName() {

    }

    public void name() {

        LinkedList<String> list = new LinkedList<>();

        list.add("Tesla");
        list.add("Honda");
        list.add("Chevrolet");
        list.add("Ford");
        list.add("Toyota");

        list.addFirst("Lamborghini");
        list.addLast("Ferrari");
        list.remove(3);


        System.out.println(list);

    }
}
