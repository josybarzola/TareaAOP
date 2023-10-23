package modelo;

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
