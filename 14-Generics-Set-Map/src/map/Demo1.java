package map;

import java.util.Map;
import java.util.TreeMap;

public class Demo1 {

	public static void main(String[] args) {
		
		//tipo chave, tipo valor
		Map<String, String> cookies = new TreeMap<>();
		
		// inserir elemento no Map
		//			chave        valor
		cookies.put("Username", "Maria");
		cookies.put("Email", "maria@gmail.com");
		cookies.put("Age", "22");
		cookies.put("Last Name", "Gonçalves");
		cookies.put("Phone", "997111222");
		
		//	removendo -	chave
		cookies.remove("Last Name");
		
		// sobrescreve uma chave repetida
		cookies.put("Phone", "997111333");
		
		//contem determinada chave - true/false
		System.out.println("Contains 'phone' key: " + cookies.containsKey("Phone"));
		
		//valor de determinada chave
		System.out.println("Phone number: " + cookies.get("Phone"));
		
		//chave que não existe - null
		System.out.println("Eyes color: " + cookies.get("eyes"));
		
		//size
		System.out.println("Map Size: " + cookies.size());
		
		System.out.println("All Cookies:");
		for(String key : cookies.keySet()) {
			System.out.println(key + ": " + cookies.get(key));
		}


	}

}
