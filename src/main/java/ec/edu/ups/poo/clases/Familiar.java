package ec.edu.ups.poo.clases;
import java.util.GregorianCalendar;

public class Familiar extends Persona {
    private String parentesco;
    private String tipoDeSangre;
    private GregorianCalendar fechaDeNacimiento;

    public Familiar() {}

    public Familiar(String cedula, String nombre, String apellido, String direccion, String parentesco, String tipoDeSangre, GregorianCalendar fechaDeNacimiento) {
        super(cedula, nombre, apellido, direccion);
        this.parentesco = parentesco;
        this.tipoDeSangre = tipoDeSangre;
        this.fechaDeNacimiento = fechaDeNacimiento;
    }

    public String getParentesco() {
        return parentesco;
    }

    public void setParentesco(String parentesco) {
        this.parentesco = parentesco;
    }

    public String getTipoDeSangre() {
        return tipoDeSangre;
    }

    public void setTipoDeSangre(String tipoDeSangre) {
        this.tipoDeSangre = tipoDeSangre;
    }

    public GregorianCalendar getFechaDeNacimiento() {
        return fechaDeNacimiento;
    }

    public void setFechaDeNacimiento(GregorianCalendar fechaDeNacimiento) {
        this.fechaDeNacimiento = fechaDeNacimiento;
    }

    public double calcularEdad() {
        GregorianCalendar fechaActual = new GregorianCalendar();
        int edad = fechaActual.get(GregorianCalendar.YEAR) - fechaDeNacimiento.get(GregorianCalendar.YEAR);
        if (fechaActual.get(GregorianCalendar.MONTH) < fechaDeNacimiento.get(GregorianCalendar.MONTH) ||
                (fechaActual.get(GregorianCalendar.MONTH) == fechaDeNacimiento.get(GregorianCalendar.MONTH) && fechaActual.get(GregorianCalendar.DAY_OF_MONTH) < fechaDeNacimiento.get(GregorianCalendar.DAY_OF_MONTH))) {
            edad--;
        }
        return edad;
    }

    @Override
    public String toString() {
        return super.toString() +
                ",\n\t Parentesco: " + parentesco +
                ",\n\t Tipo de Sangre: " + tipoDeSangre +
                ",\n\t Edad: " + calcularEdad();
    }
}
