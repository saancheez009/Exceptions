package ejercicio3;

public class Fecha {
	
	
	private int dia;
	
	private int mes;
	private int año;

	public Fecha() {
		super();
	}


	public Fecha(int dia, int mes, int año) throws NegativeDayException, NegativeMonthException, NegativeYearException {
		super();
		if (dia < 0) {
			throw new NegativeDayException();
		} else {
			this.dia = dia;
		}
		if (mes < 0) {
			throw new NegativeMonthException();
		} else {
			this.mes = mes;
		}
		if (año < 0) {
			throw new NegativeYearException();
		} else {
			this.año = año;
		}
	}

	
	public int getDia() {
		return dia;
	}

	
	public void setDia(int dia) throws NegativeDayException {
		if (dia < 0) {
			throw new NegativeDayException();
		} else {
			this.dia = dia;
		}
	}

	
	public int getMes() {
		return mes;
	}

	/
	public void setMes(int mes) throws NegativeMonthException {
		if (mes < 0) {
			throw new NegativeMonthException();
		} else {
			this.mes = mes;
		}
	}

	public int getAño() {
		return año;
	}


	public void setAño(int año) throws NegativeYearException {
		if (año < 0) {
			throw new NegativeYearException();
		} else {
			this.año = año;
		}
	}


	private boolean esBisiesto() {
		boolean result = false;// Se guardará el resultado
		
		if ((año % 4 == 0) && ((año % 100 != 0) || (año % 400 == 0))) {
		result = true;
		}
	
		return result;
	}

	
	public boolean fechaCorrecta() {
		boolean result = false;
		
		switch (mes) {
	
		case 1, 3, 5, 7, 8, 10, 12:
			
			if (dia > 0 && dia < 32) {
				
				result = true;
			}
			break;
		
		case 2:
			
			if (esBisiesto()) {
				
				if (dia > 0 && dia < 30) {
					
					result = true;
				}
			
			} else if (dia > 0 && dia < 29) {
				
				result = true;
			}
			break;
	
		case 4, 6, 9, 11:
			
			if (dia > 0 && dia < 31) {
			
				result = true;
			}
			break;
		}
		
		return result;
	}

	
	public void diaSiguiente() {
		
		dia++;
		
		fechaCorrecta();
		
		switch (mes) {
		
		case 1, 3, 5, 7, 8, 10, 12:
			
			if (dia == 32) {
				
				dia = 1;
				
				mes++;
				
				if (mes == 13) {
					
					año++;
					
					mes = 1;
				}
			}
		
		case 2:
			
			if (esBisiesto()) {
			
				if (dia == 30) {
				
					dia = 1;
					
					mes++;
				}
				
			} else if (dia == 29) {
				
				dia = 1;
				
				mes++;
			}
		
		case 4, 6, 9, 11:
			
			if (dia == 31) {
				
				dia = 1;
				
				mes++;
			}
		}
	}


	public String toString() {
		String result = "";
		if (dia < 10) {
			result = "0" + dia + "-" + mes + "-" + año;
		}

		if (mes < 10) {
			result = dia + "-" + "0" + mes + "-" + año;
		}

		if (dia < 10 && mes < 10) {
			result = "0" + dia + "-" + "0" + mes + "-" + año;
		}

		if (dia > 9 && mes > 9) {
			result = dia + "-" + mes + "-" + año;
		}

		return result;
	}

}