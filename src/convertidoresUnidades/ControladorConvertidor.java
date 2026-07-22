/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package convertidoresUnidades;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

/**
 *
 * @author sharys
 */
public class ControladorConvertidor implements ActionListener, ChangeListener{
     private final frmConvertidor vista;
    private final ConvertidorUnidad modelo;
     
     public ControladorConvertidor(frmConvertidor vista, ConvertidorUnidad modelo) {
        this.vista = vista;
        this.modelo = modelo;
         
          
        this.vista.getSpnValor().addChangeListener(this);
        this.vista.getCbOrigen().addActionListener(this);
        this.vista.getCbDestino().addActionListener(this);
        this.vista.getBtnIntercambiar().addActionListener(this);
        this.vista.getTxtResultado().setEditable(false);
        ejecutarCalculo();
      }
      
      @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == vista.getBtnIntercambiar()) {

            int origen = vista.getCbOrigen().getSelectedIndex();

            vista.getCbOrigen().setSelectedIndex(
                    vista.getCbDestino().getSelectedIndex());

            vista.getCbDestino().setSelectedIndex(origen);
        }

        ejecutarCalculo();
    }
    
    

    @Override
    public void stateChanged(ChangeEvent e) {
        ejecutarCalculo();
    }

    private void ejecutarCalculo() {
        try {
            double valor = Double.parseDouble(
                    vista.getSpnValor().getValue().toString());

            String origen = vista.getCbOrigen()
                    .getSelectedItem().toString();

            String destino = vista.getCbDestino()
                    .getSelectedItem().toString();

            double resultado =
                    modelo.convertir(valor, origen, destino);

            vista.getTxtResultado()
                    .setText(String.format("%.2f", resultado));
        } catch (Exception ex) {
            vista.getTxtResultado().setText("0.00");
        }
    }
}
   

