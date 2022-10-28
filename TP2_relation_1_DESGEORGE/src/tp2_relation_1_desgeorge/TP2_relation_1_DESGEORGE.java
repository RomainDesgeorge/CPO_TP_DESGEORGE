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
    Personne bob = new Personne("Bobby", "Sixkiller");
    Personne reno = new Personne("Reno", "Raines");
    Voiture uneClio = new Voiture ("Clio", "Renault", 5) ;
    Voiture uneAutreClio = new Voiture ("Clio", "Renault", 5) ;
    Voiture une2008 = new Voiture ("2008", "Peugeot", 6) ;
    Voiture uneMicra = new Voiture ("Micra", "Nissan", 4) ;
    Voiture unePicasso = new Voiture("Picasso","Citroen",5);
    
    bob.liste_voitures[0] = uneClio ;
    bob.nbVoitures = 1 ;
    uneClio.Proprietaire = bob ;
    
    bob.liste_voitures[1] = uneAutreClio ;
    bob.nbVoitures = 2 ;
    uneAutreClio.Proprietaire = bob ;
    
    reno.liste_voitures[0] = une2008 ;
    reno.nbVoitures = 1 ;
    une2008.Proprietaire = reno ;
    
    reno.liste_voitures[1] = uneMicra ;
    reno.nbVoitures = 2 ;
    uneMicra.Proprietaire = reno ;
    System.out.println("liste des voitures disponibles \n"+ uneClio +"\n" + uneAutreClio + "\n" + une2008 + "\n" + uneMicra ) ;
    System.out.println("la premiere voiture de Bob est une "+ bob.liste_voitures[0]+ " et sa deuxieme voiture est une "+bob.liste_voitures[1]  ) ;
    System.out.println("la premiere voiture de Reno est "+ reno.liste_voitures[0]+" et sa deuxieme voiture est une "+reno.liste_voitures[1] ) ;
    
        // TODO code application logic here
    
    bob.ajouter_voiture(unePicasso);

    
    for (int i=0;i<3;i++){
    System.out.println(bob.liste_voitures[i]);
    System.out.println(reno.liste_voitures[i]);
}   
}    
}   

