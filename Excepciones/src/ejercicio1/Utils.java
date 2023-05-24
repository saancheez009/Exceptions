package ejercicio1;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Utils {
	
		static public double readDouble (Scanner sc) {
			
			double num =0.0;
			try {
				System.out.println("Introduzca un numero de tipo double");
				num= sc.nextDouble();
		
			}catch (InputMismatchException e) {
				System.err.println("El valor introducido no es de tipo double");
			} 
			sc.nextLine();
			return  num;
		}
		
		
		static public int readInt (Scanner sc) {
			int num=0;
			try {
				System.out.println("Introduzca un numero de tipo int");
				num=sc.nextInt();
			
			}catch (InputMismatchException e) {
				System.err.println("El valor introducido no es de tipo int");
			}
			sc.nextLine();
			return num;
		}
		
	
}
