public class Main {

    public static void main(String[] args) {
        
        Persona persona1 = new Persona();
        System.out.println("Persona 1:");
        System.out.println(persona1);
        Persona persona2 = new Persona("Julian", 21, 'H');
        System.out.println("\nPersona 2:");
        System.out.println(persona2);
        Persona persona3 = new Persona("Laura", 30, "1005236888", 'F', 65.0, 1.75);
        System.out.println("\nPersona 3:");
        System.out.println(persona3);

        int imcPersona1 = persona2.calcularIMC();
        System.out.println("\nIMC de la Persona 1:");
        if (imcPersona1 == -1) {
            System.out.println("Por debajo del peso ideal.");
        } else if (imcPersona1 == 0) {
            System.out.println("Peso ideal.");
        } else {
            System.out.println("Sobrepeso.");
        }

        boolean esMayorDeEdadPersona3 = persona3.esMayorDeEdad();
        System.out.println("\nPersona 3 es mayor de edad: " + esMayorDeEdadPersona3);
    }
}
