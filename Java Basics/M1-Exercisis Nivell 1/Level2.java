package variablesExerecises;

public class Level2 {

	public static void main(String[] args) {
		/*Sabent que l�any 1948 es un any de trasp�s:
		Creeu una constant amb el valor de l�any (1948).
		Creeu una variable que guardi cada quan hi ha un any de trasp�s
		Calculeu quants anys de trasp�s hi ha entre 1948 i el vostre any de naixement i emmagatzemeu el valor resultant en una variable.
		Mostreu per pantalla el resultat del c�lcul.
		 */
		
		final int yearTraspass = 1948;
		int varTraspass = 4, myYear = 1982;
		int numYears = 0;
		
		numYears = (myYear - yearTraspass)/ varTraspass;
		
		System.out.println(numYears);
		
	}

}
