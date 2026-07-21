/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modeloAgenda;

/**
 *
 * @author PC
 */
public class ControlAgenda {
private frmAgenda vista;
private tareas[] tarea;
private int cant;



    public ControlAgenda(frmAgenda vista) {
        this.vista = vista;
        this.tarea = new tareas[100];
        this.cant = 0;
    }

 public void addTarea(){
     String descripcion = vista.tenerDescripcion();
     if (!descripcion.isEmpty()){
         tareas work = new tareas(descripcion,false);
                 tarea[cant]= work;
                 cant ++;
                 
     }
 }
    
   public void tareaCompleta(){
       int listaposicion = vista.listaSeleccion();
       if(listaposicion >=0)
           tarea[listaposicion].setCompletado(true);
   }
   
   
   
   
   
   
   
   
   
   
   
}
