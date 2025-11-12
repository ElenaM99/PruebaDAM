
package ecocopia;

import java.util.Scanner;


public class Ecocopia {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca un número positivo:");
        int veces = sc.nextInt();
        for (int i = 1; i <= veces; i++) {
            System.out.println("Eco...");
        }
    }

}
