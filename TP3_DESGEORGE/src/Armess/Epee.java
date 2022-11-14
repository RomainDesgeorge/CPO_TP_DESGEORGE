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
public class Epee extends Armes{
    int finesse;
    public Epee(String n, int i, int a){
        super(n,i);
        if(a>0){
            finesse=a;
        } else if(a>100){
            finesse=100;
        } else{
            finesse = 0;
        }
    }    

    public int getFinesse() {
        return finesse;
    }

    public void setFinesse(int finesse) {
        this.finesse = finesse;
    }

    @Override
    public String toString() {
        return "Epee{Nom=" + Nom + ", niv_attaque=" + getNiv_attaque() + ", finesse=" + finesse + '}';
    }
    
}
