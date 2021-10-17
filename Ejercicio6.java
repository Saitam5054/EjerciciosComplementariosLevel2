import java.util.*;

public class Ejercicio6 {
	public static void main(String[] args) {
		Set<Empleado> empleados = new HashSet<>();
        Map<Integer, Integer> sueldoCalcu = new HashMap<Integer, Integer>();
        empleados.add(new Empleado(35667658, "Nandor Relentless", 45, 400));
        empleados.add(new Empleado(34588901, "Laszlo Cravensworth", 32, 350));
        empleados.add(new Empleado(33099901, "Nadja Antipaxos ", 19, 300));
        empleados.add(new Empleado(28004533, "Colin Robinson", 40, 450));

        for (Empleado i:empleados){
            int sueldo = i.getpagoHrs() * i.gethrsTrab();
            sueldoCalcu.put(i.getDNI(), sueldo);
            System.out.println("Empleado: " + i.getnombyape() + " - DNI: " + i.getDNI() + " - Sueldo: " + sueldo);
        }
    }

    static class Empleado{
        private int dni;
        private String nombyape;
        private int hrsTrab;
        private int pagoHrs;

        public Empleado(int dni, String nombre, int horasTrabajadas, int valorHora){
            this.dni = dni;
            this.nombyape = nombre;
            this.hrsTrab = horasTrabajadas;
            this.pagoHrs = valorHora;
        }

        public int getDNI() {
            return dni;
        }

        public String getnombyape() {
            return nombyape;
        }
        
        public int gethrsTrab() {
            return hrsTrab;
        }

        public int getpagoHrs() {
            return pagoHrs;
        }
    }
}