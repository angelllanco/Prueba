package pruebas;
import java.util.Scanner;

public class FlujosControl1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String FlagContinuar="";
		int FlagPar=0;
		
		double Valor=0.0;
		int Resto=0;
		
		Scanner teclado =  new Scanner (System.in);
		
		do {
			
			do {
				System.out.println("*******************************");				
				System.out.println("Ingrese valor numérico: ");
				Valor = Double.parseDouble(teclado.next());
				Resto = (int)(Valor%2);
				
				if (Resto==0)
				{
					System.out.println("Valor ingresado es Par");
					FlagPar=1;
				}
				else
				{
					FlagPar=0;
					System.out.println("Valor ingresado es Impar.");
					System.out.println("Se solicitará otro valor.");
				}				
				
			}while(FlagPar==0);			
			System.out.println("-------------------------------");
			System.out.println("Desea intentar nuevamente S/N: ");
			FlagContinuar = teclado.next();			
		}while (FlagContinuar.equals("S"));
		System.out.println("Fin del Proceso....");
		teclado.close();	
		
		
	}

}
