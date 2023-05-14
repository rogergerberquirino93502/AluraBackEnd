public class Contador extends Funcionario{


    @Override
    public double getBonificacion() {
        System.out.println("Ejecutando el metodo de bonificacion de Contador");
        return 200;
    }
}
