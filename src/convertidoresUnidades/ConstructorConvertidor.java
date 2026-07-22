/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package convertidoresUnidades;

/**
 *
 * @author sharys
 */
public class ConstructorConvertidor {

    public double convertir(double valor, String origen, String destino) {

        // Si son iguales que no haga nada
        if (origen.equals(destino))
            return valor;

        // primero convertir todo a Celsius
        double celsius = 0;

        switch (origen) {
            case "Celsius":
                celsius = valor;
                break;

            case "Fahrenheit":
                celsius = (valor - 32) * 5 / 9;
                break;

            case "Kelvin":
                celsius = valor - 273.15;
                break;

            case "Rankine":
                celsius = (valor - 491.67) * 5 / 9;
                break;
        }

        // despues convertir de Celsius a destino
        switch (destino) {

            case "Celsius":
                return celsius;

            case "Fahrenheit":
                return celsius * 9 / 5 + 32;

            case "Kelvin":
                return celsius + 273.15;

            case "Rankine":
                return (celsius + 273.15) * 9 / 5;
        }

        return valor;
    }

}
