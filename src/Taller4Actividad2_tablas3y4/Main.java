/*
 * Construya dos listas, en una se muestre la tabla del 3 y en la
 * otra, la tabla de 4. Concatenen las dos listas. (una detrás de la otra).
 */
package Taller4Actividad2_tablas3y4;

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
        Nodo recorrer1 = Lista1;
        
        for (int i = 3; i <= 30; i+=3) {
            recorrer1.info = i;
            
            recorrer1.sig = new Nodo();
            recorrer1 = recorrer1.sig;
        }

        Nodo Lista2 = new Nodo();
        Nodo recorrer2 = Lista2;
        
        for (int i = 4; i <= 40; i+=4) {
            recorrer2.info = i;
            
            recorrer2.sig = new Nodo();
            recorrer2 = recorrer2.sig;
        }

        Lista1.sig.sig.sig.sig.sig.sig.sig.sig.sig.sig = Lista2;
        Lista2.sig.sig.sig.sig.sig.sig.sig.sig.sig.sig = Lista1;
        
        Nodo recorrido = Lista1.sig;
        System.out.println(Lista1.info);
        
        while (recorrido != Lista1) {
            System.out.println(recorrido.info);
            recorrido = recorrido.sig;
        }
        System.out.println(recorrido.info);

    }

}
