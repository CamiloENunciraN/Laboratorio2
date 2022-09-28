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
        this.listaDepartamento.add(new Departamento("1", "sistemas","ufps"));
        this.listaDepartamento.add(new Departamento("2", "arquitectura","ufps"));
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
           if(codigo.equals(d.getCodigo())){
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

    public String registrarDocente(String departamento , String codigo, String nombre, String titulo, Double salario, String tipo, String categoria, int contratoSemestral, int horasSemanal, Double valorHora, int puntoSalarial, int valorPunto, int resolucion, String fechaNombramiento) {
    String c = "";
        Departamento d=this.buscarDepartamento(departamento);
       c= d.registrarDocente(codigo, nombre, titulo, salario, tipo, categoria,
               contratoSemestral, horasSemanal, valorHora, puntoSalarial, valorPunto, resolucion, fechaNombramiento);
    return c;
    }

    public String listarDapartamento() {
       String c="";
        
        for(int i=0;i<this.listaDepartamento.size();i++){
            Departamento d=this.listaDepartamento.get(i);
            c+=d.getCodigo()+" "+d.getNombre()+"-";
        }
        return c;
    }




}
