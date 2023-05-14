public class Flujo {
    public static void main(String[] args) {
        System.out.println("Inicia main");
        try {
            metodo1();
        } catch (MiException e) {
            e.printStackTrace();
        }
        System.out.println("Fin main");
    }

    private static void metodo1() throws MiException{
        System.out.println("Metodo 1 Inicia");
            metodo2();
        System.out.println("Metodo 1 Fin");
    }

    private static void metodo2() throws MiException{
        //System.out.println("Metodo 2 Inicia");
        //throw new MiException("Mi excepcion fue lanzada");
        //error de stackoverflow se da cuando se llama a un metodo de forma recursiva
        System.out.println("Metodo 2 Inicia");
        throw new MiException("Mi excepcion fue lanzada");
    }
}
