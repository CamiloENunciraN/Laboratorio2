/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business;

/**
 *
 * @author estudiante
 */
public class Ocacional extends Docente{

    public Ocacional(String codigo, String nombre, String titulo, double salarioBasico) {
        super(codigo, nombre, titulo, salarioBasico);
    }

    
    

private double calcularValorSalario(){
return this.getSalarioBasico();
}





}
