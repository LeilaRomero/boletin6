package bol6_1;

import java.util.Scanner;

/**
 *
 * @author lromerofajar
 */
public class Positivo {
    
    public void positivo(int numero){
        
        if(numero >=0)
            System.out.println("Es positivo.");
        //else
            //System.out.println("Error el número no es positivo.");
    }
    
    public int pedirNum(){
        Scanner sc=new Scanner (System.in);

        System.out.println("numero:");
        int num =sc.nextInt();
        return num;
    }
    
}
