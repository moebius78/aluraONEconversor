package conversorMoneda;


import javax.swing.JOptionPane;


public class funcion {

	
	ConvertirPesosAMonedas monedas = new ConvertirPesosAMonedas();
	ConvertirMonedasAPesos pesos = new ConvertirMonedasAPesos();
	
    public void ConvertirPesosAMonedas(double Minput) {
    	String opcion = (JOptionPane.showInputDialog(null, 
    			"Elije la moneda a la que deseas convertir tu dinero ", "Monedas", 
    			JOptionPane.PLAIN_MESSAGE, null, new Object[] 
    			{"De Pesos a Dólar Estadounidense", "De Pesos a Euro", "De Pesos a Libra Esterlina","De Pesos a Yen","De Pesos a Won Coreano","De Dólar Estadounidense a Pesos", "De Euro a Pesos", "De Libra Esterlina a Pesos","De Yen a Pesos","De Won Coreano a Pesos"}, 
    			"Seleccion")).toString();
        switch(opcion) {
        case "De Pesos a Dólar Estadounidense":
        	monedas.ConvertirPesosADolares(Minput);
        	break;
        case "De Pesos a Euro":
        	monedas.ConvertirPesosAEuros(Minput);
        	break;
        case "De Pesos a Libra Esterlina":
        	monedas.ConvertirPesosALibras(Minput);
        	break;
        case "De Pesos a Yen":
        	monedas.ConvertirPesosAYen(Minput);
        	break;
        case "De Pesos a Won Coreano":
        	monedas.ConvertirPesosAWon(Minput);
        	break;    	    	                          
        case "De Dólar a Pesos":
        	pesos.ConvertirDolaresAPesos(Minput);
        	break;
        case "De Euro a Pesos":
        	pesos.ConvertirEurosAPesos(Minput);
        	break;
        case "De Libras a Pesos":
        	pesos.ConvertirLibrasAPesos(Minput);
        	break;
        case "De Yen a Pesos":
        	pesos.ConvertirYenAPesos(Minput);
        	break;
        case "De Won Coreano a Pesos":
            pesos.ConvertirWonAPesos(Minput);
            break;
        }      
    }
}
