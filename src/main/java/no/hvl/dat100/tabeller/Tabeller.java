package no.hvl.dat100.tabeller;

public class Tabeller {

	
	public static void main(String[]args) {
	int tabell [] = {1,2,3,4,5,6};
	
	 int tabell2[] = {42,67,89};
	
	 
skrivUt(tabell);
    //System.out.println();
System.out.println();
    
System.out.println(tilStreng(tabell2));
    //System.out.println(); 
System.out.println();

    
    System.out.print("Summen av tallene i tabellen er: ");
summer(tabell);
    System.out.println();
	
    
    System.out.println("Finnes tallet i tabellen?");
boolean svar = finnesTall(tabell, 3);
System.out.println(svar);

System.out.println();

posisjonTall(tabell, 4);
System.out.println();

System.out.println("Tabellen reversert blir");
reverser(tabell);
System.out.println();


if (erSortert(tabell)) {
	System.out.println("første tabell er stigende");
}else {
	System.out.println("første tabell er ikke stigende");
}
System.out.println();


System.out.println("Tabellene satt sammen gir: ");
settSammen(tabell, tabell2);


	}
	
// a)
	
	public static void skrivUt(int[] tabell) {
		for (int i = 0; i < tabell.length; i++) {
			System.out.print(tabell[i] + " ");
			
		}
		System.out.println();
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
				return true;
				}
			else if (tall < 0 || tall > tabell.length) {
				System.out.print("må være et positivt tall fra 0 til " + tabell.length + - 1);
			}
		}
		return false;
	}
	
// e)
	
	public static int posisjonTall(int[] tabell, int tall) {
		
		for (int i = 0; i < tabell.length; i ++) {
			if (tall == i) {
				System.out.println("verdien til posisjon "+ i + " er " + tabell[i]);
				tall = tabell[i];
				break;
			}
		}
		return tall;
	}
	
// f)
	
	public static int[] reverser(int[] tabell) {
		int[] tabell2 = new int[tabell.length];
		int b = 0;
		for (int i = tabell.length -1; i >= 0; i--) {
			int a = tabell[i];
	
			tabell2[b] = a;

			b ++;
			}
		tabell = tabell2;
		for (int i = 0; i < tabell.length; i++) {
			System.out.print(tabell[i] + " ");
		}
		System.out.println();
		return tabell;
		
	}
	
// g)
	
	public static boolean erSortert(int[] tabell) {

		for (int i = 1; i < tabell.length;i++) {
	
			if (tabell[i] < tabell[i-1]) {   // sjekk om nåvarende element er mindre eller lik forrige element
		
		  return false;
		}
		}
	return true;
	      	}
	
// h)
	
	public static int[] settSammen(int[] tabell, int[] tabell2) {

	int tabellLengde = tabell.length + tabell2.length;
	int [] nytabell = new int [tabellLengde];
	
	for (int i = 0; i < tabell.length; i++) {
		nytabell[i] = tabell[i];
	}
	for (int j = 0; j < tabell2.length; j++) {
		nytabell[tabell.length + j] = tabell2[j];	
	}
	for (int s = 0; s < nytabell.length; s++) {
		System.out.print(nytabell[s] + " ");
	
	}
	System.out.println();
return nytabell;
	
	}
}
