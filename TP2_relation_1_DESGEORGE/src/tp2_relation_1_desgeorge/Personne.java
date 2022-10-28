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

    public boolean ajouter_voiture( Voiture voiture_a_ajouter) {
    boolean bool = true;
    boolean bool1 = true;
        for (int i=0;i<3;i++){
            if (liste_voitures[i]!=null){
                bool1 =false;
                break;
            }
            else{
                bool1 = true;
            }
       }
        if (nbVoitures>3){
            bool1 = true;
        }
        
       if (bool1 = true){
        liste_voitures[nbVoitures] = voiture_a_ajouter;
        nbVoitures +=1;
        voiture_a_ajouter.Proprietaire = this;
       }
        return bool;
    }
    
   
    
    @Override
    public String toString() {
    String chaine_a_retourner;
    chaine_a_retourner = Prenom + " " + Nom ;
    return chaine_a_retourner ;
    } 
    
}
