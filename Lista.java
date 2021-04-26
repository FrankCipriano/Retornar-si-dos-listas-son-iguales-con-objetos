package lista;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Scanner;

public class Lista {
  private int value,n;
  Scanner read = new Scanner(System.in);
  public Lista(){
    
  }
  public Lista(int value){
    this.value=value;
  }
  public int getValue(){
    return value;
  }
  public void setValue(int value){
    this.value=value;
  }
  public void ingresar(String a, ArrayList<Lista> arreglo){
  System.out.println(a);
  n=read.nextInt();
    do{
      System.out.println("digite un valor para la lista:");
      value = read.nextInt();
      Lista elemento = new Lista(value);
      arreglo.add(elemento);
    }while(arreglo.size()<n);
  }
  public void mostrar(String a, ArrayList<Lista> arreglo){
  System.out.println(a);
    for(int i=0;i<arreglo.size();i++){
      System.out.println(arreglo.get(i));
    }
  }
  public void comparar(ArrayList<Lista> arreglo1,ArrayList<Lista> arreglo2){
  boolean bandera=false;
    Lista size1 = new Lista(arreglo1.size());
    Lista size2 = new Lista(arreglo2.size());
    if(size1.equals(size2)){
      Lista indexa = new Lista();
      Lista indexb = new Lista();
      for(int i=0;i<arreglo1.size();i++){
        indexa=arreglo1.get(i);
        indexb=arreglo2.get(i);
        if(indexa.equals(indexb)){
          bandera=true;
        }else{
          bandera=false;
          i=arreglo1.size();
        }
      }
      System.out.println("Las 2 listas son iguales?  "+bandera);
    }else{
      System.out.println("Las 2 listas son iguales?  "+bandera);
    }
  }
  public String toString(){
    return String.format("%s",this.value);
  }
  public boolean equals(Lista a){
    if(this.value==a.getValue()){
      return true;
    }else{
      return false;
    }
  }
}
