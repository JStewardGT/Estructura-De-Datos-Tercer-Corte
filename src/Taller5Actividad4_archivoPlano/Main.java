/*
 * Realice un programa con colas que permita capturar la información de 5 estudiantes
 * (nombre, documento y correo), se muestre el reporte de los que están en la fila inicial.
 * Posteriormente se atienda tres personas y se muestre el reporte de quienes fueron los
 * que se atendieron y quienes quedaron en la cola. Utilicen archivos planos.
 */
package Taller5Actividad4_archivoPlano;

/**
 *
 * @author steward
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cola cola = new Cola();

        for (int i = 0; i < 5; i++) {
            Informacion info = new Informacion();
            info.Nombre = "Persona " + i;
            System.out.println("Nombre: " + info.Nombre);
            info.Documento = "Documento " + i;
            System.out.println("Direccion: " + info.Documento);
            info.Correo = "Correo " + i;
            System.out.println("Empresa: " + info.Correo);
            cola.agregar(info);
        }

        cola.BajarArchivo(1);
        System.out.println("La informacion fue guardada en el archivo");

        for (int i = 0; i < 3; i++) {
            Informacion info = cola.atender();
            System.out.println("Nombre: " + info.Nombre);
            System.out.println("Direccion: " + info.Documento);
            System.out.println("Empresa: " + info.Correo);
        }

        cola.BajarArchivo(2);
        System.out.println("La informacion fue guardada en el archivo");

        System.out.println("terminado");

    }

}
