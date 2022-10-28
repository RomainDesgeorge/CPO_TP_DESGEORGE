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
    Voiture uneClio = new Voiture ("Clio", "Renault", 5,bob) ;
    Voiture uneAutreClio = new Voiture ("Clio", "Renault", 5, bob ) ;
    Voiture une2008 = new Voiture ("2008", "Peugeot", 6, reno ) ;
    Voiture uneMicra = new Voiture ("Micra", "Nissan", 4, reno ) ;

    System.out.println("liste des voitures disponibles \n"+ uneClio +"\n" + uneAutreClio + "\n" + une2008 + "\n" + uneMicra ) ;
        // TODO code application logic here
    }
    
}
