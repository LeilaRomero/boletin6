package bol6_2;

import java.util.Scanner;

/**
 *
 * @author lromerofajar
 */
public class SumaResta {
    
    public void sumaResta(short numero, short numero1){
        
        if (numero >= numero1)
            System.out.println("Resultado de la resta = "+ (numero-numero1));
        else
            System.out.println("");
    }
    
    public short pedirNum(){
        Scanner sc=new Scanner (System.in);

        System.out.println("numero:");
        short num =sc.nextShort();
        return num;
    }
}
