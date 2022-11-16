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
        Epee Excalibur = new Epee("Excalibur",7,5);//Création de l'épée Excalibur
        Epee Durandal = new Epee("Durandal",4,7);//Création de l'épée Durandal
        Baton Chene = new Baton("Chene",4,5);//Création du baton Chêne
        Baton Charme = new Baton("Charme",5,6);//Création du baton Charme
        
        ArrayList<Armes> Tab=new ArrayList<>();//Création d'un tableau dynamique prenant des Armes
        Tab.add(Excalibur);//Ajout de l'arme Excalibur
        Tab.add(Durandal);//Ajout de l'arme Durandal
        Tab.add(Chene);//Ajout de l'arme Chene
        Tab.add(Charme);//Ajout de l'arme Charme
        int tailleTab = Tab.size();
        for(int i=0;i<tailleTab;i++){//Jusqu'a la taille du tableau
        System.out.println(Tab.get(i));//Lis chaque case du tableau
        }
        
        Magicien Gandalf = new Magicien("Gandalf",65,true);//Création du magicien Gandalf
        Magicien Garcimore = new Magicien("Garcimore",44,false);//Création du magicien Garcimore
        Guerrier Conan = new Guerrier("Conan",78,false);//Création du Guerrier Conan
        Guerrier Lannister = new Guerrier("Lannister",45,true);//Création du Guerrier Lannister
        
        Gandalf.Ajout_arme(Charme);//On ajoute charme à l'inventaire de gandalf
        Gandalf.Methode_arme(Charme);//On ajoute charme dans la main de gandalf      
        
        ArrayList<Personnage> Tab1=new ArrayList<>();//Création d'un tableau dynamique prenant des Personnages
        Tab1.add(Gandalf);//Ajout du personnage Gandalf
        Tab1.add(Garcimore);//Ajout du personnage Garcimore
        Tab1.add(Conan);//Ajout du personnage Conan
        Tab1.add(Lannister);//Ajout du personnage Lannister
        int tailleTab1 = Tab1.size();
        for(int i=0;i<tailleTab1;i++){//Jusqu'a la taille du tableau
        System.out.println(Tab1.get(i)); //Lis chaque case du tableau
        
        
        Magicien Dumbledore = new Magicien("Dumbledore",82,true);//Création du magicien Dumbledore
        Guerrier Aragorn = new Guerrier("Aragorn",87,false);//Création du guerrier Aragorn
        Epee Goulijan = new Epee("Goulijan",5,8);//Création de l'épée Goulijan
        Epee Malcolm = new Epee("Malcolm",6,4);//Création de l'épée Malcolm
        Epee Yvan = new Epee("Yvan",7,5);//Création de l'épée Yvan
        Baton Baguette = new Baton("Baguette",7,2);//Création du baton baguette
        Baton Sourceaux = new Baton("Sourceaux",5,5);//Création du baton Sourceaux
        Baton Kali = new Baton("Kali",3,7);//Création du baton Kali
        
        Aragorn.Ajout_arme(Kali);//On ajoute Kali à l'inventaire d'Aragorn
        Aragorn.Ajout_arme(Malcolm);//On ajoute Malcolm à l'inventaire d'Aragorn
        Aragorn.Ajout_arme(Goulijan);//On ajoute Goulijan à l'inventaire d'Aragorn
        Aragorn.Methode_arme(Malcolm);//On ajoute Malcolm à la main d'Aragron 
        Dumbledore.Ajout_arme(Baguette);//On ajoute Baguette à l'inventaire de Dumbledore
        Dumbledore.Ajout_arme(Sourceaux);//On ajoute Sourceaux à l'inventaire de Dumbledore
        Dumbledore.Ajout_arme(Yvan);//On ajoute Yvan à l'inventaire de Dumbledore
        Dumbledore.Methode_arme(Yvan);//On ajoute Yvan dans la main de Dumbledore
        Aragorn.Armepredilection();//Savoir combien d'épees a Aragorn
        Dumbledore.Armepredilection();//Savoir combien de batons a Dumbledore


        }
    }
    
}
