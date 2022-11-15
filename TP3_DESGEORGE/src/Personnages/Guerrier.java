/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personnages;

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
        return "Guerrier{" + "Nom=" + Nom + ", niv_vie=" + getNiv_vie() + ", confirme=" + isCheval() + '}';
    }
    
}
