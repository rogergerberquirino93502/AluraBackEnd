public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");

        int edad = 21;
        int cantidadPersonas = 2;
        boolean esPareja;
        if (cantidadPersonas > 1){
            esPareja = true;
        } else {
            esPareja = false;
        }

        boolean puedeEntrar = edad >= 18 && esPareja;
        System.out.println("El valor de la condicion es: " + esPareja);

        if (puedeEntrar) {
            System.out.println("Puede entrar");
        } else {
            System.out.println("No puede entrar");
        }
    }
}