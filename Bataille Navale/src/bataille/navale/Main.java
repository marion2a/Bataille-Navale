/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bataille.navale;
import java.util.*;
import bataille.navale.Plateau;

/**
 *
 * @author chloc
 */
public class Main {
    
    static String grille1[][] = new String[16][16];
    static String grille2[][] = new String[16][16];

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Plateau.creerPlateau(grille1, grille2);
        Plateau.placerBateaux(grille1);
        Plateau.afficherPlateau(grille1);
    }
    
}
