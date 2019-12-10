package bol6_3;

import java.util.Scanner;

/**
 *
 * @author lromerofajar
 */
public class MasMenosCero {

    public void MasMenosCero(int numero){
        
        if( numero>0)
            System.out.println("+");
        else if (numero<0)
            System.out.println("-");
            else 
            System.out.println("0");
   
    }
     
public int perdirInt(){
        
        Scanner sc =new Scanner (System.in);
       
        System.out.println("Numero ");
        int num =sc.nextInt();
        return num;
    }
            
    
}
