//3.	Realice una función que retorne si 2 listas recibidas son iguales
package lista;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ListaMain {
  public static void main(String[] args){
    Lista lista = new Lista();
    ArrayList<Lista> lista1 = new ArrayList();
    ArrayList<Lista> lista2 = new ArrayList();
    lista.ingresar("Ingrese el tamaño de la lista #1",lista1);
    lista.ingresar("Ingrese el tamaño de la lista #2",lista2);
    lista.mostrar("lista #1",lista1);
    lista.mostrar("lista #2",lista2);
    lista.comparar(lista1,lista2);
  }
}
