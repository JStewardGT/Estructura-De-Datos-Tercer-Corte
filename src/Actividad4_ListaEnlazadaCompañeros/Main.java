/*
 * Ingrese en una lista los datos de tres compañeros (Nombre, cc y correo)
 * y en otra lista los datos de tres vehículos (marca, modelo y color).
 * muéstrela en una sola lista circular enlazada en un archivo plano.
 */
package Actividad4_ListaEnlazadaCompañeros;

/**
 *
 * @author stewa
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Nodo Lista1 = new Nodo();
        Nodo recorrido1 = Lista1;
        Nodo anterior1 = null;
        System.out.println("A continuación va a ingresar datos de tres personas:");
        for (int i = 0; i < 2; i++) {
            recorrido1.info = new Informacion();
            System.out.print("digite el nombre " + i + ": ");
            recorrido1.info.nombre = Leer.dato();
            System.out.print("digite el documento " + i + ": ");
            recorrido1.info.documento = Leer.datoLong();
            System.out.print("digite el correo " + i + ": ");
            recorrido1.info.correo = Leer.dato();
            recorrido1.sig = new Nodo();
            anterior1 = recorrido1;
            recorrido1 = recorrido1.sig;
        }
        anterior1.sig = Lista1;
        Nodo Lista2 = new Nodo();
        Nodo recorrido2 = Lista2;
        Nodo anterior2 = null;
        System.out.println("A continuación va a ingresar datos de tres vehículos:");
        for (int i = 0; i < 2; i++) {
            recorrido2.infoCarros = new InformacionCarros();
            System.out.print("digite la marca: " + i + ": ");
            recorrido2.infoCarros.marca = Leer.dato();
            System.out.print("digite el nombre: " + i + ": ");
            recorrido2.infoCarros.modelo = Leer.dato();
            System.out.print("digite el color: " + i + ": ");
            recorrido2.infoCarros.color = Leer.dato();
            recorrido2.sig = new Nodo();
            anterior2 = recorrido2;
            recorrido2 = recorrido2.sig;
        }
        anterior2.sig = Lista2;
        anterior1.sig=Lista2;
        anterior2.sig=Lista1;
        Nodo recorrido = Lista1.sig;
        System.out.println(Lista1.info.documento);
        System.out.println(Lista1.info.nombre);
        System.out.println(Lista1.info.correo);
        System.out.println("-------------------------------------------");
        while (recorrido != Lista1) {
            System.out.println(recorrido.info.documento);
            System.out.println(recorrido.info.nombre);
            System.out.println(recorrido.info.correo);
            System.out.println("-------------------------------------------");
            recorrido = recorrido.sig;
        }
        System.out.println(recorrido.info.documento);
        System.out.println(recorrido.info.nombre);
        System.out.println("-------------------------------------------");    }

    
}
