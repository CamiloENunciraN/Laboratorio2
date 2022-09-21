/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business;

/**
 *
 * @author Camilo
 */
class Docente {
    private String codigo;
    private String nombre;
    private String titulo;
    private double salarioBasico;

    public Docente(String codigo, String nombre, String titulo, double salarioBasico) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.titulo = titulo;
        this.salarioBasico = salarioBasico;
    }


    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public double getSalarioBasico() {
        return salarioBasico;
    }

    public void setSalarioBasico(double salarioBasico) {
        this.salarioBasico = salarioBasico;
    }
    
    
    
    
    
    
}
