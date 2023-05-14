public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");

        int edad = 16;
        int cantidadPersonas = 3;
        boolean acompañado = true;

        if (edad >= 18 || acompañado) {
            System.out.println("Puede ingresar");
        } else {
            System.out.println("No puede ingresar");
        }
    }
}