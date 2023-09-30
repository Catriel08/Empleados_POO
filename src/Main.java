public class Main {
    public static void main(String[] args) {

        Programador programador = new Programador("Brayan","1014657781",19,"Soltero",757.952f,200,"Java");

        Arquitecto arquitecto = new Arquitecto("Sergio","1520369415",20,"Viudo",554.385f,35);

        Director director = new Director("Alfonso","1038774410",75,"Divorciado",1.575455f,"32");

        System.out.println("");
        System.out.println(programador.toString());
        System.out.println("");
        System.out.println(arquitecto.toString());
        System.out.println("");
        System.out.println(director.toString());
    }
}