/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personnages;

/**
 *
 * @author rom
 */
public class Personnage {
    public Personnage(String unNom, int att){
        Nom = unNom;//prendre en donnée unNom et le transformer en Nom
        niv_vie = att;//introduire à la variable nbVoiture 0
       
    }
    String Nom;
    private int niv_vie ;   
    
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
