/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_15_formulas_temp;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class EVA1_15_FORMULAS_TEMP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner zeyan = new Scanner(System.in);
        
        System.out.println("Escribe una temperatura en Celsius");
        double celsius = zeyan.nextDouble();
        System.out.println("Escribe una temperatura en Fahrenheit");
        double fahrenheit = zeyan.nextDouble();
        System.out.println("Escribe una temperatura en Kelvin");
        double kelvin = zeyan.nextDouble();
        
        System.out.println("Celsius: "+celsius+"°C");
        System.out.println("Celsius - Fahrenheit: "+FormulasTemp.celsiusFahrenheit(celsius));
        System.out.println("Celsius - Kelvin: "+FormulasTemp.celsiusKelvin(celsius));
        System.out.println("Fahrenheit: "+fahrenheit+"°F");
        System.out.println("Fahrenheit - Celsius: "+FormulasTemp.fahrenheitCelsius(fahrenheit));
        System.out.println("Fahrenheit - Kelvin: "+FormulasTemp.fahrenheitKelvin(fahrenheit));
        System.out.println("Kelvin: "+kelvin+"°K");
        System.out.println("Kelvin - Celsius: "+FormulasTemp.kelvinCelsius(kelvin));
        System.out.println("Kelvin - Fahrenheit: "+FormulasTemp.kelvinFahrenheit(kelvin));
        
        
        zeyan.close();
    }
    
}
class FormulasTemp{
  
    public static double celsiusFahrenheit(double celsius){
        double fahrenheit=1.8*celsius+32;
        return fahrenheit;
    }
    public static double celsiusKelvin(double celsius){
        double kelvin = celsius+273.0;
        return kelvin;
    }
    public static double fahrenheitCelsius(double fahrenheit){
        double celsius = 5.0/9.0*(fahrenheit-32.0);
        return celsius;
    }
    public static double fahrenheitKelvin(double fahrenheit){
       double kelvin = 5.0/9.0*(fahrenheit-32.0)+273.0;
       return kelvin;
    }
    public static double kelvinCelsius(double kelvin){
        double celsius =  kelvin-273.0;
        return celsius;
    }
    public static double kelvinFahrenheit(double kelvin){
        double fahrenheit =  (kelvin-273.0)*1.8+32.0;
        return fahrenheit;
    }
}