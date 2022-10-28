/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_relation_1_desgeorge;

/**
 *
 * @author rom
 */
public class TP2_relation_1_DESGEORGE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Personne bob = new Personne("Bobby", "Sixkiller");//Création de la personne bob
    Personne reno = new Personne("Reno", "Raines");//Création de la personne reno
    Voiture uneClio = new Voiture ("Clio", "Renault", 5) ;//Création de la voiture uneClio
    Voiture uneAutreClio = new Voiture ("Clio", "Renault", 5) ;//Création de la voiture uneAutreClio
    Voiture une2008 = new Voiture ("2008", "Peugeot", 6) ;//Création de la voiture une2008
    Voiture uneMicra = new Voiture ("Micra", "Nissan", 4) ;//Création de la voiture uneMicra
    Voiture unePicasso = new Voiture("Picasso","Citroen",5);//Création de la voiture unePicasso
    
    bob.liste_voitures[0] = uneClio ;//Ajouter uneClio à la collection de Bob
    bob.nbVoitures = 1 ;
    uneClio.Proprietaire = bob ;//Ajouter Bob à la collection de uneClio
    
    bob.liste_voitures[1] = uneAutreClio ;//Ajouter uneAutreClio à la collection de Bob
    bob.nbVoitures = 2 ;
    uneAutreClio.Proprietaire = bob ;//Ajouter Bob à la collection de uneAutreClio
    
    reno.liste_voitures[0] = une2008 ;//Ajouter une2008 à la collection de reno
    reno.nbVoitures = 1 ;
    une2008.Proprietaire = reno ;//Ajouter reno à la collection de une2008
    
    reno.liste_voitures[1] = uneMicra ;//Ajouter uneMicra à la collection de reno
    reno.nbVoitures = 2 ;
    uneMicra.Proprietaire = reno ;//Ajouter Reno à la collection de uneMicra
    System.out.println("liste des voitures disponibles \n"+ uneClio +"\n" + uneAutreClio + "\n" + une2008 + "\n" + uneMicra ) ;
    System.out.println("la premiere voiture de Bob est une "+ bob.liste_voitures[0]+ " et sa deuxieme voiture est une "+bob.liste_voitures[1]  ) ;
    System.out.println("la premiere voiture de Reno est "+ reno.liste_voitures[0]+" et sa deuxieme voiture est une "+reno.liste_voitures[1] ) ;
    
        // TODO code application logic here
    
    bob.ajouter_voiture(unePicasso);//On appelle la fonction ajouter_voiture pour ajouter la Picasso à la collection de Bob

    
    for (int i=0;i<3;i++){
    System.out.println(bob.liste_voitures[i]);
    System.out.println(reno.liste_voitures[i]);
}   
}    
}   

