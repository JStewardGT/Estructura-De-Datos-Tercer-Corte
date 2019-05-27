/*
 * Se tiene un parqueadero donde se guardan N carros. El parqueadero tiene la siguiente forma:
 * [A] [B] [C] [D] 
 * Solamente poesee una entrada/salida y los carros deben estacionarse en fila. De tal manera
 * que si desean retirar un carro, que no sea el ultimo en entrar, se deben mover los carros
 * anteriores, retirar el deseado y luego entrar al parqueadero de nuevo los carros que se movieron.
 * Asi, por ejemplo,  para retirar el carro C, debemos mover el A, y luego el B, retirar el C y luego
 * volver a entrar al parqueadero los carros B y A en ese orden. Al final de la operación los carros quedaran ordenados,  asi:
 * [A] [B] [D] 
 * Realice un programa que permita sacar algunos de los carros y muestre como quedan parqueados
 */
package Taller6Actividad3_parqueadero;

/**
 *
 * @author stewa
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pila pila = new Pila();
        Pila saliente = new Pila();
        
        Nodo cabeza;

        for (int i = 0; i < 4; i++) {
            Informacion info = new Informacion();
            info.dato = "Carro " + i;
            pila.agregar(info);
        }

        for (int i = 0; i < 2; i++) {
            saliente.agregar(pila.atender());
            Informacion info = pila.atender();
        }

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
                pila.agregar(info);
            } else if (opcion == 2) {
                Informacion info = pila.atender();
                System.out.println("dato atendido : " + info.dato);
            } else if (opcion == 3) {
                
                saliente.listar();
                pila.listar();
            }
        }
        System.out.println("terminado");

    }

}
