public class TestCuentaException {
    public static void main(String[] args) {
        Cuenta cuenta = new CuentaAhorros(123, 456);
        cuenta.deposita(200);
        try {
            cuenta.saca(200);
        } catch (SaldoInsuficenteException e) {
            throw new RuntimeException(e);
        }
        try {
            cuenta.saca(10);
        } catch (SaldoInsuficenteException e) {
            throw new RuntimeException(e);
        }
    }
}
