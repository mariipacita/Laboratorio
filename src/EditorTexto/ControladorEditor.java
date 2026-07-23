/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EditorTexto;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JColorChooser;
import javax.swing.JOptionPane;
/**
 *
 * @author marii
 */
public class ControladorEditor {
    private editor modelo;
    private FrmEditor vista;

    public ControladorEditor(editor modelo, FrmEditor vista) {
        this.modelo = modelo;
        this.vista = vista;
    }
    public void abrir() {

        vista.getFileChooserAbrir().showOpenDialog(vista);

        if (vista.getFileChooserAbrir().getSelectedFile() != null) {

            String ruta = vista.getFileChooserAbrir()
                    .getSelectedFile()
                    .getAbsolutePath();
            String nombre = vista.getFileChooserAbrir()
                    .getSelectedFile()
                    .getName();
            modelo.setRuta(ruta);
            modelo.setNombre(nombre);
            modelo.setGuardado(true);

            vista.setTitle("Documento abierto: " + ruta);
        }
    }

    public void guardar() {
        vista.getFileChooserGuardar().showSaveDialog(vista);

        if (vista.getFileChooserGuardar().getSelectedFile() != null) {

            String ruta = vista.getFileChooserGuardar()
                    .getSelectedFile()
                    .getAbsolutePath();

            String nombre = vista.getFileChooserGuardar()
                    .getSelectedFile()
                    .getName();

            modelo.setRuta(ruta);
            modelo.setNombre(nombre);
            modelo.setContenido(vista.getTextArea().getText());
            modelo.setGuardado(true);
            vista.setTitle("Documento guardado: " + ruta);
        }
    }

    public void salir() {

        if (modelo.isGuardado() == false) {

        int opcion = JOptionPane.showConfirmDialog(vista,
          "El documento no ha sido guardado. ¿Desea salir?",
           "Confirmar salida",
           JOptionPane.YES_NO_OPTION);

        if (opcion == JOptionPane.YES_OPTION) {
           System.exit(0);
            }
        } else {
            System.exit(0);
        }
    }

    public void copiar() {
        vista.getTextArea().copy();
    }

    public void cortar() {
        vista.getTextArea().cut();
        modelo.setGuardado(false);
    }

    public void pegar() {
        vista.getTextArea().paste();
        modelo.setGuardado(false);
    }

    public void actualizarFuente() {
        int estilo = Font.PLAIN;
        modelo.setNegrita(
                vista.getMenuNegrita().isSelected());
        modelo.setCursiva(
                vista.getMenuCursiva().isSelected());
        if (modelo.isNegrita()) {
            estilo = estilo | Font.BOLD;
        }
        if (modelo.isCursiva()) {
            estilo = estilo | Font.ITALIC;
        }
        vista.getTextArea().setFont(
                vista.getTextArea().getFont().deriveFont(estilo));
    }

    public void cambiarFondo() {
        Color colorFondo = JColorChooser.showDialog(
                vista,
                "Seleccione un color de fondo",
                vista.getTextArea().getBackground());

        if (colorFondo != null) {
        vista.getTextArea().setBackground(colorFondo);
        }
    }
    public void cambiarLetra() {
        Color colorLetra = JColorChooser.showDialog(
                vista,
                "Seleccione un color de letra",
                vista.getTextArea().getForeground());
        if (colorLetra != null) {
            vista.getTextArea().setForeground(colorLetra);
        }
    }
}
