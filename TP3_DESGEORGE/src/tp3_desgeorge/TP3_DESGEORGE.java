/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp3_desgeorge;

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
        Baton Charme = new Baton("Charme",5,6);// TODO code application logic here
        
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
        
        ArrayList<Personnage> Tab1=new ArrayList<>();
        Tab1.add(Gandalf);
        Tab1.add(Garcimore);
        Tab1.add(Conan);
        Tab1.add(Lannister);
        int tailleTab1 = Tab1.size();
        for(int i=0;i<tailleTab1;i++){
        System.out.println(Tab1.get(i)); 
        }
    }
    
}
