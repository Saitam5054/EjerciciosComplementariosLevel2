import java.util.*;

public class Ejercicio2 {
	public static void main(String[] args) {
        
        ArrayList<Integer> numeros = new ArrayList<>();
        numeros = agregarElementos(numeros);
        imprimirElementos(numeros);
        numeros = agregarInicioFinal(numeros);
        imprimirElementos(numeros);  
    }
    
     public static ArrayList<Integer> agregarElementos(ArrayList<Integer> num) {
            Scanner sc = new Scanner(System.in);

            for (int i = 1; i <= 5; i++) {
                System.out.print("Ingrese un número entero: ");
                num.add(Integer.valueOf(sc.nextLine()));
            }
            return num;
        }

        public static void imprimirElementos(ArrayList<Integer> numerosImprimir) {
            for (Integer num: numerosImprimir) {
                System.out.print(num+" ");
            }
            int can = numerosImprimir.size();
            System.out.println("\nEl tamaño de la lista es de: "+can);
        }

        public static ArrayList<Integer> agregarInicioFinal(ArrayList<Integer> listaAAgregar){
            Scanner sc = new Scanner(System.in);
            System.out.print("Ingrese el elemento que quiere agregar al inicio: ");
            listaAAgregar.add(0, Integer.valueOf(sc.nextLine()));
            System.out.print("Ingrese el elemento que quiere agregar al final: ");
            listaAAgregar.add(Integer.valueOf(sc.nextLine()));
            return listaAAgregar;
        }
}