/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp3_desgeorge;

import Armess.Epee;
import Armess.Baton;
import java.util.Vector;

/**
 *
 * @author rom
 */
public class TP3_DESGEORGE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Epee Excalibur = new Epee("Excalibur",7,5);
        Epee Durandal = new Epee("Durandal",4,7);
        Baton Chene = new Baton("Chene",4,5);
        Baton Charme = new Baton("Charme",5,6);// TODO code application logic here
        
        Vector Tab=new Vector();
        Tab.addElement(Excalibur);
        Tab.addElement(Durandal);
        Tab.addElement(Chene);
        Tab.addElement(Charme);
        int tailleTab = Tab.size();
        for(int i=0;i<tailleTab;i++){
        System.out.println(Tab.elementAt(i));
        }
                
    }
    
}
