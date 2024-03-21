import java.util.Random;

public class Persona {
    
    private String nombre;
    private int edad;
    private String cedula;
    private char sexo;
    private double peso;
    private double altura;
    private static final char sexoD = 'H';
    private static final int mayorEdad = 18;
    private static final int cedulaL = 10;
    
    public Persona() {
        this.nombre = "";
        this.edad = 0;
        this.cedula = "";
        this.sexo = sexoD;
        this.peso = 0;
        this.altura = 0;
    }

    public Persona(String nombre, int edad, char sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.cedula = "";
        this.sexo = sexo;
        this.peso = 0.0;
        this.altura = 0.0;
    }

    public Persona (String nombre, int edad, String cedula, char sexo, double peso, double altura){
        this.nombre = nombre;
        this.edad = edad;
        this.cedula = cedula;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public static char getSexod() {
        return sexoD;
    }

    public int calcularIMC() {
        double imc = peso / (altura * altura);

        if (imc < 20) {
            return -1;
        } else if (imc >= 20 && imc <= 25) {
            return 0;
        } else {
            return 1;
        }
    }

    public boolean esMayorDeEdad() {
        return edad >= mayorEdad;
    }

    private char comprobarSexo(char sexo) {
        if (sexo == 'H' || sexo == 'M') {
            return sexo;
        } else {
            return sexoD;
        }
    }

    private void generarCedula() {
        StringBuilder cedulaBuilder = new StringBuilder();
        Random random = new Random();
        for (int i = 0; i < cedulaL; i++) {
            cedulaBuilder.append(random.nextInt(10));
        }
        cedula = cedulaBuilder.toString();
    }

    @Override
    public String toString() {
        return "Persona [nombre=" + nombre + ", edad=" + edad + ", cedula=" + cedula + ", sexo=" + sexo + ", peso="
                + peso + ", altura=" + altura + "]";
    }
}