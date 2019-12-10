package bol6_2;

import java.util.Scanner;

/**
 *
 * @author lromerofajar
 */
public class Bol6_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        /**
         * 2- Implementa un programa no que se tecleen dous números de tipo
         * short . Se o primeiro é maior ou igual que o segundo,visualizaremos
         * a resta . En calquera caso visualizaremos a suma .
         */
        
        SumaResta obj1 =new SumaResta();
       Scanner sc= new Scanner (System.in);
       System.out.println("Primer numero:");
       short numero= sc.nextShort();
       System.out.println("Segundo numero:");
       short numero1= sc.nextShort();
       
       System.out.println(numero+numero1+" resultado de la suma");
       
       obj1.sumaResta(numero, numero1);
    }
    
}
