/*
* Construya una serie de números impares de 30 a 40 y otra lista de número impares de
* 31 a 39.  Concatene la lista de tal forma que quede los numero 30, 31, 32, …. ….40
*/

package Actividad3_ListasPar_Impar;

/**
 *
 * @author steward
 */
public class Main {

    public static void main(String[] args) {
        Nodo Lista1 = new Nodo();
        Nodo recorrer1 = Lista1;
        for (int i = 30; i <= 40; i += 2) {
            recorrer1.info = i;

            recorrer1.sig = new Nodo();
            recorrer1 = recorrer1.sig;
        }

        Nodo Lista2 = new Nodo();
        Nodo recorrer2 = Lista2;
        for (int i = 31; i <= 39; i += 2) {
            recorrer2.info = i;

            recorrer2.sig = new Nodo();
            recorrer2 = recorrer2.sig;
        }

        Nodo recorrido1 = Lista1;
        Nodo recorrido2 = Lista2;
        while (recorrido1.sig != null) {
            System.out.println(recorrido1.info);
            recorrido1 = recorrido1.sig;
            if (recorrido2.sig != null) {
                System.out.println(recorrido2.info);
                recorrido2 = recorrido2.sig;
            }
        }

    }

}
