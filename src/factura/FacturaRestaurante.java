package factura;
import java.util.Scanner;

public class FacturaRestaurante {
		

		    public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);
		        
		        // Solicitar el nombre del cliente
		        System.out.print("Ingrese su nombre: ");
		        String nombreCliente = scanner.nextLine();
		        
		        // Solicitar el monto de la compra
		        System.out.print("Ingrese el monto de la compra: ");
		        double montoCompra = scanner.nextDouble();
		        
		        double descuento = 0.0;
		        double valorDescuento = 0.0;
		        
		        // Determinar el porcentaje de descuento según el monto de la compra
		        if (montoCompra >= 200000) {
		            descuento = 0.15;
		        } else if (montoCompra >= 50000) {
		            descuento = 0.02;
		        } else if (montoCompra >= 20000) {
		            descuento = 0.015;
		        }
		        
		        // Calcular el valor del descuento
		        valorDescuento = montoCompra * descuento;
		        
		        // Calcular el total a pagar
		        double totalPagar = montoCompra - valorDescuento;
		        
		        // Imprimir la factura
		        System.out.println("\n--- Factura de Compra ---");
		        System.out.println("Nombre del cliente: " + nombreCliente);
		        System.out.println("Monto de la compra: $" + montoCompra);
		        System.out.println("Valor del descuento: $" + valorDescuento);
		        System.out.println("Total a pagar: $" + totalPagar);
		        System.out.println("--------------------------");
		        System.out.println("¡Gracias por su compra, " + nombreCliente + "!");
		    }
		}
	


