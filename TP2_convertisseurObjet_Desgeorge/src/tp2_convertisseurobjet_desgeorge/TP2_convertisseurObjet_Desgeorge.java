/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_convertisseurobjet_desgeorge;

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
        double temp=1.0;
        Temperature.FarenheitVersKelvin(temp);
        Temperature2.CelciusVersFarenheit(temp);
        
        
        // TODO code application logic here
    }
    
}
