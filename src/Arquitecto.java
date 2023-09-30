public class Arquitecto extends Empleado {

    private int cantidad_proyectos;


    public Arquitecto(String nombre, String identificacion, int edad, String estado_civil, float salario, int cantidad_proyectos) {
        super(nombre, identificacion, edad, estado_civil, salario);
        this.cantidad_proyectos = cantidad_proyectos;
    }

    public Arquitecto() {
        super();
        this.cantidad_proyectos = 0;
    }


    public int getCantidad_proyectos() {
        return cantidad_proyectos;
    }

    public void setCantidad_proyectos(int cantidad_proyectos) {
        this.cantidad_proyectos = cantidad_proyectos;
    }

    @Override
    public String toString() {
        return super.toString() + "Arquitecto{" +
                "cantidad_proyectos=" + cantidad_proyectos +
                '}';
    }
}
