/*
 * Capture los datos de N alumnos (código, curso, carrera) y realice el recorrido
 * en inorder y postorder.
 */
package Taller8Actividad3_empleados;

import Taller8Actividad2_datosEstudiantes.*;

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
        System.out.println("Digite el curso");
        arbol.curso = Leer.dato();
        System.out.println("Digite la carrera");
        arbol.carrera = Leer.dato();
        System.out.println("desea insertar un nuevo nodo? s/n");
        String continuar = Leer.dato();
        while (continuar.equals("s")) {
            System.out.println("digite el dato:");
            Nodo n = new Nodo();
            System.out.println("Digite el codigo");
            n.codigo = Leer.datoInt();
            System.out.println("Digite curso");
            n.curso = Leer.dato();
            System.out.println("Digite la carrera");
            n.carrera = Leer.dato();
            arbol = new AdministradorArbol().insertarNuevo(arbol, n);
            System.out.println("desea insertar un nuevo nodo? s/n");
            continuar = Leer.dato();
        }
        System.out.println("-------------------------------------------------");
        System.out.println("inorder");
        new AdministradorArbol().recorrerrid(arbol);
        System.out.println("-------------------------------------------------");
        System.out.println("postorder");
        new AdministradorArbol().recorrerpostorden(arbol);
    }

    
}
