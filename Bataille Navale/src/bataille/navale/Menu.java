/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bataille.navale;
import java.util.*;

/**
 *
 * @author chloc
 */
public class Menu {
    
    public int menu() {
        int n;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Menu:");
        System.out.println("1. Jouer une partie");
        System.out.println("2. Charger une partie");
        System.out.println("3. Aide");
        System.out.println("4. Quitter");
        n = scanner.nextInt();
        while ((n<1)||(n>4)) {
            System.out.println("Erreur, cette option n'existe pas.");
            System.out.println("Recommencez...");
            n = scanner.nextInt();
        }
        return n;
    }

}
