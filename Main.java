package Taller3;
import java.util.Scanner;

// Menu Interactivo


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Curso curso = new Curso("CS101", "Programación Básica");
        int op;

        do {
            System.out.println("=== Menú de Gestión Estudiantes ===\n 1. Agregar Estudiante\n 2. Buscar Estudiante por Matrícula\n 3. Actualizar Estudiante\n 4. Eliminar Estudiante\n 5. Listar Estudiantes\n 6. Ordenar Estudiantes por Nombre\n 7. Salir\n Elige una opción: ");
            op = sc.nextInt();
            sc.nextLine();

            switch (op) {
                case 1:
                    System.out.println("Ingrese el nombre del estudiante: ");
                    String nombre = sc.nextLine();

                    System.out.println("Ingrese la edad del estudiante: ");
                    int edad = sc.nextInt();
                    sc.nextLine();

                    System.out.println("Ingrese la matrícula del estudiante: ");
                    String matricula = sc.nextLine();


                    Estudiante nuevoE = new Estudiante(nombre, edad, matricula);
                    curso.ingresarEstudiante(nuevoE);
                    System.out.println("Estudiante agregado con éxito.");
                    break;

                case 2:
                    System.out.println("Ingrese la matrícula del estudiante que desea buscar:");
                    String matriculaBusqueda = sc.nextLine();
                    curso.buscarEstudiante(matriculaBusqueda);
                    break;

                    case 3:
                        System.out.println("Lista de estudiantes:");
                        curso.listarEstudiante();
                        System.out.println("Ingrese el nombre del estudiante que desea actualizar:");
                        String nombreActu = sc.nextLine();
                        System.out.println("Ingrese el nuevo nombre:");
                        String nuevaN = sc.nextLine();
                        System.out.println("Ingrese la nueva edad:");
                        int nuevaE = sc.nextInt();
                        sc.nextLine();
                        System.out.println("Ingrese la nueva matrícula:");
                        String nuevaMa = sc.nextLine();

                    curso.actualizarEstudiante(nombreActu, nuevaN, nuevaE, nuevaMa);
                    break;

                case 4:
                    System.out.println("Lista de estudiantes:");
                    curso.listarEstudiante();
                    System.out.println("Ingrese la matrícula del estudiante que desea eliminar:");
                    String eliminarMa = sc.nextLine();
                    curso.eliminarEstudiante(eliminarMa);
                    break;

                case 5:
                    System.out.println("Lista de estudiantes:");
                    curso.listarEstudiante();
                    break;

                case 6:
                    System.out.println("Ordenando estudiantes por nombre");
                    curso.ordenarEstudiante();
                    System.out.println("Lista de estudiantes:");
                    curso.listarEstudiante();
                    break;

                case 7:
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opción invalida. Elige una opción válida.");
            }
        } while (op != 0);

        sc.close();
    }
}



// Pruebas


// public class Main{
//     public static void main(String[] args){

//     Estudiante estudiante1 = new Estudiante("Ana", 20, "001");
//     Estudiante estudiante2 = new Estudiante("Katherine", 21, "002");
//     Estudiante estudiante3 = new Estudiante("Luis", 22, "003");
//     Estudiante estudiante4 = new Estudiante("Samuel", 19, "004");

//     Curso curso = new Curso("CS101", "Programación Básica");

//     curso.ingresarEstudiante(estudiante1);
//     curso.ingresarEstudiante(estudiante2);
//     curso.ingresarEstudiante(estudiante3);
//     curso.ingresarEstudiante(estudiante4);

//     curso.listarEstudiante();
//     System.out.println();

//     curso.buscarEstudiante("002");
//     System.out.println();

//     curso.actualizarEstudiante("Ana","Ana", 21, "005");

//     curso.listarEstudiante();
//     System.out.println();

//     curso.eliminarEstudiante("003");

//     System.out.println("Lista de estudiantes después de eliminar:");
//     curso.listarEstudiante();
//     System.out.println();

//     System.out.println("Ordenando estudiantes por nombre:");
//     curso.ordenarEstudiante();
//     curso.listarEstudiante();

//     }

// }