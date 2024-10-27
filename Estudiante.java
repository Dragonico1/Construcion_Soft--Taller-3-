package Taller3;
public class Estudiante{
    public String nombre;
    public int edad;
    public String matricula;

    public Estudiante(String in_nombre, int in_edad, String in_matricula){
        this.nombre = in_nombre;
        this.edad = in_edad;
        this.matricula = in_matricula;
    }

    public void setNombre(String in_nombre){
        this.nombre=in_nombre;
    }

    public void setEdad(int in_edad){
        this.edad = in_edad;
    }

    public void setMatricula(String in_matricula){
        this.matricula=in_matricula;
    }

    public String getNombre(){
        return nombre;
    }

    public int getEdad(){
        return edad;
    }

    public String getMatricula(){
        return matricula;
    }

    public String toString() {
        return "Estudiante " +
                "Nombre: '" + nombre + '\'' +
                " Edad: " + edad +
                " Matricula: '" + matricula + '\'';
    }
}