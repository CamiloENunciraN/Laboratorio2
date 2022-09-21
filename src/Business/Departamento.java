/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business;

import java.util.ArrayList;

/**
 *
 * @author Camilo
 */
public class Departamento {
    private String nombre;
    private String codigo;
    private String ubicacion;
    private ArrayList<Programa> listaPrograma;
    private ArrayList<Docente> listaDocente;

    public Departamento(String nombre, String codigo, String ubicacion) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.ubicacion = ubicacion;
        this.listaDocente=new ArrayList<Docente>();
        this.listaPrograma=new ArrayList<Programa>();
    }

    
    public String registrarPrograma(String codigo, String nombre, String director) {
       String c="El programa ya existe";
       Programa d=this.buscarPrograma(codigo);
       if(d==null){
           
           if("Ninguno".equals(director)){
                d=new Programa(codigo, nombre); 
                this.listaPrograma.add(d);
                c="Departamento Registrado";
           }else{
               
                d=new Programa(codigo, nombre, this.buscarDocente(director)); 
                this.listaPrograma.add(d);
                c="Departamento Registrado";
           }
           

       }
      
        return c;
    }
    
    public String registrarDocente(String codigo, String nombre, String titulo, double salarioBasico) {
       String c="El docente ya existe";
       Docente d=this.buscarDocente(codigo);
       if(d==null){
           d=new Docente(codigo, nombre, titulo, salarioBasico); 
           this.listaDocente.add(d);
           c="Docente Registrado";
       }
      
        return c;
    }
    
    private Programa buscarPrograma(String codigo) {
       Programa d=null;
       for(int i=0;i<this.listaPrograma.size();i++){
            d=this.listaPrograma.get(i);
           if(codigo.equals(codigo)){
               break;
           }
       }
       return d;
    }
    
    
    private Docente buscarDocente(String codigo) {
       Docente d=null;
       for(int i=0;i<this.listaDocente.size();i++){
            d=this.listaDocente.get(i);
           if(codigo.equals(codigo)){
               break;
           }
       }
       return d;
    }
    
    
    
    
    
    
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }
    
    
    
}
