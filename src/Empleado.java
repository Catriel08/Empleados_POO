public class Empleado {

    private String nombre;
    private String identificacion;
    private int edad;
    private String estado_civil;
    private float salario;

    public Empleado(String nombre, String identificacion, int edad, String estado_civil, float salario) {
        this.nombre = nombre;
        this.identificacion = identificacion;
        this.edad = edad;
        this.estado_civil = estado_civil;
        this.salario = salario;
    }

    public Empleado() {
        this.nombre = "";
        this.identificacion = "";
        this.edad = 0;
        this.estado_civil = "";
        this.salario = 0;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getEstado_civil() {
        return estado_civil;
    }

    public void setEstado_civil(String estado_civil) {
        this.estado_civil = estado_civil;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "nombre='" + nombre + '\'' +
                ", identificacion='" + identificacion + '\'' +
                ", edad=" + edad +
                ", estado_civil='" + estado_civil + '\'' +
                ", salario=" + salario +
                '}';
    }
}
