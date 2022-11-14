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
public class Baton extends Armes{
    private int age;
    public Baton(String n, int i, int a){
        super(n,i);
        if(a>0){
            age=a;
        } else if(a>100){
            age=100;
        }else{
            age = 0;
        }
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Baton{Nom=" + Nom + ", niv_attaque=" + getNiv_attaque()+ ", age=" + age + '}';
    }
    
}
