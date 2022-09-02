package conversorTemperatura;


import javax.swing.JOptionPane;

public class ConvertirTemperatura {

	public double ConvertirCelsiusAFahrenheit(double valor) {
		double fahrenheit = valor * 1.8 + 32;
    	fahrenheit = (double) Math.round(fahrenheit *100d)/100;
        JOptionPane.showMessageDialog(null, +valor+ " Grados Celsius son " +fahrenheit+ " Grados Fahrenheit ");
		return fahrenheit;
	}
	
	public void ConvertirCelsiusAKelvin(double valor){
		double kelvin = valor + 273.15;
        kelvin = (double) Math.round(kelvin *100d)/100;
        JOptionPane.showMessageDialog(null, +valor+ " Grados Celsius son " +kelvin+ " Kelvin");
	}
	
	public void ConvertirFahrenheitACelsius(double valor) {
		double celsius = (valor - 32) / 1.8;
        celsius = (double) Math.round(celsius *100d)/100;
        JOptionPane.showMessageDialog(null, +valor+ " Grados Fahrenheit son " +celsius+ " Celsius");
	}
	
	public double ConvertirKelvinACelsius(double valor) {
		 double kelvinCelsius = valor - 273.15;
         kelvinCelsius = (double) Math.round(kelvinCelsius *100d)/100;
         JOptionPane.showMessageDialog(null, +valor+ " Kelvin son " +kelvinCelsius+ " Celsius");
         return kelvinCelsius;
	}
	
	public void ConvertirKelvinAFahrenheit(double valor) {
		double kelvinFahrenheit = ConvertirKelvinACelsius(valor);
		kelvinFahrenheit = ConvertirCelsiusAFahrenheit(kelvinFahrenheit);
		kelvinFahrenheit	= (double) Math.round(kelvinFahrenheit *100d)/100;
        JOptionPane.showMessageDialog(null, +valor+ " Kelvin son " +kelvinFahrenheit+ " Celcius");
	}
	
}
