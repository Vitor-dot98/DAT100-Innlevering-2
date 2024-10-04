package no.hvl.dat100.matriser;

public class Matriser {
	public static void main (String[] args) {
	int [][] matrise = {
			{1,3,5},
			{6,11,16},
			{12,20,28}
	};
	
	
	
	skrivUt(matrise);
	System.out.println();
	
	int[][] skalert = skaler(8, matrise);
	
	
	
	
}

	
	// a)
	public static void skrivUt(int[][] matrise) {
		
		for (int i = 0; i < matrise.length;i++) {
		for (int j = 0 ; j < matrise.length; j++) {
			System.out.print(matrise[i][j] + " ");
			}
		System.out.println();
		}
	}
		


	// b)
	public static String tilStreng(int[][] matrise) {

		// TODO
		throw new UnsupportedOperationException("Metoden tilStreng ikke implementert");
		
	}

	// c)
	public static int[][] skaler(int tall, int[][] matrise) {
int matriseZ [][] = new int [matrise.length][matrise[0].length];
for (int i = 0; i < matrise.length;i++) {
	for (int j = 0 ; j < matrise[0].length; j++) {
		matriseZ[i][j] = matrise[i][j] * tall; 
		System.out.print(matriseZ[i][j] + " ");
	}
	System.out.println();
	}
return matriseZ;
	}
	

	// d)
	public static boolean erLik(int[][] a, int[][] b) {

		// TODO
		throw new UnsupportedOperationException("Metoden erLik ikke implementert");
		
	}
	
	// e)
	public static int[][] speile(int[][] matrise) {

		// TODO

		throw new UnsupportedOperationException("Metoden speile ikke implementert");
	
	}

	// f)
	public static int[][] multipliser(int[][] a, int[][] b) {

		// TODO
		throw new UnsupportedOperationException("Metoden multipliser ikke implementert");
	
	}
}
