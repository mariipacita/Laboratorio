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
    
    public double convertir(double valor, String origen, String destino){
        if (origen.equals(destino)){
            return valor;
        }
        
        double celsius = toCelsius(valor, origen);
        return fromCelsius(celsius, destino);
        
    }
    
    private double toCelcius(double valor, String unidad) {
        switch (unidad) {
            case "Celsius":
            return valor;
            
            case "Fahrenheit;":
            return(valor - 32.0) * 5.0 / 9.0;
            
            case "Kelvin":
                return valor - 273.15;
                
           case "Rankine":
                return (valor - 491.67) * 5.0 / 9.0;
                
           default:
            System.out.println("Unidad de origen no válida: " + unidad);
        }
        
    }
    
    private double fromCelsius(double celsius, String unidad) {

        switch (unidad) {

            case "Celsius":
                return celsius;

            case "Fahrenheit":
                return (celsius * 9.0 / 5.0) + 32.0;

            case "Kelvin":
                return celsius + 273.15;

            case "Rankine":
                return (celsius + 273.15) * 9.0 / 5.0;

            default:
                System.out.println(": " + unidad);
        }
    }
    
}
