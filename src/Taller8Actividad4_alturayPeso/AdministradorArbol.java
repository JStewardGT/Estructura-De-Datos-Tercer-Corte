/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Taller8Actividad4_alturayPeso;

/**
 *
 * @author stewa
 */
public class AdministradorArbol {

    public int nivelIz = 0,
            nivelDer = 0,
            pesoIz = 0,
            pesoDer = 0;

    public Nodo insertarNuevo(Nodo arbol, Nodo nuevo) {
        if (arbol.codigo > nuevo.codigo) {
            if (arbol.izq == null) {
                nivelIz++;
                System.out.println(nivelIz);
                arbol.izq = nuevo;
                return arbol;
            } else {
                pesoIz++;
                arbol.izq = insertarNuevo(arbol.izq, nuevo);
                return arbol;
            }
        } else {
            if (arbol.der == null) {
                nivelDer++;
                System.out.println(nivelDer);
                arbol.der = nuevo;
                return arbol;
            } else {
                pesoDer++;
                arbol.der = insertarNuevo(arbol.der, nuevo);
                return arbol;
            }
        }
    }

    public void recorrerrid(Nodo arbol) {
        if (arbol != null) {
            recorrerrid(arbol.izq);
            System.out.println("\t\t" + arbol.codigo);
            recorrerrid(arbol.der);
        }
            if (nivelIz > nivelDer) {
                System.out.println("la altura es " + nivelIz);
            } else {
                System.out.println("la altura es " + nivelDer);
            }
            System.out.println("El pero es " + (pesoIz + pesoDer));
    }

}
