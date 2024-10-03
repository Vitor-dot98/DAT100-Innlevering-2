//package no.hvl.dat100.tabeller;

public class Tabeller {

	
	public static void main(String[]args) {
	int tabell [] = {1,2,3,4,5,6};
	
	 int tabell2[] = {42,67,89};
	 
	 
skrivUt(tabell);
    System.out.println();
    
    
System.out.println(tilStreng(tabell2));
    System.out.println(); 

    
    System.out.print("Summen av tallene i tabellen er: ");
summer(tabell);
    System.out.println();
	
    
    System.out.println("Finnes tallet i tabellen?");
finnesTall(tabell, 3);
System.out.println();


posisjonTall(tabell, 7);
	}
	
	
	
// a)
	
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
	
	
	
//c)
	
	    private static int sum = 0;

	    public static int summer(int[] tabell) {
	        for (int i = 0; i < tabell.length; i++)
	            sum += tabell[i];  

	        System.out.println(sum); 
	        return sum;
	
	}

   
	    
// d)	    
	    
	public static boolean finnesTall(int[] tabell, int tall) {
for (int i = 0; i < tabell.length -1; i++) {
	
	if (tall == tabell[i]) {
		
		System.out.print(tall);		
		}
	else if (tall < 0 || tall > tabell.length) {
		System.out.print("må være et positivt tall fra 0 til " + tabell.length + - 1);
	}
	}
		return false;
	}
	
	
	// TODO throw new UnsupportedOperationException("Metoden finnesTall ikke implementert");

	
	
	
// e)
	
	public static int posisjonTall(int[] tabell, int tall) {
		
		for (int i = 0; i < tabell.length; i ++) {
			if (tall == i) {
				System.out.print(tabell[i]);
				tall = tabell[i];
				break;
			}
		}
		return tall;

		
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
