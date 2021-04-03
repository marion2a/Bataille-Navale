/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bataille.navale;
import java.util.*;
import java.lang.*;


/**
 *
 * @author chloc
 */
public class Plateau {

    static String grille1[][] = new String[16][16];
    static String grille2[][] = new String[16][16];
    static String vide = new String("   ");
    static Random random = new Random();
    
    public static void creerPlateau(String grille1[][], String grille2[][]) {
        for (int i=0; i<16; i++) {
            for (int j=0; j<16; j++) {
                grille1[i][j]="   ";
            }
        }
        for (int i=1; i<16; i++) {
            if (i<10) {
                grille1[0][i]=" " + i + " ";
                grille2[0][i]=" " + i + " ";
            }
            else {
                grille1[0][i]=i + " ";
                grille2[0][i]=i + " ";
            }
            
        }
        for (int i=1; i<16; i++) {
            grille1[i][0]=" " + (char) (i+96) + " ";
            grille2[i][0]=" " + (char) (i+96) + " ";
        }
    }

    public static void placerBateaux(String grille1[][]) {
        //Initialisation des bateaux
        int cuirasse=7;
        int croiseur1=5, croiseur2=5;
        int destroyeur1=3, destroyeur2=3, destroyeur3=3;
        int sousMarin1=1, sousMarin2=1, sousMarin3=1, sousMarin4=1;
        int sens = 1+random.nextInt(2);
        int ligne = 1+random.nextInt(15);
        int colonne = 1+random.nextInt(15);
        
        if (sens==1) {
            while (ligne+cuirasse>16) ligne = 1+random.nextInt(15-1);
            while ((vide.equals(grille1[ligne][colonne])==false)||
                    (vide.equals(grille1[ligne+1][colonne])==false)||
                    (vide.equals(grille1[ligne+2][colonne])==false)||
                    (vide.equals(grille1[ligne+3][colonne])==false)||
                    (vide.equals(grille1[ligne+4][colonne])==false)||
                    (vide.equals(grille1[ligne+5][colonne])==false)||
                    (vide.equals(grille1[ligne+6][colonne])==false)){
                ligne = 1+random.nextInt(15-1);
                colonne = 1+random.nextInt(15-1);
            }
            for (int i=0; i<cuirasse; i++) {
                grille1[ligne+i][colonne]=" Cu";  
            }
        }
        else {
            while ((colonne+cuirasse>16)) colonne = 1+random.nextInt(15-1);
            while ((vide.equals(grille1[ligne][colonne])==false)||
                    (vide.equals(grille1[ligne][colonne+1])==false)||
                    (vide.equals(grille1[ligne][colonne+2])==false)||
                    (vide.equals(grille1[ligne][colonne+3])==false)||
                    (vide.equals(grille1[ligne][colonne+4])==false)||
                    (vide.equals(grille1[ligne][colonne+5])==false)||
                    (vide.equals(grille1[ligne][colonne+6])==false)){
                ligne = 1+random.nextInt(15-1);
                colonne = 1+random.nextInt(15-1);
            }
            for (int i=0; i<cuirasse; i++) {
                grille1[ligne][colonne+i]=" Cu";  
            }
            
        }
        
        sens = 1+random.nextInt(2);
        ligne = 1+random.nextInt(15);
        colonne = 1+random.nextInt(15);
        if (sens==1) {
            while (ligne+croiseur1>15) ligne = 1+random.nextInt(15-1);
            while ((vide.equals(grille1[ligne][colonne])==false)||
            (vide.equals(grille1[ligne+1][colonne])==false)||
            (vide.equals(grille1[ligne+2][colonne])==false)||
            (vide.equals(grille1[ligne+3][colonne])==false)||
            (vide.equals(grille1[ligne+4][colonne])==false)){
                ligne = 1+random.nextInt(15-1);
                colonne = 1+random.nextInt(15-1);
            }
            for (int i=0; i<croiseur1; i++) {
                grille1[ligne+i][colonne]=" Cr";
            }
        }
        else {
            while ((colonne+croiseur1>15)) colonne = 1+random.nextInt(15-1);
            while ((vide.equals(grille1[ligne][colonne])==false)||
            (vide.equals(grille1[ligne][colonne+1])==false)||
            (vide.equals(grille1[ligne][colonne+2])==false)||
            (vide.equals(grille1[ligne][colonne+3])==false)||
            (vide.equals(grille1[ligne][colonne+4])==false)){
                ligne = 1+random.nextInt(15-1);
                colonne = 1+random.nextInt(15-1);
            }
            for (int i=0; i<croiseur1; i++) {
            grille1[ligne][colonne+i]=" Cr";
            }
        }
        
        sens = 1+random.nextInt(2);
        ligne = 1+random.nextInt(15);
        colonne = 1+random.nextInt(15);
        if (sens==1) {
            while (ligne+croiseur2>15) ligne = 1+random.nextInt(15-1);
            while ((vide.equals(grille1[ligne][colonne])==false)||
            (vide.equals(grille1[ligne+1][colonne])==false)||
            (vide.equals(grille1[ligne+2][colonne])==false)||
            (vide.equals(grille1[ligne+3][colonne])==false)||
            (vide.equals(grille1[ligne+4][colonne])==false)){
                ligne = 1+random.nextInt(15-1);
                colonne = 1+random.nextInt(15-1);
            }
            for (int i=0; i<croiseur2; i++) {
                grille1[ligne+i][colonne]=" Cr";
            }
        }
        else {
            while ((colonne+croiseur2>15)) colonne = 1+random.nextInt(15-1);
            while ((vide.equals(grille1[ligne][colonne])==false)||
            (vide.equals(grille1[ligne][colonne+1])==false)||
            (vide.equals(grille1[ligne][colonne+2])==false)||
            (vide.equals(grille1[ligne][colonne+3])==false)||
            (vide.equals(grille1[ligne][colonne+4])==false)){
                ligne = 1+random.nextInt(15-1);
                colonne = 1+random.nextInt(15-1);
            }
            for (int i=0; i<croiseur2; i++) {
            grille1[ligne][colonne+i]=" Cr";
            }
        }
        
        sens = 1+random.nextInt(2);
        ligne = 1+random.nextInt(15);
        colonne = 1+random.nextInt(15);
        if (sens==1) {
            while (ligne+destroyeur1>15) ligne = 1+random.nextInt(15-1);
            while ((vide.equals(grille1[ligne][colonne])==false)||
            (vide.equals(grille1[ligne+1][colonne])==false)||
            (vide.equals(grille1[ligne+2][colonne])==false)){
                ligne = 1+random.nextInt(15-1);
                colonne = 1+random.nextInt(15-1);
            }
            for (int i=0; i<destroyeur1; i++) {
                grille1[ligne+i][colonne]=" D ";
            }
        }
        else {
            while ((colonne+destroyeur1>15)) colonne = 1+random.nextInt(15-1);
            while ((vide.equals(grille1[ligne][colonne])==false)||
            (vide.equals(grille1[ligne][colonne+1])==false)||
            (vide.equals(grille1[ligne][colonne+2])==false)){
                ligne = 1+random.nextInt(15-1);
                colonne = 1+random.nextInt(15-1);
            }
            for (int i=0; i<destroyeur1; i++) {
            grille1[ligne][colonne+i]=" D ";
            }
        }
        
        sens = 1+random.nextInt(2);
        ligne = 1+random.nextInt(15);
        colonne = 1+random.nextInt(15);
        if (sens==1) {
            while (ligne+destroyeur2>15) ligne = 1+random.nextInt(15-1);
            while ((vide.equals(grille1[ligne][colonne])==false)||
            (vide.equals(grille1[ligne+1][colonne])==false)||
            (vide.equals(grille1[ligne+2][colonne])==false)){
                ligne = 1+random.nextInt(15-1);
                colonne = 1+random.nextInt(15-1);
            }
            for (int i=0; i<destroyeur2; i++) {
                grille1[ligne+i][colonne]=" D ";
            }
        }
        else {
            while ((colonne+destroyeur2>15)) colonne = 1+random.nextInt(15-1);
            while ((vide.equals(grille1[ligne][colonne])==false)||
            (vide.equals(grille1[ligne][colonne+1])==false)||
            (vide.equals(grille1[ligne][colonne+2])==false)){
                ligne = 1+random.nextInt(15-1);
                colonne = 1+random.nextInt(15-1);
            }
            for (int i=0; i<destroyeur2; i++) {
            grille1[ligne][colonne+i]=" D ";
            }
        }
        
        sens = 1+random.nextInt(2);
        ligne = 1+random.nextInt(15);
        colonne = 1+random.nextInt(15);
        if (sens==1) {
            while (ligne+destroyeur3>15) ligne = 1+random.nextInt(15-1);
            while ((vide.equals(grille1[ligne][colonne])==false)||
            (vide.equals(grille1[ligne+1][colonne])==false)||
            (vide.equals(grille1[ligne+2][colonne])==false)){
                ligne = 1+random.nextInt(15-1);
                colonne = 1+random.nextInt(15-1);
            }
            for (int i=0; i<destroyeur3; i++) {
                grille1[ligne+i][colonne]=" D ";
            }
        }
        else {
            while ((colonne+destroyeur3>15)) colonne = 1+random.nextInt(15-1);
            while ((vide.equals(grille1[ligne][colonne])==false)||
            (vide.equals(grille1[ligne][colonne+1])==false)||
            (vide.equals(grille1[ligne][colonne+2])==false)){
                ligne = 1+random.nextInt(15-1);
                colonne = 1+random.nextInt(15-1);
            }
            for (int i=0; i<destroyeur3; i++) {
            grille1[ligne][colonne+i]=" D ";
            }
        }
        
        sens = 1+random.nextInt(2);
        ligne = 1+random.nextInt(15);
        colonne = 1+random.nextInt(15);
        if (sens==1) {
            while (ligne+sousMarin1>15) ligne = 1+random.nextInt(15-1);
            while (vide.equals(grille1[ligne][colonne])==false){
                ligne = 1+random.nextInt(15-1);
                colonne = 1+random.nextInt(15-1);
            }
                grille1[ligne][colonne]=" S ";
        }
        else {
            while ((colonne+sousMarin1>15)) colonne = 1+random.nextInt(15-1);
            while (vide.equals(grille1[ligne][colonne])==false){
                ligne = 1+random.nextInt(15-1);
                colonne = 1+random.nextInt(15-1);
            }
            grille1[ligne][colonne]=" S ";
        }
        
        sens = 1+random.nextInt(2);
        ligne = 1+random.nextInt(15);
        colonne = 1+random.nextInt(15);
        if (sens==1) {
            while (ligne+sousMarin2>15) ligne = 1+random.nextInt(15-1);
            while (vide.equals(grille1[ligne][colonne])==false){
                ligne = 1+random.nextInt(15-1);
                colonne = 1+random.nextInt(15-1);
            }
                grille1[ligne][colonne]=" S ";
        }
        else {
            while ((colonne+sousMarin2>15)) colonne = 1+random.nextInt(15-1);
            while (vide.equals(grille1[ligne][colonne])==false){
                ligne = 1+random.nextInt(15-1);
                colonne = 1+random.nextInt(15-1);
            }
            grille1[ligne][colonne]=" S ";
        }
        
        sens = 1+random.nextInt(2);
        ligne = 1+random.nextInt(15);
        colonne = 1+random.nextInt(15);
        if (sens==1) {
            while (ligne+sousMarin3>15) ligne = 1+random.nextInt(15-1);
            while (vide.equals(grille1[ligne][colonne])==false){
                ligne = 1+random.nextInt(15-1);
                colonne = 1+random.nextInt(15-1);
            }
                grille1[ligne][colonne]=" S ";
        }
        else {
            while ((colonne+sousMarin3>15)) colonne = 1+random.nextInt(15-1);
            while (vide.equals(grille1[ligne][colonne])==false){
                ligne = 1+random.nextInt(15-1);
                colonne = 1+random.nextInt(15-1);
            }
            grille1[ligne][colonne]=" S ";
        }
        
        sens = 1+random.nextInt(2);
        ligne = 1+random.nextInt(15);
        colonne = 1+random.nextInt(15);
        if (sens==1) {
            while (ligne+sousMarin4>15) ligne = 1+random.nextInt(15-1);
            while (vide.equals(grille1[ligne][colonne])==false){
                ligne = 1+random.nextInt(15-1);
                colonne = 1+random.nextInt(15-1);
            }
                grille1[ligne][colonne]=" S ";
        }
        else {
            while ((colonne+sousMarin4>15)) colonne = 1+random.nextInt(15-1);
            while (vide.equals(grille1[ligne][colonne])==false){
                ligne = 1+random.nextInt(15-1);
                colonne = 1+random.nextInt(15-1);
            }
            grille1[ligne][colonne]=" S ";
        }
    }
    
    public static void afficherPlateau(String grille1[][]) {
        for (int i=0; i<16; i++) {
            for (int j=0; j<16; j++) {
                System.out.print(grille1[i][j] +"|");
            }
            System.out.println("");
            System.out.println("----------------------------------------------------------------");
        }
        System.out.println("");
    }

}
