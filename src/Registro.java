
import java.util.List;
import java.util.Scanner;

public class Registro {
    private List<Estudiante> listaEstudiantes;

    public Registro(List<Estudiante> listaEstudiantes) {
        this.listaEstudiantes = listaEstudiantes;
    }

    public void validar() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese nuevo código de estudiante:");
        int codigo = scanner.nextInt();
        scanner.nextLine(); // Consumir la nueva línea

        System.out.println("Ingrese Nombre del estudiante:");
        String nombre = scanner.nextLine();

        System.out.println("Ingrese Apellido del estudiante:");
        String apellido = scanner.nextLine();

        // Crear un nuevo estudiante
        Estudiante nuevoEstudiante = new Estudiante(codigo, nombre, apellido);
        listaEstudiantes.add(nuevoEstudiante); // Agregar a la lista
        System.out.println("Estudiante registrado exitosamente.");
    }
}
