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
                System.out.println("digite el dato:");
                info.dato = Leer.dato();
                cola.agregar(info);
            } else if (opcion == 2) {
                Informacion info = cola.atender();
                System.out.println("dato atendido : " + info.dato);
            } else if (opcion == 3) {
                cola.listar();
            }
        }
        System.out.println("terminado");
    }

}
