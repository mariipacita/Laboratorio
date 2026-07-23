/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modeloAgenda;

/**
 *
 * @author PC
 */
public class tareas {
    protected String descripcion;
    protected boolean completado;

    public boolean isCompletado() {
        return completado;
    } 

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setCompletado(boolean completado) {
        this.completado = completado;
    }

    public tareas(String descripcion, boolean completado) {
        this.descripcion = descripcion;
        this.completado = completado;
      
}
}
    
    