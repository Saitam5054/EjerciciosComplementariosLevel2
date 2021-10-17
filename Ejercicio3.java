import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class Ejercicio3 {
    public static void main(String[] args){

        List<String> car = new ArrayList<>();
        cartas(car);

        System.out.print("Lista de cartas ordenadas: ");
        System.out.println(car);
        Collections.reverse(car);
        System.out.print("Lista de cartas invertidas: ");
        System.out.println(car);
        Collections.sort(car);
        System.out.print("Lista de cartas mezcladas: ");
        System.out.println(car);
    }

    public static void cartas(List<String> c){
        c.add("A");
        c.add("2");
        c.add("3");
        c.add("4");
        c.add("5");
        c.add("6");
        c.add("7");
        c.add("8");
        c.add("9");
        c.add("10");
        c.add("J");
        c.add("Q");
        c.add("K");
    }
}