package Guia4_ListasCirculares;

/**
 *
 * @author stewa
 */
public class Actividad1_MultiplosDe3de9a21 {

    public static void main(String[] args) {
        Nodo Cabeza = new Nodo();
        Nodo recorrer = Cabeza;
        int contador = 9;
        while (contador <= 21) {
            recorrer.info = contador;
            if (contador < 21) {
                recorrer.sig = new Nodo();
                recorrer = recorrer.sig;
            }
            contador += 3;
        }
        recorrer.sig = Cabeza;
        recorrer = Cabeza;
        int i = 0;
        while (i < 2) {
            if (recorrer.sig == Cabeza.sig) {
                i++;
            }
            System.out.println(recorrer.info);
            recorrer = recorrer.sig;
        }
    }

}
