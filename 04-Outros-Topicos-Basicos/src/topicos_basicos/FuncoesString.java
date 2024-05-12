package topicos_basicos;

public class FuncoesString {
	
	public static void main(String[] args) {
		
		String original = " OI cara de BOI AMARELO  ";
		
		String string01 = original.toLowerCase();
		String string02 = original.toUpperCase();
		String string03 = original.trim();
		String string04 = original.substring(12);
		String string05 = original.substring(12, 15);
		String string06 = original.replace('a', 'u');
		String string07 = original.replace("BOI", "VACA");
		int i = original.indexOf("cara");
		
		System.out.println("Original: -" + original + "-");
		System.out.println("ToLowerCase: " + string01);
		System.out.println("ToUpperCase: " + string02);
		System.out.println("Trim: -" + string03 +"-");
		System.out.println("substring(12): " + string04);
		System.out.println("substring(12, 15): " + string05);
		System.out.println("Replace(a, u): " + string06);
		System.out.println("Replace('BOI','VACA'): " + string07);
		System.out.println("indexoOf('cara'): " + i);

		//split divide a string

		String s = "potato apple lemon";
		String[] vect = s.split(" ");
		
		System.out.println(vect[0]);
		System.out.println(vect[1]);
		System.out.println(vect[2]);


	}

}
