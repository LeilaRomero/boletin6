/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bol6_7;

import java.util.Scanner;

/**
 *
 * @author lromerofajar
 */
public class Figuras {
    
    public void Figuras(){
        
        Scanner leer=new Scanner(System.in);
        
        System.out.println("Menu: figura para calcular su superficie\n 1.-Cuadrado 2.-Triangulo 3.-Circulo");
        int figura=leer.nextInt();
        switch(figura){
            case 1: System.out.println("Lado del cuadrado");
                    float lado=leer.nextFloat();
                    System.out.println("Su superficie es= "+ (lado*lado));
                    break;
            case 2: System.out.println("Base del triangulo");
                    float base=leer.nextFloat();
                    System.out.println("Altura del triangulo");
                    float altura=leer.nextFloat();
                    System.out.println("Su superficie es= "+ (base*(altura/2)));
                    break;
            case 3: System.out.println("Radio del circulo");
                    float radio=leer.nextFloat();
                    System.out.println("Su superficie es= "+(Math.PI*Math.pow(radio, 2)));
                    break;
            default:System.out.println("El número no es correcto");
        }  
        
    }
    
}
