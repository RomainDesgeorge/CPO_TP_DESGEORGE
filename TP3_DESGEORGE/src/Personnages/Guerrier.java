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
public class Guerrier extends Personnage{
    boolean cheval;
    public Guerrier(String n, int i, boolean cheval2){
        super(n,i);
        cheval = cheval2;
    }

    public void setCheval(boolean cheval) {
        this.cheval = cheval;
    }

        public void Armepredilection(){
        int a=0;
        for (int i=0; i<Tab_armes.size(); i++){
            if (Tab_armes.get(i) instanceof Epee){
                a += 1;
            }
    }
        System.out.println("Le guerrier a "+a+" arme(s) de prédilection(s)");
        
    }
    public String isCheval() {
        String a;
        if (cheval==true){
            a = "Confirmé";
            
        }else{
            a = "novice";
        }
            
        return a;
    }

    @Override
    public String toString() {
        return "Guerrier{" + "Nom=" + Nom + ", niv_vie=" + getNiv_vie() + ", confirme=" + isCheval() + "et a comme arme en main: "+arme_en_main+"}";
    }
    
}
