/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business;

/**
 *
 * @author estudiante
 */
public class Planta extends Docente{
 
    private int puntoSalarial;
    private int valorPunto;
    private String categoria;
    private int noResolucion;
    private String fechaNombramiento;

    public Planta(int puntoSalarial, int valorPunto, String categoria, int noResolucion, String fechaNombramiento, String codigo, String nombre, String titulo, double salarioBasico) {
        super(codigo, nombre, titulo, salarioBasico);
        this.puntoSalarial = puntoSalarial;
        this.valorPunto = valorPunto;
        this.categoria = categoria;
        this.noResolucion = noResolucion;
        this.fechaNombramiento = fechaNombramiento;
    }




private double calcularValorSalario(){

return this.getSalarioBasico()+(this.getPuntoSalarial()*this.getValorPunto());
}


    public int getPuntoSalarial() {
        return puntoSalarial;
    }

    public void setPuntoSalarial(int puntoSalarial) {
        this.puntoSalarial = puntoSalarial;
    }

    public int getValorPunto() {
        return valorPunto;
    }

    public void setValorPunto(int valorPunto) {
        this.valorPunto = valorPunto;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getNoResolucion() {
        return noResolucion;
    }

    public void setNoResolucion(int noResolucion) {
        this.noResolucion = noResolucion;
    }

    public String getFechaNombramiento() {
        return fechaNombramiento;
    }

    public void setFechaNombramiento(String fechaNombramiento) {
        this.fechaNombramiento = fechaNombramiento;
    }







}
