/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personnages;

import Armess.Epee;

/**
 *
 * @author rom
 */
public class Guerrier extends Personnage{//Guerrier est une sous classe de Personnage
    boolean cheval;
    public Guerrier(String n, int i, boolean cheval2){
        super(n,i);//Prends les caractéristique de Personnages
        cheval = cheval2;
    }

    public void setCheval(boolean cheval) {//Permet de lire cheval
        this.cheval = cheval;
    }

        public void Armepredilection(){//Permet de savoir le nombre d'epees qu'a le magicien
        int a=0;//Le nombre d'épée
        for (int i=0; i<Tab_armes.size(); i++){
            if (Tab_armes.get(i) instanceof Epee){//Regarde si l'arme dans le tableau est une épée
                a += 1;
            }
    }
        System.out.println("Le guerrier a "+a+" arme(s) de prédilection(s)");
        
    }
    public String isCheval() {//Permet de lire cheval alors qu'il s'agit d'un booleen
        String a;
        if (cheval==true){//On transforme la variable true en "A cheval"
            a = "A cheval";
            
        }else{//On transforme la variable false en "A pied"
            a = "A pied";
        }
            
        return a;
    }

    @Override
    public String toString() {
        return "Guerrier{" + "Nom=" + Nom + ", niv_vie=" + getNiv_vie() + ", confirme=" + isCheval() + "et a comme arme en main: "+arme_en_main+"}";//Permet de println la sous classe guerrier
    }
    
}
