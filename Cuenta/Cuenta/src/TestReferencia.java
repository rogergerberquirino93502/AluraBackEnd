public class TestReferencia {
    public static void main(String[] args) {
        Cuenta primeraCuenta = new Cuenta();
        primeraCuenta.saldo = 200;
        System.out.println("El saldo de la cuenta es: " + primeraCuenta.saldo);

        Cuenta segundaCuenta = primeraCuenta;
        segundaCuenta.saldo += 200;
        System.out.println("El saldo de la cuenta es: " + segundaCuenta.saldo);
        System.out.println("El saldo de la cuenta es: " + primeraCuenta.saldo);

        System.out.println(primeraCuenta);
        System.out.println(segundaCuenta);

        if (primeraCuenta == segundaCuenta) {
            System.out.println("Son la misma cuenta");
        }

    }
}
