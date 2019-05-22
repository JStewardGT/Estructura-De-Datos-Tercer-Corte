/*
 * Realice un programa utilizando colas, donde permita ingresar los datos de los
 * estudiantes: nombre, cc, ,nota 1,  nota 2, nota 3 , calcular el promedio y
 * muestre todos los  datos  con los resultados de  cada alumno y los vaya 
 * atendiendo en el orden de llegada.
 */
package Taller5Actividad3_notas3estudiantesColas;

/**
 *
 * @author SHEN
 */
public class Main {

    public static void main(String[] args) {
        Colas cola = new Colas();
        int opcion = -1;
        while (opcion != 4) {
            System.out.println("MENU:");
            System.out.println("1. agregar");
            System.out.println("2. atender");
            System.out.println("3. listar");
            System.out.println("4. salir");
            opcion = Leer.datoInt();
            if (opcion == 1) {
                Informacion info = new Informacion();
                System.out.println("digite el Nombre:");
                info.Nombre = Leer.dato();
                System.out.println("digite la cedula:");
                info.cc = Leer.dato();
                System.out.println("digite la nota 1:");
                info.nota1 = Leer.datoDouble();
                System.out.println("digite la nota 2:");
                info.nota2 = Leer.datoDouble();
                System.out.println("digite la nota 3:");
                info.nota3 = Leer.datoDouble();

                info.promedio = (info.nota1 + info.nota2 + info.nota3) / 3;

                cola.agregar(info);

            } else if (opcion == 2) {
                Informacion info = cola.atender();
                System.out.println("Nombre: " + info.Nombre);
                System.out.println("cedula: " + info.cc);
                System.out.println("nota 1: " + info.nota1);
                System.out.println("nota 2: " + info.nota2);
                System.out.println("nota 3: " + info.nota3);
                System.out.println("promedio: " + info.promedio);

            } else if (opcion == 3) {
                cola.listar();
            }
        }
        System.out.println("terminado");

    }

}
