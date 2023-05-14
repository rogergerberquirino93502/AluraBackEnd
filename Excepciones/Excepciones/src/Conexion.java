public class Conexion implements AutoCloseable{
    public Conexion() {
        System.out.println("Conectando...");
    }

    public void leeDatos() {
        System.out.println("Recibienod dados...");
        throw new IllegalStateException("Problemas de red");
    }

    public void cierra() {
        System.out.println("Cerrando conexion...");
    }

    @Override
    public void close() throws Exception {
        cierra();
    }
}
