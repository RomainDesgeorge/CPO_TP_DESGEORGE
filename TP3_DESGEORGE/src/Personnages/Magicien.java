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
    public Magicien(String n, int i, boolean confirme){
        super(n,i);
        
    }

    public void setConfirme(boolean confirme) {
        this.confirme = confirme;
    }

    public boolean isConfirme() {
        return confirme;
    }
    
}
