/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_biere_desgeorge;

/**
 *
 * @author rom
 */
public class BouteilleBiere {
    public BouteilleBiere(String unNom, double unDegre, String uneBrasserie) {
        nom = unNom;//prendre en donnée unNom et le transformer en nom
        degreAlcool = unDegre;//prendre en donnée unDegre et le transformer en degreAlcool
        brasserie = uneBrasserie;//prendre en donnée uneBrasserie et le transformer en brasserie
        ouverte = false;//La biere est fermée
}
    String nom;
    double degreAlcool;
    String brasserie;
    boolean ouverte;
    public void lireEtiquette() {//Lire une classe Biere
        System.out.println("Bouteille de " + nom +" (" + degreAlcool +" degres) \nBrasserie : " + brasserie ) ;
}
public void decapsuler() {//Decapsuler la biere si elle ne l'est pas deja
        if (ouverte == false ) {//Si la biere est fermée
            ouverte = true;//ouvrir la biere
        }
        else{//si la biere est ouverte
            System.out.println("erreur la biere est deja ouverte");
        }
        }
    @Override
    public String toString() {//Lire un System.out.println d'une class
String chaine_a_retourner;
chaine_a_retourner = nom + " (" + degreAlcool + " degrés) Ouverte ? ";
if (ouverte == true ) chaine_a_retourner += "oui" ;
else chaine_a_retourner += "non" ;
return chaine_a_retourner ;
}

}

