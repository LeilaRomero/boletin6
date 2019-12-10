package bol6_5;

import java.util.Scanner;

/**
 *
 * @author lromerofajar
 */
public class Distintos {
    
    public void Distintos(int numeros){
        
        Scanner leer=new Scanner(System.in);
        
        int numero, numero1, numero2;
        
        System.out.println("Primer número ");
        numero=leer.nextInt();
        System.out.println("Segundo número ");
        numero1=leer.nextInt();
        System.out.println("Tercer número ");
        numero2=leer.nextInt();
        
        if(numero>numero1 && numero>numero2)
            System.out.println("");
        else if(numero1>numero && numero1>numero2)
            System.out.println("");
        else
            System.out.println("");
    }
    
    
    
}
