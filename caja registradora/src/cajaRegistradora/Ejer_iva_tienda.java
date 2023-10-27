package cajaRegistradora;

import java.util.Scanner;

public class Ejer_iva_tienda {
 public static void main(String[] args) {
	 Scanner scanner = new Scanner(System.in);
	 
	 System.out.print("Introduzca la base imponible: ");
	 double baseImponible = scanner.nextDouble();
	 System.out.print("Introduzca el tipo de IVA (general, reducido o superreducido): ");
	 scanner.nextLine();
	 String tipoIVA = scanner.nextLine();
	 double porcentajeIVA = 0;
	 switch (tipoIVA) {
	 
	 case "general":
	 porcentajeIVA = 0.21;
	 break;
	 
	 case "reducido":
	 porcentajeIVA = 0.10;
	 break;
	 
	 case "superreducido":
	 porcentajeIVA = 0.04;
	 break;
	 
	 default:
	 System.out.println("Tipo de IVA no válido.");
	 return;
	 
	 }
	 double iva = baseImponible * porcentajeIVA;
	 double precioConIVA = baseImponible + iva;
	 
	 System.out.print("Introduzca el código promocional (nopro, mitad, meno5 o 5porc): ");
	 String codigoPromocional = scanner.nextLine();
	 double descuento = 0;
	 
	 switch (codigoPromocional) {
	 case "nopro":
	 break;
	 
	 case "mitad":
	 descuento = precioConIVA / 2;
	 break;
	 
	 case "meno5":
	 descuento = 5.0;
	 break;
	 
	 case "5porc":
	 descuento = precioConIVA * 0.05;
	 break;
	 
	 default:
	 System.out.println("Código promocional no válido.");
	 return;
	 
	 }
	 double precioFinal = precioConIVA - descuento;
	 System.out.println("Base imponible: "+ baseImponible);
	 System.out.println("IVA (" + (porcentajeIVA * 100) + "%): " + iva);
	 System.out.println("Precio con IVA: " + precioConIVA);
	 System.out.println("Cód. promo. (" + codigoPromocional + "): -" + descuento);
	 System.out.println("TOTAL: " + precioFinal+"€");
	 	}
 }
