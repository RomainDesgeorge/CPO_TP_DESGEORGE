/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personnages;

import Armess.Armes;
import java.util.ArrayList;

/**
 *
 * @author rom
 */
public class Personnage {
    public Personnage(String unNom, int att){
        Nom = unNom;
        niv_vie = att;
        nb_armes = 0;
        
       
    }
    String Nom;
    private int niv_vie ;  
    int nb_armes;
    Armes arme_en_main =null;
    ArrayList<Armes> Tab_armes=new ArrayList<>(5);

    public Armes getArme_en_main() {
        return arme_en_main;
    }

    
    public void Ajout_arme(Armes arme){
        if(Tab_armes.size() < 5){
            Tab_armes.add(arme);
        }
    }
    
    
    public void Methode_arme(Armes arme){
    int verif = 0;    
        for (int i=0;i<Tab_armes.size();i++){
            
            if (Tab_armes.get(i) == arme){
                System.out.println("l'arme a bien ete trouvee et affectee");
                arme_en_main = Tab_armes.get(i);
                verif = 1;
                break;                
            }
            
        }
        if (verif==0){
       System.out.println("l'arme n'a pas ete trouvee"); 
        }
    }


    public int getNiv_vie() {
        return niv_vie;
    }
    
    
    public void setNiv_vie(int niv_vie) {
        if (niv_vie>0){
        this.niv_vie = niv_vie;
        }
    }

    @Override
    public String toString() {
        return "Personnage{" + "Nom=" + Nom + ", niv_vie=" + niv_vie+ '}';
    }
    
}
