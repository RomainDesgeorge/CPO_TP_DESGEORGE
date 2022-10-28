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
        Prenom = unPrenom;//prendre en donnée unPrenom et le transformer en Prenom
        Nom = unNom;//prendre en donnée unNom et le transformer en Nom
        nbVoitures = 0;//introduire à la variable nbVoiture 0
        liste_voitures = new Voiture [3] ;//introduire à la variable liste_voiture un tableau qui prends en entrée des Voitures et qui contient 3 places
    }
    String Prenom;
    String Nom;
    int nbVoitures ;
    Voiture [] liste_voitures ;

    public boolean ajouter_voiture( Voiture voiture_a_ajouter) {
    boolean bool1 = true;
        for (int i=0;i<3;i++){//Regarder pour chaque case du tableau de la personne
            if (liste_voitures[i]!=null){
                bool1 =false;//Si la voiture est deja dans la collection
                break;
            }
            else{
                bool1 = true;
            }
       }
        if (nbVoitures>3){//Si la personne a deja 3 voitures
            bool1 = true;
        }
        
       if (bool1 = true){//Si jamais c'est possible de rajouter la voiture
        liste_voitures[nbVoitures] = voiture_a_ajouter;//ajouter la voiture
        nbVoitures +=1;
        voiture_a_ajouter.Proprietaire = this;//ajouter le propriétaire à la voiture
       }
        return true;
    }
    
   
    
    @Override
    public String toString() {//Pouvoir lire la classe
    String chaine_a_retourner;
    chaine_a_retourner = Prenom + " " + Nom ;
    return chaine_a_retourner ;
    } 
    
}
