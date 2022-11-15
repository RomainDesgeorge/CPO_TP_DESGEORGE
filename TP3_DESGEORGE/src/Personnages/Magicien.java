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
public class Magicien extends Personnage{
    boolean confirme;
    public Magicien(String n, int i, boolean confirm2e){
        super(n,i);
        confirme = confirm2e;
        
    }

    public void setConfirme(boolean confirme) {
        this.confirme = confirme;
    }

    
    public void Armepredilection(){
        int a=0;
        for (int i=0; i<Tab_armes.size(); i++){
            if (Tab_armes.get(i) instanceof Baton){
                a += 1;
            }
    }
        System.out.println("Le magicien a "+a+" arme(s) de prédilection(s)");
        
    }
    
    
    public String isConfirme(){
        String a;
        if (confirme==true){
            a = "Confirmé";
            
        }else{
            a = "novice";
        }
            
        return a;
    }

    
    @Override
    public String toString() {
        return "Magicien{" + "Nom=" + Nom + ", niv_vie=" + getNiv_vie() + ", confirme=" + isConfirme() + " et a comme arme en main: "+arme_en_main+"}";
    }
    
}
