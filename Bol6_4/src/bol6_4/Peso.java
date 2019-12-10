package bol6_4;

import java.util.Scanner;

/**
 *
 * @author lromerofajar
 */
public class Peso {
    
    public void Peso(){
    
    Scanner leer=new Scanner(System.in);
    
    String nombre, nombre1; int peso, peso1;
    
        System.out.println("Nombre de la primera persona ");
        nombre=leer.nextLine();
        System.out.println("Peso de la primera persona ");
        peso=leer.nextInt();
        
        System.out.println("Nombre de la segunda persona ");
        leer.nextLine();
        nombre1=leer.nextLine();
        System.out.println("Peso de la segunda persona ");
        peso1=leer.nextInt();
        
    
     if(peso>peso1)
        System.out.println("Nombre "+ nombre+ " peso "+ peso+ " la diferencia de peso es de: "+ (peso-peso1));
     else
         System.out.println("Nombre "+ nombre1+ " peso "+ peso1+ " la diferencia de peso es de: "+ (peso1-peso));
    
    
    }
  
}
