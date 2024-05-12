package programacao_funcional_calculo_lambda;

import java.util.Arrays;

public class FuncaoSemTransparenciaReferencial {

	public static int globalValue = 3;

	public static void main(String[] args) {

		int[] vect = new int[] { 3, 4, 5 };
		changeOddValues(vect);
		System.out.println(Arrays.toString(vect));

	}

	// mudar os valores impares + 3
	// não possui transparencia referencial pois se a variavel global value
	// mudar, o resultado sempre vai mudar
	public static void changeOddValues(int[] numbers) {
		for(int i = 0; i < numbers.length; i++) {
			if(numbers[i] % 2 != 0) {
				numbers[i] += globalValue;
			}
		}
	}

}
