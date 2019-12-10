package bol6_6;

import java.util.Scanner;

/**
 *
 * @author lromerofajar
 */
public class Productos {
    
    public void Productos(){
    
    Scanner leer=new Scanner(System.in);
    
    String productoNombre; int ventasAnuales;
    
    System.out.println("Nombre del producto: ");
    productoNombre=leer.nextLine();
    System.out.println("Número de ventas: ");
    ventasAnuales=leer.nextInt();
    
    if(ventasAnuales<=100)
        System.out.println("Es de bajo consumo.");
    else if(ventasAnuales<=500)
        System.out.println("Es de medio consumo.");
    else if(ventasAnuales<=1000)
        System.out.println("Es de alto consumo.");
    else
        System.out.println("Es de primera necesidad.");  
    }
    
    
}
