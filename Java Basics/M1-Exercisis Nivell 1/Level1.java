package variablesExerecises;

public class Level1 {

	public static void main(String[] args) {
		
		/*
		Crea tres variables string e inicialitzales amb les dades pertinents (nom, cognom1, cognom2).
		Crea tres variables int e inicialitzales amb les dades pertinents (dia, mes, any).
		Mostra per pantalla les variables string concatenant-les en aquest ordre (cognom1 + cognom2, + nom).
		Mostra per pantalla les variables int concatenant-les amb “/” entre cada una d’elles.*/
		
		String name = "Jane";
		String surname1 = "Doe";
		String surname2  = "Doe";
		
		int day = 16, month = 3, year = 2021;
		System.out.println("The name is: " +" "+ surname1 +" "+ surname2 +" "+ name);
		System.out.println("The date is: " + day + "/" + month + "/" + year); 

	}

}
