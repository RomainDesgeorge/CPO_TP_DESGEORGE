/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personnages;
import Armess.Armes;
import Armess.Baton;
import java.util.ArrayList;
/**
 *
 * @author rom
 */
public class Magicien extends Personnage{//Magicien est une sous classe de Personnage
    boolean confirme;
    public Magicien(String n, int i, boolean confirm2e){
        super(n,i);//Prends les caractéristique de Personnages
        confirme = confirm2e;
        
    }

    public void setConfirme(boolean confirme) {//Permet de lire confirme
        this.confirme = confirme;
    }

    
    public void Armepredilection(){//Permet de savoir le nombre de bton qu'a le magicien
        int a=0;//Nombre d'armes de predilection
        for (int i=0; i<Tab_armes.size(); i++){
            if (Tab_armes.get(i) instanceof Baton){//Regarde si l'arme dans le tableau est un baton
                a += 1;
            }
    }
        System.out.println("Le magicien a "+a+" arme(s) de prédilection(s)");
        
    }
    
    
    public String isConfirme(){//Permet de lire confirme alors qu'il s'agit d'un booleen
        String a;
        if (confirme==true){//On transforme la variable true en "Confirme"
            a = "Confirme";
            
        }else{//On transforme la variable false en "novice"
            a = "novice";
        }
            
        return a;
    }

    
    @Override
    public String toString() {
        return "Magicien{" + "Nom=" + Nom + ", niv_vie=" + getNiv_vie() + ", confirme=" + isConfirme() + " et a comme arme en main: "+arme_en_main+"}";//Permet de println les magicien
    }
    
}
