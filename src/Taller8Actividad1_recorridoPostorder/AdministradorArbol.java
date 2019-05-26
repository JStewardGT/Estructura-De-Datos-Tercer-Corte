/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Taller8Actividad1_recorridoPostorder;

/**
 *
 * @author stewa
 */
public class AdministradorArbol {

    public Nodo insertarNuevo(Nodo arbol, Nodo nuevo) {
        if (arbol.dato > nuevo.dato) {
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

    public void recorrerird(Nodo arbol) {
        if (arbol != null) {
            recorrerird(arbol.izq);
            recorrerird(arbol.der);
            System.out.println(arbol.dato);
        }
    }

}
