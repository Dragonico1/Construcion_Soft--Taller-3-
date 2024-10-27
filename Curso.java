package Taller3;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Curso implements ICurso {
    public String codigo;
    public String nombre;
    List<Estudiante> estudiantes = new ArrayList<>();

    public Curso(String in_codigo, String in_nombre) {
        this.codigo = in_codigo;
        this.nombre = in_nombre;
    }

    public void listarEstudiante(){
        for (Estudiante estudiante : estudiantes) {
            System.out.println(estudiante);
        }
    }

    @Override
    public void ingresarEstudiante(Estudiante estudiante) {
        estudiantes.add(estudiante);
    }

    @Override
    public Estudiante buscarEstudiante(String in_matricula) {
        for (Estudiante estudiante : estudiantes) {
            if (estudiante.getMatricula().equals(in_matricula)) {
                System.out.println("Sea encontrado al: " + estudiante);
                return estudiante;
            }
        }
        System.out.println("El estudiante con la matrícula " + in_matricula + " no se ha encontrado");
        return null;
    }

    @Override
    public void eliminarEstudiante(String in_matricula) {
        Estudiante estudianteEliminar = null;
        
        for (Estudiante estudiante : estudiantes) {
            if (estudiante.getMatricula().equals(in_matricula)) {
                estudianteEliminar = estudiante;
                break;
            }
        }
        
        if (estudianteEliminar != null) {
            System.out.println("El estudiante " + estudianteEliminar + " fue eliminado");
            estudiantes.remove(estudianteEliminar);
        } else {
            System.out.println("El estudiante con matrícula " + in_matricula + " no se ha encontrado");
        }
    }

    @Override
    public Estudiante actualizarEstudiante(String nombreActu, String in_nombre, int in_edad, String in_matricula) {
        for (Estudiante estudiante : estudiantes) {
            if (estudiante.getNombre().equalsIgnoreCase(in_nombre)) {
                estudiante.setNombre(in_nombre);
                estudiante.setEdad(in_edad);
                estudiante.setMatricula(in_matricula);
                System.out.println("Estudiante actualizado: " + estudiante.getNombre() + ", Edad: " + estudiante.getEdad() + ", Matrícula: " + estudiante.getMatricula());
                return estudiante;
            }
        }
        System.out.println("El estudiante " + in_nombre + " no se ha encontrado");
        return null;
    }


    @Override
    public void ordenarEstudiante(){
        estudiantes.sort(Comparator.comparing(Estudiante::getNombre));
    }
}