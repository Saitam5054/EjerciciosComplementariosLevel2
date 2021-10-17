
import java.util.*;

public class Ejercicio4 {
    public static void main(String [] args) {

        Scanner sc = new Scanner (System.in);
        ArrayList<String> alumnos = new ArrayList<>();

        String alumno;

        for (int i = 0; i < 12; i++) {
            System.out.print("Ingrese nombre del estudiante "+(i+1)+": ");
            alumno = sc.nextLine();
            alumnos.add(alumno);
        }
        sc.close();

        System.out.print("Alumnos:" + alumnos + "\n");

        List<String> c1 = alumnos.subList(0, 4);
        List<String> c2 = alumnos.subList(4, 8);
        List<String> c3 = alumnos.subList(8, 12);

        System.out.println("Primer curso: " + c1);
        System.out.println("Segundo curso: " + c2);
        System.out.println("Tercer curso: " + c3);

    }
}