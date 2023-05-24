package ejercicio2;

public class Main {

	public static void main(String[] args) {
		
				try {
			
					Hora hora = new Hora();
				
					hora.setHora(-6);
					hora.setMinuto(59);
					hora.setSegundo(50);
					
				} catch (NegativeMinuteException e) {
				
					System.out.println(e.getMessage());
					
				} catch (NegativeSecondException e) {
					
					System.out.println(e.getMessage());
					
				} catch (NegativeHourException e) {
				
					System.out.println(e.getMessage());
				}

			}

		}
