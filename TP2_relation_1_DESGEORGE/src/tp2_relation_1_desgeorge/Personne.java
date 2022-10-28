/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_relation_1_desgeorge;

/**
 *
 * @author rom
 */
public class Personne {
    public Personne(String unPrenom, String unNom){
        Prenom = unPrenom;
        Nom = unNom;
        nbVoitures = 0;
        liste_voitures = new Voiture [3] ;
    }
    String Prenom;
    String Nom;
    int nbVoitures ;
    Voiture [] liste_voitures ;

    @Override
    public String toString() {
    String chaine_a_retourner;
    chaine_a_retourner = Prenom + " " + Nom ;
    return chaine_a_retourner ;
    } 
    
}
