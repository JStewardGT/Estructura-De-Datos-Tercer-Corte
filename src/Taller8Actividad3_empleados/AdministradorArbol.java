/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Taller8Actividad3_empleados;

import Taller8Actividad2_datosEstudiantes.*;

/**
 *
 * @author stewa
 */
public class AdministradorArbol {

    public Nodo insertarNuevo(Nodo arbol, Nodo nuevo) {
        if (arbol.codigo > nuevo.codigo) {
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

    public void recorrerrid(Nodo arbol) {
        if (arbol != null) {
            recorrerrid(arbol.izq);
            System.out.println("\t\t" + arbol.codigo + "\t\t" + arbol.curso + "\t\t" + arbol.carrera);
            recorrerrid(arbol.der);
        }
    }
    
    public void recorrerpostorden(Nodo arbol){
        if (arbol != null) {
            recorrerpostorden(arbol.izq);
            recorrerpostorden(arbol.der);
            System.out.println("\t\t" + arbol.codigo + "\t\t" + arbol.curso + "\t\t" + arbol.carrera);
        }
    }

}
