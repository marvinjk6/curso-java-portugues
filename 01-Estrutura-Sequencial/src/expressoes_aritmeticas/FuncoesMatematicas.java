package expressoes_aritmeticas;

public class FuncoesMatematicas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n1 = 3;
		int n2 = 25;
		int n3 = -40;
		
		// Math retorna um double, foi preciso fazer um casting em raiz quadrada
		
		int raizQuadrada = (int) Math.sqrt(n2);
		double aoCubo = Math.pow(n1, 3);

		System.out.println("Raiz Quadrada n2 = " + raizQuadrada);
		System.out.println("n1 ao cubo = " + aoCubo);
		System.out.println("n3 absoluto = " + Math.abs(n3));

	}

}
