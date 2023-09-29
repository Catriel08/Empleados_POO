public class Programador extends Empleado {

    private String numero_lineas_por_hora;
    private String lenguaje_programa;

    public Programador(String nombre, String identificacion, int edad, String estado_civil, float salario, String numero_lineas_por_hora, String lenguaje_programa) {
        super(nombre, identificacion, edad, estado_civil, salario);
        this.numero_lineas_por_hora = numero_lineas_por_hora;
        this.lenguaje_programa = lenguaje_programa;
    }

    public Programador() {
        super();
        this.numero_lineas_por_hora = "";
        this.lenguaje_programa = "";
    }

    public String getNumero_lineas_por_hora() {
        return numero_lineas_por_hora;
    }

    public void setNumero_lineas_por_hora(String numero_lineas_por_hora) {
        this.numero_lineas_por_hora = numero_lineas_por_hora;
    }

    public String getLenguaje_programa() {
        return lenguaje_programa;
    }

    public void setLenguaje_programa(String lenguaje_programa) {
        this.lenguaje_programa = lenguaje_programa;
    }

    @Override
    public String toString() {
        return "Programador{" +
                "numero_lineas_por_hora='" + numero_lineas_por_hora + '\'' +
                ", lenguaje_programa='" + lenguaje_programa + '\'' +
                '}';
    }
}
