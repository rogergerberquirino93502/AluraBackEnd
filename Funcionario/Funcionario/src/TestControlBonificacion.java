public class TestControlBonificacion {
    public static void main(String[] args) {
        Funcionario roger = new Contador();
        roger.setSalario(2000);

        Gerente jimena = new Gerente();
        jimena.setSalario(5000);

        Contador maria = new Contador();
        maria.setSalario(3000);

        ControlBonificacion control = new ControlBonificacion();

        control.registrarSalario(roger);
        control.registrarSalario(jimena);
        control.registrarSalario(maria);
    }
}
