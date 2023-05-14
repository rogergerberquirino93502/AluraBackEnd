public class PruebaMetodos {
    public static void main(String[] args) {
        TestMetodos cuenta = new TestMetodos();
        cuenta.saldo = 300;
        cuenta.depositar(200);
        System.out.println(cuenta.saldo);

        cuenta.retirar(100);
        System.out.println(cuenta.saldo);

        TestMetodos cuenta2 = new TestMetodos();
        cuenta2.depositar(1000);

        if(cuenta2.transferir(400, cuenta)) {
            System.out.println("Transferencia exitosa");
        } else {
            System.out.println("Fondos insuficientes");
        }
        System.out.println(cuenta2.saldo);
        System.out.println(cuenta.saldo);



    }
}
