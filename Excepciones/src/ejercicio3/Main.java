package ejercicio3;

public class Main {

	public static void main(String[] args) {
		
		try {
			
			Fecha fecha= new Fecha ();
			fecha.setAño(2004);
			fecha.setMes(-4);
			fecha.setDia(2);
		
		}catch(NegativeYearException e ) {
			System.out.println(e.getMessage());

		}catch (NegativeMonthException e) {
			System.out.println(e.getMessage());
			
		}catch (NegativeDayException e) {
			System.out.println(e.getMessage());
		}

	}

}