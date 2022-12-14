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
        Nom = unNom;//On ajoute un nom au personnage
        niv_vie = att;//On ajoute un niveau de vie au personnage
        
       
    }
    String Nom;
    private int niv_vie ;  
    Armes arme_en_main =null;//On créé une arme propre à chaque personnage qui represente celle que le personnage a dans sa main
    ArrayList<Armes> Tab_armes=new ArrayList<>(5);//On créé un tableau de 5 case propre à chaque personnage qui permet de stocker des armes

    public Armes getArme_en_main() {
        return arme_en_main;//Permet de retourner l'arme_en_main
    }

    
    public void Ajout_arme(Armes arme){//Permet de créer d'un tableau d'un capacité maximale de 5
        if(Tab_armes.size() < 5){
            Tab_armes.add(arme);
        }
    }
    
    
    public void Methode_arme(Armes arme){//Permet de prendre une arme dans l'inventaire du personnage et de la mettre dans ses mains
    int verif = 0;  //Permet de savoir si l'arme se trouve dans l'inventaire ( = 0 si non trouvée)  
        for (int i=0;i<Tab_armes.size();i++){
            
            if (Tab_armes.get(i) == arme){//On verifie si l'arme recherchée se trouve dans l'inventaire du personnage
                System.out.println("l'arme a bien ete trouvee et affectee");
                arme_en_main = Tab_armes.get(i);//On met l'arme dans la main
                verif = 1;//L'arme est trouvée donc verif = 1
                break;                
            }
            
        }
        if (verif==0){//Si l'arme n'est pas dans l'inventaire
       System.out.println("l'arme n'a pas ete trouvee"); 
        }
    }


    public int getNiv_vie() {//Permet de retourner le niveau de vie du personnage
        return niv_vie;
    }
    
    
    public void setNiv_vie(int niv_vie) {//Prends en entrée le niveau de vie si il est positif
        if (niv_vie>=0){
        this.niv_vie = niv_vie;
        }
    }

    @Override
    public String toString() {
        return "Personnage{" + "Nom=" + Nom + ", niv_vie=" + niv_vie+ '}';
    }
    
}
