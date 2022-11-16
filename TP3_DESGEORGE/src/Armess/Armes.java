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
        Nom = unNom;//On ajoute un nom à l'arme
        niv_attaque = att;//On ajoute un niveau d'attaque à l'arme
       
    }
    String Nom;
    private int niv_attaque ;   
    
    public int getNiv_attaque() {
        return niv_attaque;//Comme le niveau d'attaque est privé alors on créé une fontion publique afin de le retourner
    }
    
    public void setNiv_attaque(int niv_attaque) {
        if (niv_attaque>=0 && niv_attaque<=100){//Le niveau d'attaque est retourné seulement si il est compris entre 0 et 100
        this.niv_attaque = niv_attaque;
        }
    }

    @Override
    public String toString() {
        return "Armes{" + "Nom=" + Nom + ", niv_attaque=" + niv_attaque+ '}';//Lorsqu'on doit println Armes, on pourra lire cette ligne
    }


    
    
}
