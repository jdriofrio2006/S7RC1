

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Plataforma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Estudiante> listaEstudiantes = new ArrayList<>();
        Registro registro = new Registro(listaEstudiantes);

        System.out.println("-----------------------------------//-----------------------------------------------//----------------------");
        System.out.println("-------------BIENVENIDO A LA APP DE GESTIÓN DE ESTUDIANTES DE LA FACULTAD DE INGLES--------------------");
        System.out.println("-----------------------------------//-----------------------------------------------//----------------------");
        System.out.println("                                                      |");
        int salir = 3;

        while (salir == 3) {
            System.out.println("-----------------------------------//-----------------------------------------------//----------------------");
            System.out.println("--Ingrese 1 si quiere registrarse // Ingrese 2 si quiere visualizar los estudiantes // Ingrese 0 para salir--");
            System.out.println("---------------------------------//-----------------------------------------------//------------------------");
            int numero = scanner.nextInt();

            if (numero == 1) {
                registro.validar(); // Registra un nuevo estudiante
            } else if (numero == 2) {
                if (listaEstudiantes.isEmpty()) {
                    System.out.println("No hay estudiantes registrados.");
                } else {
                    System.out.println("Lista de estudiantes registrados:");
                    for (Estudiante estudiante : listaEstudiantes) {
                        estudiante.detalle_estudiante();
                    }
                }
            } else if (numero == 0) {
                salir = 0;
            }
        }
        scanner.close();
    }
}