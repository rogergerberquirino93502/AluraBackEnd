public class ControlBonificacion {

    private double suma;
    public double registrarSalario(Funcionario funcionario){
        double bonificacion = funcionario.getBonificacion();
        this.suma += bonificacion;
        System.out.println("Suma: " + this.suma);
        return this.suma;
    }

    public void registrar(Funcionario e) {
        this.suma = this.suma + e.getBonificacion();
    }

    public double getSuma() {
        return this.suma;
    }

    /*public double registrarSalario(Gerente gerente){
        double bonificacion = gerente.getBonificacion();
        this.suma += bonificacion;
        System.out.println("Suma: " + this.suma);
        return this.suma;
    }
    public double registrarSalario(Contador contador){
        double bonificacion = contador.getBonificacion();
        this.suma += bonificacion;
        System.out.println("Suma: " + this.suma);
        return this.suma;
    }*/
}
