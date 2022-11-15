/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp3_desgeorge;

import Personnages.Personnage;
import Personnages.Magicien;
import Personnages.Guerrier;
import Armess.Armes;
import Armess.Epee;
import Armess.Baton;
import java.util.ArrayList;

/**
 *
 * @author rom
 */
public class TP3_DESGEORGE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Epee Excalibur = new Epee("Excalibur",7,5);
        Epee Durandal = new Epee("Durandal",4,7);
        Baton Chene = new Baton("Chene",4,5);
        Baton Charme = new Baton("Charme",5,6);
        
        ArrayList<Armes> Tab=new ArrayList<>();
        Tab.add(Excalibur);
        Tab.add(Durandal);
        Tab.add(Chene);
        Tab.add(Charme);
        int tailleTab = Tab.size();
        for(int i=0;i<tailleTab;i++){
        System.out.println(Tab.get(i));
        }
        
        Magicien Gandalf = new Magicien("Gandalf",65,true);
        Magicien Garcimore = new Magicien("Garcimore",44,false);
        Guerrier Conan = new Guerrier("Conan",78,false);
        Guerrier Lannister = new Guerrier("Lannister",45,true);
        
        Gandalf.Ajout_arme(Charme);
        Gandalf.Methode_arme(Charme);        
        
        ArrayList<Personnage> Tab1=new ArrayList<>();
        Tab1.add(Gandalf);
        Tab1.add(Garcimore);
        Tab1.add(Conan);
        Tab1.add(Lannister);
        int tailleTab1 = Tab1.size();
        for(int i=0;i<tailleTab1;i++){
        System.out.println(Tab1.get(i)); 
        
        
        Magicien Dumbledore = new Magicien("Dumbledore",82,true);
        Guerrier Aragorn = new Guerrier("Aragorn",87,false);
        Epee Goulijan = new Epee("Goulijan",5,8);
        Epee Malcolm = new Epee("Malcolm",6,4);
        Epee Yvan = new Epee("Yvan",7,5);
        Baton Baguette = new Baton("Baguette",7,2);
        Baton Sourceaux = new Baton("Sourceaux",5,5);
        Baton Kali = new Baton("Kali",3,7);
        
        Aragorn.Ajout_arme(Kali);
        Aragorn.Ajout_arme(Malcolm);
        Aragorn.Ajout_arme(Goulijan);
        Aragorn.Methode_arme(Malcolm); 
        Dumbledore.Ajout_arme(Baguette);
        Dumbledore.Ajout_arme(Sourceaux);
        Dumbledore.Ajout_arme(Yvan);
        Aragorn.Methode_arme(Yvan);
        Aragorn.Armepredilection();
        Dumbledore.Armepredilection();


        }
    }
    
}
