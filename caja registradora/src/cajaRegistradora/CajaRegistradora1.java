package cajaRegistradora;

import java.util.Scanner;

public class CajaRegistradora1 {

	public static void main(String[] args) {

	final int clave=1234;
	int intentos=3;
	int tuSaldo=500;
	
	Scanner scanner = new Scanner(System.in);
     
     while (intentos > 0) {
         System.out.print("Ingresa la contraseña: ");
         int intento = scanner.nextInt();
         
         if (intento == clave) {
             System.out.println("¡Contraseña correcta! Bienvenido. Tu saldo es de "+tuSaldo+"$ ,¿que deseas hacer?");
             System.out.println("1 = Ingresar dinero");
             System.out.println("2 = retirar dinero");
             break; 
         } else {
             intentos--;
             System.out.println("Contraseña incorrecta. Te quedan " + intentos + " intentos.");
         }
     }
     
     if (intentos == 0) {
         System.out.println("Se han agotado los intentos. Acceso denegado.");
     }}
	
     
     
     
	
	
	
	
	
	
	
	
	
	}
