/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_convertisseurobjet_desgeorge;

import java.util.Scanner;

/**
 *
 * @author rom
 */
public class TP2_convertisseurObjet_Desgeorge {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Convertisseur Temperature = new Convertisseur(); 
        Convertisseur Temperature2 = new Convertisseur(); 
        double temp=0.0;
        System.out.println("Si vous êtes en celcisus tapez 1, \n Si vous êtes en Kelvin tapez 2, \n Si vous êtes en Farenheit tapez 3");
        Scanner sc = new Scanner(System.in);
        int convers_depart = sc.nextInt();
        if (convers_depart==1){
            System.out.println("Si vous voulez convertir en Kelvin tapez 1, \n Si vous voulez convertir en Farenheit tapez 2");
            int convers_arrive =sc.nextInt();
            if (convers_arrive==1){
                Temperature.CelciusVersKelvin(temp);
            }
            else{
               Temperature.CelciusVersFarenheit(temp); 
            }
        }
        
        if (convers_depart==2){
            System.out.println("Si vous voulez convertir en Celcius tapez 1, \n Si vous voulez convertir en Farenheit tapez 2");
            int convers_arrive =sc.nextInt();
            if (convers_arrive==1){
                Temperature.KelvinVersCelcius(temp);
            }
            else{
               Temperature.KelvinVersFarenheit(temp); 
            }
        }
        
        if (convers_depart==3){
            System.out.println("Si vous voulez convertir en Celcius tapez 1, \n Si vous voulez convertir en Kelvin tapez 2");
            int convers_arrive =sc.nextInt();
            if (convers_arrive==1){
                Temperature.FarenheitVersCelcius(temp);
            }
            else{
               Temperature.FarenheitVersKelvin(temp); 
            }
        }
        
        System.out.println(Temperature);

        
        
        // TODO code application logic here
    }
    
}
