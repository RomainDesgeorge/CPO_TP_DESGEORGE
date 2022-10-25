/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_biere_desgeorge;

/**
 *
 * @author rom
 */
public class TP2_Biere_DESGEORGE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BouteilleBiere uneBiere = new BouteilleBiere("Cuvée des trolls",7.0,"Dubuisson") ;//Création de "uneBiere"    
uneBiere.lireEtiquette(); //Lire "uneBiere"

BouteilleBiere AutreBiere = new BouteilleBiere("Leffe",6.6,"Abbaye de Leffe") ;//Création de "AutreBiere"
AutreBiere.lireEtiquette();//Lire "AutreBiere"

BouteilleBiere deuxBiere = new BouteilleBiere("Desperados",5.9,"Tequila flavour") ;//Création de "deuxBiere"
deuxBiere.lireEtiquette();//Lire "deuxBiere"

BouteilleBiere troisBiere = new BouteilleBiere("Pelford",5.8,"Mon frigo") ;//Création de "troisBiere"
troisBiere.lireEtiquette();//Lire "troisBiere"

BouteilleBiere quatreBiere = new BouteilleBiere("La Chouffe",8.0,"Nain sur un vélo") ;//Création de "quatreBiere"
quatreBiere.lireEtiquette();//Lire "quatreBiere"

quatreBiere.decapsuler();

System.out.println(uneBiere) ;

uneBiere.decapsuler();
// TODO code application logic here
    }
    
}
