package ud.programacionavanzadaweb.modelo;

import jakarta.persistence.Entity;

@Entity
public class Nomina extends Empleado {

    public Nomina() {
    }
    public Nomina(String nombre, double salarioBasico, int dias) {
        super(nombre, salarioBasico, dias);
    }
    public double getAuxilioTransporte() {
        return 0;
    }
    public double getSalud() {
        return 0;
    }
    public double getPension() {
        return 0;
    }
    public double calcularSalario() {
        return 0;
    }
}
