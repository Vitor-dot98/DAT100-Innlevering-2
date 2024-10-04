package no.hvl.dat100.matriser;

public class Matriser {
	public static void main (String[] args) {
	int [][] matrise = {
			{1,3,5},
			{6,11,16},
			{12,20,28}
	};
	
	
	// a)
	skrivUt(matrise);
	System.out.println();
	
		
	int [][] matrise2 = {
			{1,2,3},
			{4,5,6},
			{7,8,9}
			
	};
	int [][] matrise3 = {
		{1,2,3},
		{4,5,6},
		{7,8,9}
		
	};
	// b)
	String resultat = tilStreng(matrise2);
	System.out.println(resultat);
 	System.out.println();
 	
 	// c)
 	skaler(8, matrise);
	System.out.println();
	
	// d)
 	System.out.println(erLik(matrise, matrise2));
 	System.out.println(erLik(matrise3, matrise2));
		
	}

	// a)
	public static void skrivUt(int[][] matrise) {
		
		for (int i = 0; i < matrise.length;i++) {
			for (int j = 0 ; j < matrise[i].length; j++) {
				System.out.print(matrise[i][j] + " ");
			}
			System.out.println();
		}
	}
		


	// b)
	public static String tilStreng(int[][] matrise2) {
		String resultat = "";
	   	for (int i = 0;i < matrise2.length;i++) {
	   		for (int j = 0; j < matrise2[i].length;j++) {
        		resultat +=  matrise2[i][j];
         
          		if (j < matrise2.length - 1) {
		 			resultat += " ";
         		}
	   		}
	   	resultat +="/n";
	   	}
	return resultat;
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
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[0].length; j++) {
				if (a[i][j] != b[i][j]) {
					return false;
				}
			}
		}
		return true;
	}
}	
