/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package hapagapalegomenoma;

import java.util.Scanner;

/**
 *
 * @author luoos2514
 */
public class HapagapaLegomenoma {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("How many words?: ");
        Scanner poopMyself = new Scanner(System.in);
        int poops;
        String nextPoop = "EEEE";
        
        
        poops = poopMyself.nextInt();
        String[] poopArray = new String[poops];
        System.out.println("it did it");
        
        for (int i = 0; i < poopArray.length; i++){
            System.out.println(i);
            Scanner poopScanner = new Scanner(System.in);
            nextPoop = poopScanner.nextLine();
            
            poopArray[i] = nextPoop;
            System.out.println(nextPoop);
        }
        
        
    }
    
}
