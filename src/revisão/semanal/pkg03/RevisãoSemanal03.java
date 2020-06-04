
package revisão.semanal.pkg03;

import java.util.Scanner;

/**
 *
 * @author troll
 */
public class RevisãoSemanal03 {

    public static void main(String[] args) {

        double C, F;
        Scanner ler = new Scanner(System.in);

        System.out.println("Quantos graus esta fazendo em Celsius?");
        C = ler.nextDouble();
        F = (C*9/5)+32;
        
        System.out.println("A temperatura em Fahrenheit é:"+F);
    }
    
}
