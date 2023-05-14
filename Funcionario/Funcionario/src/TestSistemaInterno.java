public class TestSistemaInterno {
    public static void main(String[] args) {
        SistemaInterno sistema = new SistemaInterno();
        Gerente gerente = new Gerente();
        Administrador administrador = new Administrador();

        sistema.autentica(gerente);
        sistema.autentica(administrador);

    }
}
