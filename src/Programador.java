public class Programador extends Empleado {

    private String numero_lineas_por_hora;
    private String lenguaje_programa;

    public Programador(String nombre, String identificacion, int edad, String estado_civil, float salario, String numero_lineas_por_hora, String lenguaje_programa) {
        super(nombre, identificacion, edad, estado_civil, salario);
        this.numero_lineas_por_hora = numero_lineas_por_hora;
        this.lenguaje_programa = lenguaje_programa;
    }
}
