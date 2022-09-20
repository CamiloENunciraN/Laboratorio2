/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Business;

import java.util.ArrayList;

/**
 *
 * @author Camilo
 */
public class Universidad {
    
private ArrayList<Departamento> listaDepartamento;



    public Universidad() {
        this.listaDepartamento=new ArrayList<Departamento>();

    }

    public String registrarDepartamento(String codigo, String nombre, String ubicacion) {
       String c="El departamento ya existe";
       Departamento d=this.buscarDepartamento(codigo);
       if(d==null){
           d=new Departamento(codigo, nombre,ubicacion); 
           this.listaDepartamento.add(d);
           c="Departamento Registrado";
       }
      
        return c;
    }
    
    private Departamento buscarDepartamento(String codigo) {
       Departamento d=null;
       for(int i=0;i<this.listaDepartamento.size();i++){
            d=this.listaDepartamento.get(i);
           if(codigo.equals(codigo)){
               break;
           }
       }
       return d;
    }


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }




}
