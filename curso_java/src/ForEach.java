
public class ForEach {

	public static void main(String[] args) {
		
		String[] vect = new String[] {"Maria", "Bob", "Alex"};

		for(int i = 0; i < vect.length; i++) { //For normal
			System.out.println(vect[i]);
		}
		
		System.out.println("------------------");
		
		for(String obj : vect) { /*For Each é necessario declarar um tipo e um nome(nome qualquer)e o objeto/coleção que você quer percorrer*/
			System.out.println(obj); //For Each "Para cada 'String obj em vect, faça: sysout(obj)'"
		}
	}
}
