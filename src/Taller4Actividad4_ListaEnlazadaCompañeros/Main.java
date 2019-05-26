/*
 * Ingrese en una lista los datos de tres compañeros (Nombre, cc y correo)
 * y en otra lista los datos de tres vehículos (marca, modelo y color).
 * muéstrela en una sola lista circular enlazada en un archivo plano.
 */
package Taller4Actividad4_ListaEnlazadaCompañeros;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {

    public static void main(String[] args) {
        Nodo Lista1 = new Nodo();
        Nodo recorrido1 = Lista1;
        Nodo anterior1 = null;
        for (int i = 0; i <= 2; i++) {
            recorrido1.info = new Informacion();
            System.out.print("digite el nombre: ");
            recorrido1.info.nombre = Leer.dato();
            
            System.out.print("digite el documento: ");
            recorrido1.info.cc = Leer.dato();
            
            System.out.print("digite el correo: ");
            recorrido1.info.correo = Leer.dato();

            recorrido1.sig = new Nodo();
            anterior1 = recorrido1;
            recorrido1 = recorrido1.sig;
        }
        
        anterior1.sig = Lista1;
        
        Nodo Lista2 = new Nodo();
        Nodo recorrido2 = Lista2;
        Nodo anterior2 = null;
        
        for (int i = 0; i <= 2; i++) {
            recorrido2.info = new Informacion();
            System.out.print("digite la marca: ");
            recorrido2.info.cc = Leer.dato();
            
            System.out.print("digite el modelo: ");
            recorrido2.info.nombre = Leer.dato();
            
            System.out.print("digite el color: ");
            recorrido2.info.correo = Leer.dato();

            recorrido2.sig = new Nodo();
            anterior2 = recorrido2;
            recorrido2 = recorrido2.sig;
        }
        
        anterior2.sig = Lista2;
        anterior1.sig = Lista2;
        anterior2.sig = Lista1;

        PrintStream salida = null;
        try {
            salida = new PrintStream("C:\\Users\\stewa\\Downloads\\ListaCircular.txt");

            Nodo recorrido = Lista1.sig;

            salida.println(Lista1.info.cc);
            salida.println(Lista1.info.nombre);
            salida.println(Lista1.info.correo);
            salida.println("-------------------------------------------");
            
            while (recorrido != Lista1) {
                salida.println(recorrido.info.cc);
                salida.println(recorrido.info.nombre);
                salida.println(recorrido.info.correo);
                salida.println("-------------------------------------------");
                recorrido = recorrido.sig;

            }
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            salida.close();
        }

    }
}
