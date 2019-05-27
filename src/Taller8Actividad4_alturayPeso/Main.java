/*
 * Realice un programa que indique los niveles y el peso de un árbol
 */
package Taller8Actividad4_alturayPeso;


/**
 *
 * @author stewa
 */
public class Main {

    public static void main(String[] args) {
        Nodo arbol;
        System.out.println("digite el dato que va a quedar en la raiz:");
        arbol = new Nodo();
        System.out.println("Digite el codigo");
        arbol.codigo = Leer.datoInt();
        System.out.println("desea insertar un nuevo nodo? s/n");
        String continuar = Leer.dato();
        while (continuar.equals("s")) {
            Nodo n = new Nodo();
            System.out.println("Digite el codigo");
            n.codigo = Leer.datoInt();
            arbol = new AdministradorArbol().insertarNuevo(arbol, n);
            System.out.println("desea insertar un nuevo nodo? s/n");
            continuar = Leer.dato();
        }
        System.out.println("-------------------------------------------------");
        new AdministradorArbol().recorrerrid(arbol);
        System.out.println("-------------------------------------------------");
    }

    
}
