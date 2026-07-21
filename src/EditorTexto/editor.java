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
    public boolean guardado;

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

    public boolean isCursiva() {
        return cursiva;
    }

    public boolean isGuardado() {
        return guardado;
    }

    public void setGuardado(boolean guardado) {
        this.guardado = guardado;
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

    public editor(String nombre, String ruta, String contenido, boolean negrita, boolean cursiva) {
        this.nombre = nombre;
        this.ruta = ruta;
        this.contenido = contenido;
        this.negrita = negrita;
        this.cursiva = cursiva;
        this.guardado= true;
    }
    
    
    
    
    
    
}
