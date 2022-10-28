/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_relation_1_desgeorge;

/**
 *
 * @author rom
 */
public class Voiture {
    public Voiture(String uneCaracteristique, String uneMarque, int nbplaces){
        Caracteristique = uneCaracteristique;//prendre en donnée uneCaracteristique et le transformer en Caracteristique
        Marque = uneMarque;//prendre en donnée uneMarque et le transformer en Marque
        places = nbplaces;//prendre en donnée nbplaces et le transformer en places
    }
    String Caracteristique;
    String Marque;
    int places;
    Personne Proprietaire ;
    
    @Override
    public String toString() {//Lire la classe Voiture
String chaine_a_retourner;
chaine_a_retourner = Marque + Caracteristique + " qui contient "+ places+" places ";
return chaine_a_retourner ;
    }   
}
