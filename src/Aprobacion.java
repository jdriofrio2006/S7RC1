

public class Aprobacion {
    private Estudiante Estudiante1;
    private double promedio;

    public Aprobacion(Estudiante Estudiante1) {
        this.Estudiante1 = Estudiante1;
    }
    public void aproved_desaproved(double promedio) {
        this.promedio = promedio;

        System.out.println("-------------------------------------");

        if (this.promedio < 3.25) {
            //System.out.println("EL PROMEDIO DEL ESTUDIANTE " + Estudiante1.GetNombre() + " es: " + this.promedio + "\n" +
            //"El estudiante está en prueba académica");
            //}else if(this.promedio >= 4.75) {
            //System.out.println("EL PROMEDIO DEL ESTUDIANTE " + Estudiante1.GetNombre() + " es: " + this.promedio + "\n" +
            // "El estudiante es candidato a beca");
        }

    }
}