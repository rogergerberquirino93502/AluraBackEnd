public class SistemaInterno {
    private String clave = "Alura";
    public boolean autentica( Autenticable gerente){
        boolean puedeIniciarSesion = gerente.iniciarSesion(clave);
        if (puedeIniciarSesion) {
            System.out.println("Bienvenido al sistema");
            return true;
        } else {
            System.out.println("Clave incorrecta");
            return false;
        }
    }


}
