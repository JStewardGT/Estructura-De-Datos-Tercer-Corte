/*
 * Capture los datos de N empleados y realice un método de búsqueda por el 
 * documento de identidad
 */
package Taller8Actividad3_empleados;


/**
 *
 * @author steward
 */
public class Main {

    public static void main(String[] args) {
        Nodo arbol;
        System.out.println("digite el dato que va a quedar en la raiz:");
        arbol = new Nodo();
        System.out.println("Digite la cedula");
        arbol.cedula = Leer.datoInt();
        System.out.println("Digite el nombre");
        arbol.nombre = Leer.dato();
        System.out.println("desea insertar un nuevo nodo? s/n");
        String continuar = Leer.dato();
        while (continuar.equals("s")) {
            System.out.println("digite el dato:");
            Nodo n = new Nodo();
            System.out.println("Digite la cedula");
            n.cedula = Leer.datoInt();
            System.out.println("Digite el nombre");
            n.nombre = Leer.dato();
            arbol = new AdministradorArbol().insertarNuevo(arbol, n);
            System.out.println("desea insertar un nuevo nodo? s/n");
            continuar = Leer.dato();
        }
        
        System.out.println("¿Número de cédula que desea buscar?");
        int buscar = Leer.datoInt();
        
        System.out.println("-------------------------------------------------");
        System.out.println("inorder");
        new AdministradorArbol().recorrerrid(arbol, buscar);
        System.out.println("-------------------------------------------------");
    }

}
