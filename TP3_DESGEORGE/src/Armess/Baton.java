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
public class Baton extends Armes{//Epee est une sous classe de Armes
    private int age;
    public Baton(String n, int i, int a){
        super(n,i);//Prends les caractéristique de Armes
        if(a>0){//On regarde que le baton a un age superieur de 0
            age=a;
        } else if(a>100){//On regarde que le baton a un age inferieur à 0
            age=100;
        }else{
            age = 0;
        }
    }

    public void setAge(int age) {// Permet de lire age
        this.age = age;
    }

    public int getAge() {//Permet de retourner age
        return age;
    }

    @Override
    public String toString() {
        return "Baton{Nom=" + Nom + ", niv_attaque=" + getNiv_attaque()+ ", age=" + age + '}';//Ce qu'on lit lorsqu'on println un baton
    }
    
}
