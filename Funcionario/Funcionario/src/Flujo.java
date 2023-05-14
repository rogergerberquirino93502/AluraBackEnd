public class Flujo {
    public static void main(String[] args) {
        System.out.println("Inicia main");
        metodo1();
        System.out.println("Fin main");
    }

    private static void metodo1() {
        System.out.println("Metodo 1 Inicia");
        metodo2();
        System.out.println("Metodo 1 Fin");
    }

    private static void metodo2() {
        System.out.println("Metodo 2 Inicia");
        throw new ArithmeticException();
    }
}
