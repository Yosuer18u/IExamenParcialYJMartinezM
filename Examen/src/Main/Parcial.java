package Main;

import java.util.Scanner;

public class Parcial {

	public static void main(String[]args) {
		
		try (Scanner Date = new Scanner(System.in)) {
			boolean Fin = false;
			
			while(!Fin) {
				
			System.out.println("Hola Buenos dias:");
			System.out.println("Selecciones la operacion a realizar");
			System.out.println("1-convertir de byts a kilobyts");
			System.out.println("2-Convertir Kilobytes a Megabytes");
			System.out.println("3-Salir");
			
			int Opc =Date.nextInt();
			
			switch (Opc) {
			
			case 1 :
				
				System.out.println("Ingrese los bytes a convertir a Kilobyts");
				double Conver =Date.nextDouble();
				System.out.println("Los Kilobyts convertidos de byts son: " +(Conver/1000));
				System.out.println("-------------------------------------");
				
				break;
			case 2 :
				
				
				System.out.println("Ingrese los Kilobyts a convertir a Megabyts");
				Conver =Date.nextDouble();
				System.out.println("Los Kilobyts convertidos de byts son: " +(Conver/1000));
				System.out.println("-------------------------------------");
				break;
			
			case 3:
				
				Fin=true;
				
				break;
				
			default:
				System.out.println("La opcio no se encuentra disponible ");
				System.out.println("-------------------------------------");
			}
			
			System.out.println("Nos vemos!");
 }
		}
 }
	
}