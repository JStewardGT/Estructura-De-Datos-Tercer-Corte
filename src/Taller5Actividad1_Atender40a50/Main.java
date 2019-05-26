/*
 * Realice un programa de colas, donde vayan ingresando automáticamente los 
 * clientes numerados  del 40 al 51, en el cual ingresan 2 clientes  y se 
 * atiende 1. Verificar quienes quedaron en la cola. 
 */
package Taller5Actividad1_Atender40a50;

/**
 *
 * @author Steward & Shen
 */
public class Main {

    public static void main(String[] args) {
        Cola cola = new Cola();
        
        for (int i = 40; i <= 51; i++) {
            Informacion info = new Informacion();
            info.dato = "Cliente " + i;
            cola.agregar(info);
        }
        
        for (int i = 0; i <= 1; i++) {
            Informacion info = new Informacion();
            System.out.println("digite el cliente " + (i + 1));
            info.dato = Leer.dato();
            cola.agregar(info);
        }
        Informacion info = cola.atender();
        
        cola.listar();
        
        System.out.println("terminado");
    }

}
