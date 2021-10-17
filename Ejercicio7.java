import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String [] args){

        Scanner scan = new Scanner (System.in);
        System.out.print("Ingrese Primer Valor: ");
        int primerValor = scan.nextInt();
        System.out.print("Ingrese Segundo Valor: ");
        int segundoValor = scan.nextInt();
        scan.close();

        muestraArray(fizzBuzz(primerValor,segundoValor));
    }

    public static void muestraArray(String[] a){
        System.out.print("[");
        for (int i = 0; i < a.length-1; i++) {
            System.out.print('"'+a[i]+'"'+',');
        } 
        int i = a.length-1;
        System.out.print('"'+a[i]+'"'+']');   
    }

    public static String[] fizzBuzz(int a, int b){
        int n=0;
        if (a>b){
            n=1;
        }
        else{
            for(int i=a;i<b;i++){
                n+=1;
            }
        }

        String [] secuencia= new String[n];
        if (a>b){
            secuencia[0]="Error: a > b";
        }
        else{
            int j=0;
            for(int i=a; i<b; i++){               
                if (i%2==0){
                    secuencia[j]="Fizz";
                }
                if (i%3==0){
                    secuencia[j]="Buzz";
                }
                if(i%2==0 && i%3==0){
                    secuencia[j]="FizzBuzz";
                }
                if(i%2!=0 && i%3!=0){
                    secuencia[j]=String.valueOf(i);
                }
                j++;
            }    
        }
        return secuencia;
    }
}