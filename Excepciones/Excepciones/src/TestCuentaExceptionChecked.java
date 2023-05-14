public class TestCuentaExceptionChecked {
    public static void main(String[] args) {
        Cuenta c = new Cuenta();
        try {
            c.depositar();
        } catch (MiException e) {
            e.printStackTrace();
        }
    }
}
