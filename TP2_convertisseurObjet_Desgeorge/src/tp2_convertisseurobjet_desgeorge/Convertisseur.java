/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_convertisseurobjet_desgeorge;

/**
 *
 * @author rom
 */
public class Convertisseur {
    public Convertisseur() {
        nbConversions=0;//Introduire la valeur 0 à nbConversions
    }
int nbConversions;

public double CelciusVersKelvin(double celcius){//Fonction qui convertir les Celcius en Kelvin
        
        double Kelvin = celcius + 273.15;
        nbConversions +=1;
        
        return Kelvin;
        
    }
    
    
    public double KelvinVersCelcius(double kelvin){//Fonction qui convertir les Kelvin en Celcius

        double celcius = kelvin - 273.15;
        nbConversions +=1;

        return celcius;
        
    }
    
    
    public double FarenheitVersCelcius(double farenheit){//Fonction qui convertir les Farenheit en Celcius

        double celcius = (farenheit - 32) / 1.8;
        nbConversions +=1;

        return celcius;

    }


    public double CelciusVersFarenheit(double celcius){//Fonction qui convertir les Celcius en Farenheit

        double farenheit = (celcius * 1.8) + 32;
        nbConversions +=1;

        return farenheit;
        
    }
    
    
    public double KelvinVersFarenheit(double kelvin){//Fonction qui convertir les Kelvin en Farenheit

        double farenheit = CelciusVersFarenheit(KelvinVersCelcius(kelvin));
        nbConversions +=1;

        return farenheit;
        
    }
    
    
    public double FarenheitVersKelvin(double farenheit){//Fonction qui convertir les Farenheit en Kelvin

        double kelvin = CelciusVersKelvin(FarenheitVersCelcius(farenheit));
        nbConversions +=1;

        return kelvin;
    }
    
    @Override
public String toString () {//Lire la classe
return "nb de conversions"+ nbConversions;
}
}
