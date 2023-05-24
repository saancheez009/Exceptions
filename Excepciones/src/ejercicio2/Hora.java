package ejercicio2;

public class Hora {
	
	private int hora;
	
	private int minuto;
	
	private int segundo;

	
	public Hora() {
		super();

	}

	public Hora(int hora, int minuto, int segundo)
			throws NegativeHourException, NegativeMinuteException, NegativeSecondException {
		super();
		if (hora < 0) {
			throw new NegativeHourException();
		} else {
			this.hora = hora;
		}
		if (minuto < 0) {
			throw new NegativeMinuteException();
		} else {
			this.minuto = minuto;
		}
		if (segundo < 0) {
			throw new NegativeSecondException();
		} else {
			this.segundo = segundo;
		}
	}

	
	public int getHora() {
		return hora;
	}

	
	public int getMinuto() {
		return minuto;
	}

	public int getSegundo() {
		return segundo;
	}

	
	public void setHora(int hora) throws NegativeHourException {
		if (hora < 0) {
			throw new NegativeHourException();
		} else {
			this.hora = hora;
		}
	}

	public void setMinuto(int minuto) throws NegativeMinuteException {
		if (minuto < 0) {
			throw new NegativeMinuteException();
		} else {
			this.minuto = minuto;
		}
	}

	public void setSegundo(int segundo) throws NegativeSecondException {
		if (segundo < 0) {
			throw new NegativeSecondException();
		} else {
			this.segundo = segundo;
		}
	}


	public void incrementaSeg() {

		segundo++;

		if (segundo == 60) {
		
			segundo = 0;
		
			minuto++;
		}
		if (minuto == 60) {
		
			minuto = 0;
		
			hora++;
		}
		
		if (hora == 24) {
			
			hora = 0;
		}

	}
}
