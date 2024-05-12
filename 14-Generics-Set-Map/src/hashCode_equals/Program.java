package hashCode_equals;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Client c1 = new Client("Maria", "maria@gmail.com");
		Client c2 = new Client("Maria", "maria@gmail.com");
		
		String s1 = "Test";
		String s2 = "Test";
		
		System.out.println(c1.hashCode());
		System.out.println(c2.hashCode());
		// para comparar pelo conteúdo use equals
		System.out.println(c1.equals(c2));
		/*
		 *  essa vai dar falso porque os objetos são alocados
		 *  em lugares diferentes no heap, a comparação == não compara
		 *  pelo conteúdo e sim pela posição na memória, a referencia
		 *  de lugar é diferente
		*/
		System.out.println(c1 == c2);
		// nesse caso vai ser true pois vai comparar o conteúdo e não a referencia
		System.out.println(s1 == s2);


	}

}
