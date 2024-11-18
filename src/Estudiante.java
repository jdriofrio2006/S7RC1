

public class Estudiante {
    private int codigo;
    private String nombre;
    private String apellido;

    public Estudiante() {
        // Constructor vacío por si es necesario
    }

    public Estudiante(int codigo, String nombre, String apellido) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public void detalle_estudiante() {
        System.out.println("Código: " + codigo);
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
        System.out.println("-------------------------------------------");
    }
}