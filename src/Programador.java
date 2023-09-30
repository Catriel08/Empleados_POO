public class Programador extends Empleado {

    private int numero_lineas_por_hora;
    private String lenguaje_programa;

    public Programador(String nombre, String identificacion, int edad, String estado_civil, float salario, int numero_lineas_por_hora, String lenguaje_programa) {
        super(nombre, identificacion, edad, estado_civil, salario);
        this.numero_lineas_por_hora = numero_lineas_por_hora;
        this.lenguaje_programa = lenguaje_programa;
    }

    public Programador() {
        super();
        this.numero_lineas_por_hora = 0;
        this.lenguaje_programa = "";
    }

    public int getNumero_lineas_por_hora() {
        return numero_lineas_por_hora;
    }

    public void setNumero_lineas_por_hora(int numero_lineas_por_hora) {
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
        return  super.toString() + "Programador{" +
                "numero_lineas_por_hora='" + numero_lineas_por_hora + '\'' +
                ", lenguaje_programa='" + lenguaje_programa + '\'' +
                '}';
    }
}
