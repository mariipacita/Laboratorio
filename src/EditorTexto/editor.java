/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EditorTexto;

/**
 *
 * @author marii
 */
public class editor {
    private String nombre;
    private String ruta;
    private String contenido;
    private boolean negrita;
    private boolean cursiva;
    private boolean abrir;
    private boolean guardar;
    private boolean salir;
    private boolean copiar;
    private boolean cortar;
    private boolean pegar;

    public String getNombre() {
        return nombre;
    }

    public String getRuta() {
        return ruta;
    }

    public String getContenido() {
        return contenido;
    }

    public boolean isNegrita() {
        return negrita;
    }

    public boolean isGuardar() {
        return guardar;
    }

    public boolean isCursiva() {
        return cursiva;
    }
    

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setRuta(String ruta) {
        this.ruta = ruta;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public void setNegrita(boolean negrita) {
        this.negrita = negrita;
    }

    public void setCursiva(boolean cursiva) {
        this.cursiva = cursiva;
    }

    public void setGuardar(boolean guardar) {
        this.guardar = guardar;
    }
    
    
    
    
}
