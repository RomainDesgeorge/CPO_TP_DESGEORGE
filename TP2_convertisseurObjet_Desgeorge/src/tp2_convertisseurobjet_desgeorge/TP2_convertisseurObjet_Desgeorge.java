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
        int convers_depart = sc.nextInt();//Demander de quelle unité on part
        if (convers_depart==1){//Savoir si on part de Celcius
            System.out.println("Si vous voulez convertir en Kelvin tapez 1, \n Si vous voulez convertir en Farenheit tapez 2");
            int convers_arrive =sc.nextInt();//Demander dans quelle unité on veut convertir
            if (convers_arrive==1){//Savoir si veut convertir en Kelvin
                Temperature.CelciusVersKelvin(temp);
            }
            else{//Savoir si veut convertir en Farenheit
               Temperature.CelciusVersFarenheit(temp); 
            }
        }
        
        if (convers_depart==2){//Savoir si on part de Kelvin
            System.out.println("Si vous voulez convertir en Celcius tapez 1, \n Si vous voulez convertir en Farenheit tapez 2");
            int convers_arrive =sc.nextInt();//Demander dans quelle unité on veut convertir
            if (convers_arrive==1){//Savoir si veut convertir en Celcius
                Temperature.KelvinVersCelcius(temp);
            }
            else{//Savoir si veut convertir en Farenheit
               Temperature.KelvinVersFarenheit(temp); 
            }
        }
        
        if (convers_depart==3){//Savoir si on part de Farenheit
            System.out.println("Si vous voulez convertir en Celcius tapez 1, \n Si vous voulez convertir en Kelvin tapez 2");
            int convers_arrive =sc.nextInt();//Demander dans quelle unité on veut convertir
            if (convers_arrive==1){//Savoir si veut convertir en Celcius
                Temperature.FarenheitVersCelcius(temp);
            }
            else{//Savoir si veut convertir en Kelvin
               Temperature.FarenheitVersKelvin(temp); 
            }
        }
        
        System.out.println(Temperature);

        
        
        // TODO code application logic here
    }
    
}
