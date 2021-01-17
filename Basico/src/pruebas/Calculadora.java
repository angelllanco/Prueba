package pruebas;
import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double  priNumero,segNumero,resultado=0;
		String  operador,mensaje="";
		
		Scanner teclado = new Scanner(System.in);
		System.out.print("Introduzca primer valor: ");
		priNumero =     Double.parseDouble(teclado.nextLine());
		
		
		System.out.print("Introduzca operador: ");
		operador = teclado.nextLine();
		
		System.out.print("Introduzca segundo valor: ");
		segNumero = Double.parseDouble(teclado.nextLine());
		
		if( operador.equals("+"))
			{
			//System.out.print("entró a la suma");
				resultado  = priNumero + segNumero;
			}
		else 
		{
			if (operador.equals("-"))
			{
				//System.out.print("entró a la resta");
				resultado = priNumero - segNumero;
			}
			else {
				if(operador.equals("x"))
				{
					//System.out.print("entró a la multi");
					resultado = priNumero * segNumero;
				}
				else {
					if(operador.equals("/"))
					{
						//System.out.print("entró a la div");
						if ( segNumero == 0)
						{
							mensaje = "No se puede dividir entre cero ";
						}
						else {
							resultado = priNumero / segNumero;
						}
					}
					else {
						System.out.print("no entró ");
						mensaje = "No se encontro operador";
					}
				}
				
			}
			
		}
		
		System.out.print("Resultado : " + resultado);
		System.out.println("mensaje: "+ mensaje);
	}

}
