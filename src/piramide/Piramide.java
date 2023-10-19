/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package piramide;

import java.util.Scanner;

/**
 *
 * @author MTE Luis Estrada
 */
public class Piramide {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Rogelio Diaz Rodriguez +5
        //Robledo Maldonado Ian +5
        //Morales Orihiuela Emmanuel +5
        Scanner leer = new Scanner(System.in);
        int n,v_impar = 1,v_par = 2;
        System.out.println("Captura el numero de renglones:");
        n = leer.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if( i%2 == 1){
                    System.out.print(v_impar+", ");
                    v_impar+=2;
                }else{
                    System.out.print(v_par+", ");
                    v_par+=2;
                }   
            }
            System.out.println("");
        }
        
        
    }
    
}
