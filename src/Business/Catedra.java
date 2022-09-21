/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business;

/**
 *
 * @author estudiante
 */
public class Catedra extends Docente{

private String categoria;
private int noContratoSemestral;
private int noHorasSemanal;
private double valorHora;

    public Catedra(String categoria, int noContratoSemestral, int noHorasSemanal, double valorHora, String codigo, String nombre, String titulo, double salarioBasico) {
        super(codigo, nombre, titulo, salarioBasico);
        this.categoria = categoria;
        this.noContratoSemestral = noContratoSemestral;
        this.noHorasSemanal = noHorasSemanal;
        this.valorHora = valorHora;
    }




private double calcularValorSalario(){
double c=0;

if("Auxiliar".equals(this.getCategoria())){

    c=this.getSalarioBasico()+(this.getNoHorasSemanal()*20000);

}else if("Asistente".equals(this.getCategoria())){

    c=this.getSalarioBasico()+(this.getNoHorasSemanal()*30000);

}else if("Asociado".equals(this.getCategoria())){

    c=this.getSalarioBasico()+(this.getNoHorasSemanal()*40000);

}

return c;

}



    public int getNoContratoSemestral() {
        return noContratoSemestral;
    }

    public void setNoContratoSemestral(int noContratoSemestral) {
        this.noContratoSemestral = noContratoSemestral;
    }

    public int getNoHorasSemanal() {
        return noHorasSemanal;
    }

    public void setNoHorasSemanal(int noHorasSemanal) {
        this.noHorasSemanal = noHorasSemanal;
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }


    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }




}
