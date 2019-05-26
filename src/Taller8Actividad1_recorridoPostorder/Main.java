/*
 * Realice un programa que realice el recorrido post order:
 * (subárbol izquierdo, subárbol derecho, raíz)
 */
package Taller8Actividad1_recorridoPostorder;

/**
 *
 * @author stewa
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Nodo arbol;
        System.out.println("digite el dato que va a quedar en la raiz:");
        arbol = new Nodo(Leer.datoInt());
        System.out.println("desea insertar un nuevo nodo? s/n");
        String continuar = Leer.dato();
        while (continuar.equals("s")) {
            System.out.println("digite el dato:");
            Nodo n = new Nodo(Leer.datoInt());
            arbol = new AdministradorArbol().insertarNuevo(arbol, n);
            System.out.println("desea insertar un nuevo nodo? s/n");
            continuar = Leer.dato();
        }
        new AdministradorArbol().recorrerird(arbol);
        System.out.println("-------------------------------------------------");

    }

}
