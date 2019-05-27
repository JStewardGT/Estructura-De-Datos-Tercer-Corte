/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Taller6Actividad3_parqueadero;

/**
 *
 * @author stewa
 */
public class Pila {
    private Nodo cabeza;
    public void agregar(Informacion info) {
        if (cabeza == null) {
            cabeza = new Nodo();
            cabeza.info = info;
        } else {
            Nodo nuevo=new Nodo();
            nuevo.info=info;
            nuevo.siguiente=cabeza;
            cabeza=nuevo;
        }
    }
    public Informacion atender() {
        if (cabeza != null) {
            Nodo temp = cabeza;
            cabeza = cabeza.siguiente;
            temp.siguiente = null;
            return temp.info;
        }
        return new Informacion();
    }
    public void listar(){
      Nodo rec=cabeza;
        System.out.println("La pila esta conformada por ");
      while(rec!=null){
          System.out.print(rec.info.dato+ "  ");
          rec=rec.siguiente;
      }
    }

}
