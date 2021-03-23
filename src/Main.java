import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] x = new int[4];
		
		try(Scanner entrada = new Scanner(System.in)) {
		
		for(int i = 0; i < x.length; i++)
		{
			x[i] = entrada.nextInt();
		}
		
		for(int i = 0; i < x.length; i++)
		{
			System.out.println("x["+i+"]="+x[i]);
		}
		//0 1 2 3
		//".lenght" retorna o tamanho do vetor
		
		
		}
	}

}
