package no.hvl.dat100.tabeller;

public class Tabeller {

	// a)
	public static void main(String[]args) {
	int tabell [] = {1,2,3,4,5,6};
    skrivUt(tabell);
    
    int tabell2[] = {42,67,89};
	
	System.out.println(tilStreng(tabell2));
    }

	public static void skrivUt(int[] tabell) {
		for (int i = 0; i < tabell.length; i++) {
			System.out.println(tabell[i]);
			System.out.println();
		}
		
	}


	// b)
	
	
	

	public static String tilStreng(int[] tabell2) {
	
		StringBuilder sb = new StringBuilder();
			sb.append("[");
			
			for (int i = 0; i < tabell2.length; i++) {
			sb.append(tabell2[i]);
			
			
			if(i < tabell2.length - 1) {
			sb.append(",");	
			}
			}
			sb.append("]");
			return sb.toString();
			
	
	}
	// c)
	public static int summer(int[] tabell) {

		// TODO
		throw new UnsupportedOperationException("Metoden summer ikke implementert");
	}

	// d)
	public static boolean finnesTall(int[] tabell, int tall) {

		// TODO
		throw new UnsupportedOperationException("Metoden finnesTall ikke implementert");

	}

	// e)
	public static int posisjonTall(int[] tabell, int tall) {

		// TODO
		throw new UnsupportedOperationException("Metoden posisjonTall ikke implementert");
	}

	// f)
	public static int[] reverser(int[] tabell) {

		// TODO
		throw new UnsupportedOperationException("Metoden reverser ikke implementert");
	}

	// g)
	public static boolean erSortert(int[] tabell) {

		// TODO
		throw new UnsupportedOperationException("Metoden erSortert ikke implementert");
	}

	// h)
	public static int[] settSammen(int[] tabell1, int[] tabell2) {

		// TODO
		throw new UnsupportedOperationException("Metoden settSammen ikke implementert");

	}

}
