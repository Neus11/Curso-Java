package variablesExerecises;

public class Level3 {

	public static void main(String[] args) {
		
		/*
		Partint de l’any 1948 heu de fer un bucle for i mostrar 
		els anys de traspàs fins arriba al vostre any de naixement.
		ATENCIO! Haureu de canviar el tipus de variable de l’any 1948 
		per poder modificar-la.
		Creeu una variable bool que sera certa si l’any de naixement és 
		de traspàs o falsa si no ho és.
		En cas de que la variable bool sigui certa, heu de mostrar per
		consola una frase on ho digui, en cas de ser falsa mostrareu la 
		frase pertinent. Creeu dues variables string per guardar les frases. 
		 */
		
		int yearTraspass = 1948;
		int myYear = 1982;
		boolean years = true;
		int numYear = 0; 
		String trueTraspass = "Traspass year ";
		String falseTraspass = "Not Traspass years ";
		
		for(int i = yearTraspass; i <= myYear; i++) {
			if(i == yearTraspass && years) {
				System.out.println( trueTraspass + i);
				yearTraspass += 4;
				numYear++;
				
			} else {
				System.out.println(falseTraspass + i);
			}
		}
		System.out.println("Total Traspass years " + numYear);
	}

}
