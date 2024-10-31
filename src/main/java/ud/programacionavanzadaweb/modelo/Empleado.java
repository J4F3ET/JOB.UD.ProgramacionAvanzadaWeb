package ud.programacionavanzadaweb.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToOne;

@Entity
public class Empleado extends Persona {
    @OneToOne
    private Persona persona;
    private double salarioBasico;
    private int dias;

    public Empleado() {
    }
    public Empleado(String nombre, double salarioBasico, int dias) {
        super(nombre);
        this.salarioBasico = salarioBasico;
        this.dias = dias;
    }
    public int getDias() {
        return dias;
    }

    public void setDias(int dias) {
        this.dias = dias;
    }

    public double getSalarioBasico() {
        return salarioBasico;
    }

    public void setSalarioBasico(double salarioBasico) {
        this.salarioBasico = salarioBasico;
    }
}
