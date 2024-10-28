package Taller3;
public interface ICurso  {
    public void ingresarEstudiante(Estudiante estudiante);
    public Estudiante buscarEstudiante(String nombre);
    public void eliminarEstudiante(String nombre);
    public Estudiante actualizarEstudiante(String nombreActu, String in_nombre, int in_edad, String in_matricula);
    public void ordenarEstudiante();
    
}