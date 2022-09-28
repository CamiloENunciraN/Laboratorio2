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
public class Programa {
    private String codigo;
    private String nombre;
    private Docente director;
    private ArrayList<Asignatura> listaAsignatura;
    private ArrayList<Estudiante> listaEstudiante;

    public Programa(String codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.listaAsignatura=new ArrayList<Asignatura>();
        this.listaEstudiante=new ArrayList<Estudiante>();
    }

    public Programa(String codigo, String nombre, Docente director) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.director = director;
    }
    
    
    public String registrarAsignatura(String codigo, String nombre, int credito) {
       String c="La asignatura ya existe";
       Asignatura d=this.buscarAsignatura(codigo);
       if(d==null){
           d=new Asignatura(codigo, nombre, credito); 
           this.listaAsignatura.add(d);
           c="Asignatura Registrada";
       }
      
        return c;
    }
    
    private Asignatura buscarAsignatura(String codigo) {
       Asignatura d=null;
       for(int i=0;i<this.listaAsignatura.size();i++){
            d=this.listaAsignatura.get(i);
           if(codigo.equals(d.getCodigo())){
               break;
           }
       }
        return d;
       
    }

    
    public String registrarEstudiante(String codigo, String nombre, String direccion, String genero, String correo) {
       String c="El estudiante ya existe";
       Estudiante d=this.buscarEstudiante(codigo);
       if(d==null){
           d=new Estudiante(codigo, nombre, direccion, genero, correo); 
           this.listaEstudiante.add(d);
           c="Estudiante Registrado";
       }
      
        return c;
    }
    
    private Estudiante buscarEstudiante(String codigo) {
       Estudiante d=null;
       for(int i=0;i<this.listaEstudiante.size();i++){
            d=this.listaEstudiante.get(i);
           if(codigo.equals(d.getCodigo())){
               break;
           }
       }
        return d;
       
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
    
    
    
    
    
}
