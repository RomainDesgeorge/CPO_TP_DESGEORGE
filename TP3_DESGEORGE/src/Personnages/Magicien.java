/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personnages;

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
        return "Magicien{" + "Nom=" + Nom + ", niv_vie=" + getNiv_vie() + ", confirme=" + isConfirme() + '}';
    }
    
}
