/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3_desgeorge;

/**
 *
 * @author rom
 */
public class Guerrier extends Personnage{
    boolean cheval;
    public Guerrier(String n, int i, boolean cheval){
        super(n,i);
    }

    public void setCheval(boolean cheval) {
        this.cheval = cheval;
    }

    public boolean isCheval() {
        return cheval;
    }
    
}
