package no.hvl.dat100.tabeller;

public class Tabeller {

	
	public static void main(String[]args) {
	int tabell [] = {1,2,3,4,5,6};
	
	 int tabell2[] = {42,67,89};
	
	 if (erSortert(tabell)) {
			System.out.println("første tabell er stigende");
		}else {
			System.out.println("første tabell er ikke stigende");
		}
	 
skrivUt(tabell);
    System.out.println();
    
    
System.out.println(tilStreng(tabell2));
    System.out.println(); 

    
    System.out.print("Summen av tallene i tabellen er: ");
summer(tabell);
    System.out.println();
	
    
    System.out.println("Finnes tallet i tabellen?");
boolean svar = finnesTall(tabell, 3);
System.out.println(svar);

System.out.println();
boolean sortert = erSortert(tabell);

posisjonTall(tabell, 4);

reverser(tabell);

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
				System.out.print("verdien til posisjon "+ i + " er " + tabell[i]);
				tall = tabell[i];
				break;
			}
		}
		return tall;

		
	}

	
	
// f)
	
	public static int[] reverser(int[] tabell) {

		for (int i = tabell.length - 1; i != 0; i --) {
			//int a = tabell[i];
			System.out.println(tabell[i]);

			//int b = 0;
			//tabell[b] = a;
			//b++;
		}

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
	
	public static int[] settSammen(int[] tabell1, int[] tabell2) {

		// TODO
		throw new UnsupportedOperationException("Metoden settSammen ikke implementert");

	}

}
