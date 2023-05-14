public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");

        int edad = 21;
        int cantidadPersonas = 2;

        boolean esPareja = cantidadPersonas > 1;

        System.out.println("El valor : " + esPareja);
        if ( edad >= 18 && esPareja) {
            System.out.println("Puedes entrar");
        } else {
            System.out.println("No puedes entrar");
        }
    }
}