public class TestReferencias
    {
        public static void main(String[] args) {
            Funcionario funcionario = new Gerente();
            funcionario.setNombre("Roger");
            Gerente gerente = new Gerente();
            gerente.setNombre("Gerber");

            funcionario.setSalario(2000);
            gerente.setSalario(5000);

            Gerente g1 = new Gerente();
            g1.setNombre("Marcos");
            g1.setSalario(5000.0);

            EditorVideo ev = new EditorVideo();
            ev.setSalario(2500.0);

            Designer d = new Designer();
            d.setSalario(2000.0);

            ControlBonificacion controle = new ControlBonificacion();
            controle.registrar(g1);
            controle.registrar(ev);
            controle.registrar(d);

            System.out.println(controle.getSuma());
        }
}
