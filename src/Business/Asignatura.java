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
public class Asignatura {
    private String codigo;
    private String nombre;
    private int credito;
    private ArrayList<Grupo> listaGrupo;

    public Asignatura(String codigo, String nombre, int credito) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.credito = credito;
        this.listaGrupo=new ArrayList<Grupo>();
    }

       public String registrarGrupo(String id, int capacidad) {
       String c="El grupo ya existe";
       Grupo d=this.buscarGrupo(id);
       if(d==null){
           d=new Grupo(id, capacidad); 
           this.listaGrupo.add(d);
           c="Grupo Registrado";
       }
      
        return c;
    }
    
    private Grupo buscarGrupo(String id) {
      Grupo d=null;
       for(int i=0;i<this.listaGrupo.size();i++){
            d=this.listaGrupo.get(i);
           if(id.equals(d.getId())){
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

    public int getCredito() {
        return credito;
    }

    public void setCredito(int credito) {
        this.credito = credito;
    }
    
    
    
}
