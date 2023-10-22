/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package circular;

/**
 *
 * @author USER
 */
public class HoyoCircular {
    private double radio; 

    public HoyoCircular(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }
    
    public boolean cabe(Cilindro c){
        boolean v=(this.getRadio()>= c.getRadio());
        return v;     
    }
}
