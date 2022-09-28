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
public class Grupo {
    private String id;
    private int capacidad;
    private String codigoDocente;
    private ArrayList<Horario> listaHorario;
    private ArrayList<String> listaEstudiante;
    
    public Grupo(String id, int capacidad) {
        this.id = id;
        this.capacidad = capacidad;
        this.listaHorario=new ArrayList<Horario>();
        this.listaEstudiante=new ArrayList<String>();
    }

    
       public String registrarHorario(String hora_ini, String hora_fin, String salon) {
       String c="El horario ya existe";
       Horario d=this.buscarHorario(hora_ini,salon);
       if(d==null){
           d=new Horario( hora_ini, hora_fin,  salon); 
           this.listaHorario.add(d);
           c="Horario Registrado";
       }
      
        return c;
    }
    
    private Horario buscarHorario(String hora_ini, String salon) {
      Horario d=null;
       for(int i=0;i<this.listaHorario.size();i++){
            d=this.listaHorario.get(i);
           if(hora_ini.equals(d.getHora_ini())&&salon.equals(d.getSalon())){
               break;
           }
       }
        return d;
       
    }
    
    
    private String matricularEstudiante(String codigoEstudiante){
        String c="El estudiante esta matriculado";
        Boolean busqueda=false;
        for(int i=0;i<this.listaEstudiante.size();i++){
            String d=this.listaEstudiante.get(i);
           if(codigoEstudiante.equals(d)){
              busqueda=true;
           }
       }
        
        if(!busqueda){
            this.listaEstudiante.add(codigoEstudiante);
            c="El estudiante ha sido matriculado";
        }
        
        
        return c;
    }
    
    private String asignarDocente(){
     String c="Aun no alcanza el numero de estudiantes";
        if(this.listaEstudiante.size()>=5){
            
            
            
            c="Docente Asignado";
        }
     return c;
    }
    
    
    
    
    
    
    
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }
    
    
    
    
}
