public class Gerente extends Funcionario implements Autenticable{

    private AutenticacionUtil util;

    public Gerente() {
        this.util = new AutenticacionUtil();
    }
    public double getBonificacion() {
        System.out.println("Ejecutando el metodo de bonificacion de Gerente");
        return 2000;

}

    @Override
    public void setClave(String clave) {
    this.util.setClave(clave);
    }

    @Override
    public boolean iniciarSesion(String clave) {
        return this.util.iniciarSesion(clave);
    }
}
