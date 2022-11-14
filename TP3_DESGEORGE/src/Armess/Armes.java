/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Armess;

/**
 *
 * @author rom
 */
public class Armes {
    public Armes(String unNom, int att){
        Nom = unNom;//prendre en donnée unNom et le transformer en Nom
        niv_attaque = att;//introduire à la variable nbVoiture 0
       
    }
    String Nom;
    private int niv_attaque ;   
    
    public int getNiv_attaque() {
        return niv_attaque;
    }
    
    public void setNiv_attaque(int niv_attaque) {
        if (niv_attaque>0 && niv_attaque<100){
        this.niv_attaque = niv_attaque;
        }
    }

    @Override
    public String toString() {
        return "Armes{" + "Nom=" + Nom + ", niv_attaque=" + niv_attaque+ '}';
    }


    
    
}
