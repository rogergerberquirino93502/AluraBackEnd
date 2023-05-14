public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");

        int edad = 17;
        int cantidad = 2;
        if (edad >= 18) {
            System.out.println("Puede ingresar");
        } else {
            if (cantidad >= 2) {
                System.out.println("Es menor de edad pero esta permitido su ingreso");
            } else
                System.out.println("Bienvenido");
        }
    }
}
