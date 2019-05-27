/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Taller8Actividad3_empleados;

/**
 *
 * @author steward
 */
public class AdministradorArbol {

    public Nodo insertarNuevo(Nodo arbol, Nodo nuevo) {
        if (arbol.cedula > nuevo.cedula) {
            if (arbol.izq == null) {
                arbol.izq = nuevo;
                return arbol;
            } else {
                arbol.izq = insertarNuevo(arbol.izq, nuevo);
                return arbol;
            }
        } else {
            if (arbol.der == null) {
                arbol.der = nuevo;
                return arbol;
            } else {
                arbol.der = insertarNuevo(arbol.der, nuevo);
                return arbol;
            }
        }
    }

    public void recorrerrid(Nodo arbol, int buscar) {
        if (arbol != null) {
            if (buscar == arbol.cedula) {
                System.out.println("El empleado es: ");
                System.out.println("\t\t" + arbol.cedula + "\t\t" + arbol.nombre);
            }
            recorrerrid(arbol.izq, buscar);
            recorrerrid(arbol.der, buscar);
        }
    }
}
