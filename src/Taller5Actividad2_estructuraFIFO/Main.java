/*
 * Implemente un método que devuelva el número de elementos  de una estructura FIFO.
 */
package Taller5Actividad2_estructuraFIFO;

/**
 *
 * @author SHEN
 */
public class Main {

    public static void main(String[] args) {
        Cola cola = new Cola();

        for (int i = 0; i < 4; i++) {
            Informacion info = new Informacion();
            System.out.println("DIGITE NOMBRE DEL ELEMENTO :");
            info.dato = Leer.dato();
            cola.agregar(info);
        }
        System.out.println('\n');
        cola.listar();
        System.out.println('\n');
        for (int i = 0; i < 2; i++) {
            Informacion info = cola.atender();
            System.out.println("ELEMENTO ATENDIDO: " + info.dato);
        }
        System.out.println('\n');
        cola.listar();
        System.out.println('\n');
        System.out.println("terminado");
    }

}
