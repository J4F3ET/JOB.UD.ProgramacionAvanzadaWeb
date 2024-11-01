package modelo;

public class Nomina extends Empleado {
    private final double smmlv = 1300000.0;
    private final double auxTransporte = 162000.0;
    private final double valorDiario = 40000.0;
    public Nomina() {}
    public Nomina(String nombre, double salarioBasico, int dias) {
        super(nombre, salarioBasico, dias);
    }
    public double getAuxilioTransporte() {
        return getSalarioBasico()<=smmlv*2.0?auxTransporte:0;
    }
    public double getSalud() {
        return getSalarioBasico()*0.04;
    }
    public double getPension() {
        return getSalarioBasico()*0.04;
    }
    public double calcularSalario() {
       return getSalarioBasico()-getSalud()+getAuxilioTransporte()-getPension()+(valorDiario*getDias());
    }
}
