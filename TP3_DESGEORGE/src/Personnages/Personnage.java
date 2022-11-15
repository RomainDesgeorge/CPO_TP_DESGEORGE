/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personnages;

import Armess.Armes;
import static java.lang.constant.ConstantDescs.NULL;
import java.util.ArrayList;

/**
 *
 * @author rom
 */
public class Personnage {
    public Personnage(String unNom, int att){
        Nom = unNom;
        niv_vie = att;
        nb_armes = 0;
        Armes arme_portee = (Armes) NULL;
        ArrayList<Armes> Tab_armes1=new ArrayList<>(5);
       
    }
    String Nom;
    private int niv_vie ;  
    int nb_armes;
    
    public int getNiv_vie() {
        return niv_vie;
    }
    
    public void setNiv_vie(int niv_vie) {
        if (niv_vie>0){
        this.niv_vie = niv_vie;
        }
    }

    @Override
    public String toString() {
        return "Armes{" + "Nom=" + Nom + ", niv_vie=" + niv_vie+ '}';
    }
    
}
