public class Director extends Empleado {

    private String years_experience;

    public Director(String nombre, String identificacion, int edad, String estado_civil, float salario, String years_experience) {
        super(nombre, identificacion, edad, estado_civil, salario);
        this.years_experience = years_experience;
    }

    public Director() {
        super();
        this.years_experience = "";
    }

    public String getYears_experience() {
        return years_experience;
    }

    public void setYears_experience(String years_experience) {
        this.years_experience = years_experience;
    }

    @Override
    public String toString() {
        return super.toString() + "Director{" +
                "years_experience='" + years_experience + '\'' +
                '}';
    }
}
