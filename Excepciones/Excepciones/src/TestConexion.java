public class TestConexion {
    public static void main(String[] args) throws Exception {
        try(Conexion con = new Conexion()) {
            con.leeDatos();
        }catch (IllegalStateException e){
            System.out.println("Recibiendo excepcion: ");
            e.printStackTrace();
        }

       /* Conexion con = null;
        try {
            con = new Conexion();
            con.leeDatos();

        } catch (IllegalStateException e) {
            System.out.println("Recibiendo excepcion: ");
            e.printStackTrace();

        }finally {
            System.out.println("Ejecutando finally");
            if(con != null){
                con.cierra();
            }
        }*/
    }
}
