package conversorTemperatura;

import javax.swing.JOptionPane;

public class funcionTemperatura {

	
ConvertirTemperatura temperatura = new ConvertirTemperatura();
	
	public void ConvertirTemperatura(double Minput) {
    	String opcion = (JOptionPane.showInputDialog(null, "Elije una opción para convertir", "Temperatura", JOptionPane.PLAIN_MESSAGE, null, new Object[] {"Grados Celsius a Grados Fahrenheit", "Grados Celsius a Kelvin", "Grados Fahrenheit a Grados Celsius","Kelvin a Grados Celsius","Kelvin a Grados Fahrenheit"}, "Seleccion")).toString();
        switch(opcion) {
        case "Grados Celsius a Grados Fahrenheit":
        	temperatura.ConvertirCelsiusAFahrenheit(Minput);
        	break;
        case "Grados Celsius a Kelvin":
            temperatura.ConvertirCelsiusAKelvin(Minput);
            break;
        case "Grados Fahrenheit a Grados Celsius":
           temperatura.ConvertirFahrenheitACelsius(Minput);
           break;
        case "Kelvin a Grados Celsius":
           temperatura.ConvertirKelvinACelsius(Minput);
           break;
        case "Kelvin a Grados Fahrenheit":
        	temperatura.ConvertirKelvinAFahrenheit(Minput);
        	break;
        }
	}
}
