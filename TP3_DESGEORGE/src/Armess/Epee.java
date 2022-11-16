/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Armess;

import Armess.Armes;

/**
 *
 * @author rom
 */
public class Epee extends Armes{//Epee est une sous classe de Armes
    int finesse;
    public Epee(String n, int i, int a){
        super(n,i);//Prends les caractéristique de Armes
        if(a>0){//On vérifie que la finesse est comprise entre 0 et 100
            finesse=a;
        } else if(a>100){
            finesse=100;
        } else{
            finesse = 0;
        }
    }    

    public int getFinesse() {// Permet de retourner finesse
        return finesse;
    }

    public void setFinesse(int finesse) {//Permet de lire finesse
        this.finesse = finesse;
    }

    @Override
    public String toString() {
        return "Epee{Nom=" + Nom + ", niv_attaque=" + getNiv_attaque() + ", finesse=" + finesse + '}';//Ce qu'on lit lorsqu'on println une epee
    }
    
}
