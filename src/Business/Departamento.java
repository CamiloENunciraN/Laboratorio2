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
    private ArrayList<Profesor> listaProfesor;

    public Departamento(String nombre, String codigo, String ubicacion) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.ubicacion = ubicacion;
        this.listaProfesor=new ArrayList<Profesor>();
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
               
                d=new Programa(codigo, nombre, this.buscarProfesor(director)); 
                this.listaPrograma.add(d);
                c="Departamento Registrado";
           }
           

       }
      
        return c;
    }
    
    public String registrarProfesor(String codigo, String nombre, String titulo) {
       String c="El profesor ya existe";
       Profesor d=this.buscarProfesor(codigo);
       if(d==null){
           d=new Profesor(codigo, nombre, titulo); 
           this.listaProfesor.add(d);
           c="Profesor Registrado";
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
    
    
    private Profesor buscarProfesor(String codigo) {
       Profesor d=null;
       for(int i=0;i<this.listaProfesor.size();i++){
            d=this.listaProfesor.get(i);
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
