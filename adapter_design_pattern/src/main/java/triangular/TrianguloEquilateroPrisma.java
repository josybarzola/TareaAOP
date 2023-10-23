/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package triangular;

/**
 *
 * @author USER
 */
public class TrianguloEquilateroPrisma {
    private double lado; 

    public TrianguloEquilateroPrisma(double lado) {
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }
    public double getTriangulo() {
        double result;
        result = Math.pow(this.lado, 2);
        return result;
    }
}
