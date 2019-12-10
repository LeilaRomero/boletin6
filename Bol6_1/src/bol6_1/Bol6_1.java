package bol6_1;

/**
 *
 * @author lromerofajar
 */
public class Bol6_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        /**
         * 1- codifica un programa que saque, por consola, un número tecleado,
         * sempre que sexa positivo,xunto coa mensaxe “ e positivo “. 
         */
        
        Positivo obj1 =new Positivo();
       
       int num;
        num = obj1.pedirNum();
        obj1.positivo(num);
        
    }
    
}
