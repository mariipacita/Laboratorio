/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package convertidoresUnidades;

/**
 *
 * @author sharys
 */
public class ConvertidorUnidad {

    private ConstructorConvertidor convertidor =
            new ConstructorConvertidor();

    public double convertir(double valor,
                            String origen,
                            String destino){

        return convertidor.convertir(valor, origen, destino);

    }

}
