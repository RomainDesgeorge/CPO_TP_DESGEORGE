/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_manip_desgeorge;

/**
 *
 * @author rom
 */
public class TP2_manip_DESGEORGE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Tartiflette assiette1 = new Tartiflette(500) ;
        Tartiflette assiette2 = new Tartiflette(600) ;
        Tartiflette assiette3 = assiette2 ;//assiette 2 et assiette 3 referencent la même tartiflette
        assiette2 = assiette1 ;
        assiette1 = assiette3 ;
        System.out.println("nb de calories de Assiette 2 : " + assiette2.nbCalories) ;
        System.out.println("nb de calories de Assiette 3 : " + assiette3.nbCalories) ;
        
        //Moussaka assiette666 = assiette1 ;
        //Moussaka assiette667 = new Tartiflette() ; Les deux lignes sont impossibles donc une référence objet qui annonce référencer un type d’objet ne peut pas en référencer un autre qui n’a aucun rapport 
        
        Moussaka assiette10 = new Moussaka(400) ;
        Moussaka assiette11 = new Moussaka(500) ;
        Moussaka assiette12 = new Moussaka(600) ;
        Moussaka assiette13 = new Moussaka(700) ;
        Moussaka assiette14 = new Moussaka(800) ;
        Moussaka assiette15 = new Moussaka(900) ;
        Moussaka assiette16 = new Moussaka(1000) ;
        Moussaka assiette17 = new Moussaka(1100) ;
        Moussaka assiette18 = new Moussaka(1300) ;
        Moussaka assiette19 = new Moussaka(1500) ;
        
        int [] Tab = new int [10];
        Tab[0] = assiette10.nbCalories;
        Tab[1] = assiette11.nbCalories;
        Tab[2] = assiette12.nbCalories;
        Tab[3] = assiette13.nbCalories;
        Tab[4] = assiette14.nbCalories;
        Tab[5] = assiette15.nbCalories;
        Tab[6] = assiette16.nbCalories;
        Tab[7] = assiette17.nbCalories;
        Tab[8] = assiette18.nbCalories;
        Tab[9] = assiette19.nbCalories;

        
        //Question 7: On pourrait avoir un objet, et qu’une référence vers cet objet soit en fait un attribut d’un autre objet
        //Donc c'est finalement une façon de modéliser une relation entre deux objets.
        

// TODO code application logic here
    }
    
}
