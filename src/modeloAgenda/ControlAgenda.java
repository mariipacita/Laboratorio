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
        this.tarea = new tareas[1000];
        this.cant = 0;
    }

 public void addTarea(){
     String descripcion = vista.tenerDescripcion();
     if (!descripcion.isEmpty()){
         tareas trabajo = new tareas(descripcion,false);
                 tarea[cant]= trabajo;
                 cant ++;
             actualizarLista();     
     }
 }
    
   public void tareaCompleta(){
       int listaposicion = vista.listaSeleccion();
       if(listaposicion >=0)
           tarea[listaposicion].setCompletado(true);
        actualizarLista();
   }
   public void eliminarTarea(){
       int pos = vista.listaSeleccion();
       if(pos>=0){
           if(tarea[pos].isCompletado()== false){
               javax.swing.JOptionPane.showConfirmDialog(null, "Tarea sigue pendiente Desea eliminar?",
                       "confirmar", javax.swing.JOptionPane.YES_NO_OPTION);
               
                       
           }
       }
       
       for(int i = pos; i < cant -1; i++){
           tarea[i] = tarea[i + 1];
       }
       cant--;
       actualizarLista();
   }
   
   public void actualizarLista(){
       javax.swing.DefaultListModel listaM = new javax.swing.DefaultListModel();
       for(int i = 0; i <cant;i++){
           if(tarea[i].isCompletado()){
               listaM.addElement( tarea[i].getDescripcion()+ " (completado)");
           }else{
           listaM.addElement( tarea[i].getDescripcion()+ " (Pendiente)");
       }
       }
       vista.cambiarLista(listaM);
   }
   
   
   
   
   
   
   
   
}
