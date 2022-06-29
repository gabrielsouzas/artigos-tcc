package dna;

public class conversaoDNA {

	private static double[] b = new double[100];
	private static double[] b2 = new double[100];
	private static double[] b3 = new double[100];
	private static double[] b4 = new double[100];
	private static double[] b5 = new double[100];
	private static double[] b6 = new double[100];
	private static double[] b7 = new double[100];
	private static double[] b8 = new double[100];
	private static double[] b9 = new double[100];
	private static double[] b10 = new double[100];
	
	private static String Vetor = "";
	static double[][] amostras = new double[100][4];

	public static void main(String[] args) {

		String[] padrao1a = {"a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","t",
							 "a","a","a","a","a","a","a","a","t","a","a","a","a","a","a","a","a",
							 "a","a","a","a","a","a","a","a","a","a","t","a","t","a","t","a","a",
							 "a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a",
							 "a","a","a","a","a","a","a","a","a","a","a","a","a","a","t","a","a",
							 "a","a","a","a","a","a","a","t","t","a","a","a","a","a","a"};
		
		String[] padrao1b = {"a","a","a","a","a","a","a","a","a","t","a","a","a","t","a","t","t",
					  		 "t","a","t","a","a","a","t","a","a","a","t","a","a","a","a","a","a",
					  		 "a","a","a","a","a","a","t","t","t","t","a","t","a","t","a","a","a",
					  		 "a","a","a","a","a","a","a","a","a","a","a","t","a","a","a","a","a",
					  		 "t","a","t","a","a","a","a","a","a","a","a","t","a","t","a","a","a",
					  		 "a","a","a","a","t","a","a","a","a","a","a","a","a","t","t"};
		
		String[] padrao1c = {"a","t","t","a","a","a","a","a","a","a","a","a","a","a","a","a","a",
							 "a","a","t","a","a","a","a","a","a","t","a","a","a","a","a","t","t",
							 "a","a","a","a","a","t","a","a","a","a","a","a","a","a","a","a","a",
							 "a","a","a","a","a","a","a","t","a","a","t","t","a","a","a","a","a",
							 "a","t","a","a","a","a","a","t","a","a","t","a","a","a","a","t","a",
							 "a","a","a","a","a","a","a","a","a","a","a","t","a","a","t"};

		String[] padrao1d = {"a","a","a","a","t","a","a","a","t","a","a","a","a","a","a","a","a",
							 "a","a","a","t","t","a","a","a","a","t","a","t","a","a","a","a","a",
							 "a","a","a","a","a","t","a","a","a","a","a","a","a","t","a","a","a",
							 "t","t","a","a","a","a","a","a","t","a","a","a","a","t","a","a","a",
							 "a","a","a","t","a","a","t","a","a","a","a","a","a","a","a","a","t",
							 "a","t","a","a","a","t","a","a","a","a","a","a","a","a","a"};

		String[] padrao1e = {"a","a","a","t","a","a","a","a","a","t","a","a","a","a","t","a","a",
							 "a","t","t","a","a","t","a","a","a","a","a","a","a","a","a","a","a",
							 "t","a","t","a","a","a","a","t","a","a","a","a","a","a","a","a","t",
							 "a","a","a","a","a","a","a","a","t","t","a","a","a","a","t","a","a",
							 "a","a","a","a","a","a","a","a","a","a","a","a","t","a","a","a","a",
							 "a","a","a","a","t","a","t","a","t","a","a","a","a","t","t"};
		
		String[] padrao2a = {"t","g","t","g","g","g","t","t","t","g","a","g","a","g","g","g","t",
					  	     "a","g","g","g","t","g","g","g","t","g","g","g","g","a","t","t","a",
					  	     "t","t","t","g","g","g","g","g","a","t","g","g","g","t","g","g","g",
					  	     "t","g","a","g","g","g","t","t","a","g","g","g","g","g","g","g","g",
					  	     "t","g","g","g","t","t","a","t","g","g","t","g","t","t","t","g","g",
					  	     "t","g","g","t","g","g","g","g","t","g","g","t","t","t","t"};
		
		String[] padrao2b = {"g","a","t","g","g","g","t","t","t","t","g","g","t","g","g","t","a",
				      		 "t","g","t","a","t","g","t","t","g","t","t","g","g","g","t","g","g",
				      		 "t","g","g","g","t","g","g","g","g","t","t","g","g","g","g","t","t",
				      		 "g","a","t","g","g","g","g","g","g","g","g","g","g","g","g","t","g",
				      		 "g","t","g","g","t","g","g","t","t","g","g","t","t","a","g","g","t",
				      		 "t","t","g","g","g","t","t","t","g","t","t","a","g","t","g"};
		
		String[] padrao2c = {"g","g","g","g","a","g","g","a","g","t","t","t","g","t","g","a","g",
							 "g","g","g","g","g","t","t","g","g","g","g","g","t","a","g","t","t",
							 "g","g","g","g","g","a","g","t","g","g","g","g","t","g","g","g","t",
							 "g","t","g","t","g","t","t","g","a","t","g","g","g","g","g","g","g",
							 "t","g","g","t","g","g","g","a","t","g","g","t","a","g","g","t","t",
							 "g","g","t","g","a","t","g","t","g","a","a","g","t","g","g"};
		
		String[] padrao2d = {"g","t","g","g","t","g","g","t","t","t","g","g","a","t","g","g","a",
							 "g","t","g","g","g","t","g","g","g","a","g","t","t","t","a","t","g",
							 "g","t","g","g","g","g","a","g","g","a","g","t","g","g","g","g","t",
							 "g","g","t","g","g","g","g","t","g","g","g","g","g","t","a","t","g",
							 "g","g","g","g","g","a","t","t","g","t","g","g","g","a","g","g","t",
							 "g","g","g","t","g","g","t","g","g","a","g","t","t","g","g"};

		
				
		String[] padrao2e = {"a","g","g","g","g","g","t","a","g","g","g","g","g","t","g","g","g",
							 "g","g","t","g","g","g","g","a","g","a","g","g","a","g","g","g","g",
							 "g","g","g","t","g","g","t","g","g","g","t","g","t","a","g","a","g",
							 "g","t","g","g","t","t","g","g","t","a","g","g","g","t","g","g","g",
							 "g","g","g","t","t","t","g","t","g","g","g","t","g","a","g","g","g",
							 "t","t","a","g","g","g","g","g","g","g","t","t","t","a","g"};
		//******************************************************************************************//
		b = function(padrao1a);
		
		Vetor = "{ 1a";
		for (int i = 0; i < b.length; i++) {
			Vetor += b[i] + (((i + 1) != b.length) ? ", " : "");
			System.out.println(b[i] + ",");
		}
		Vetor += " }";
		System.out.println(Vetor);
		
		//******************************************************************************************//
		b2 = function(padrao1b);
		//******************************************************************************************//
		Vetor = "{ 1b";
		for (int i = 0; i < b.length; i++) {
			Vetor += b[i] + (((i + 1) != b.length) ? ", " : "");
			System.out.println(b[i] + ",");
		}
		Vetor += " }";
		System.out.println(Vetor);

		//******************************************************************************************//
		b3 = function(padrao1c);
		//******************************************************************************************//
		Vetor = "{ 1c";
		for (int i = 0; i < b.length; i++) {
			Vetor += b[i] + (((i + 1) != b.length) ? ", " : "");
			System.out.println(b[i] + ",");
		}
		Vetor += " }";
		System.out.println(Vetor);
		
		//******************************************************************************************//
		b4 = function(padrao1d);
		//******************************************************************************************//
		Vetor = "{ 1d";
		for (int i = 0; i < b.length; i++) {
			Vetor += b[i] + (((i + 1) != b.length) ? ", " : "");
			System.out.println(b[i] + ",");
		}
		Vetor += " }";
		System.out.println(Vetor);
		
		
		b5 = function(padrao1e);
		//******************************************************************************************//
		Vetor = "{ 1e";
		for (int i = 0; i < b.length; i++) {
			Vetor += b[i] + (((i + 1) != b.length) ? ", " : "");
			System.out.println(b[i] + ",");
		}
		Vetor += " }";
		System.out.println(Vetor);
		
		//******************************************************************************************//
		b6 = function(padrao2a);
				//******************************************************************************************//
				Vetor = "{ 2a";
				for (int i = 0; i < b.length; i++) {
					Vetor += b[i] + (((i + 1) != b.length) ? ", " : "");
					System.out.println(b[i] + ",");
				}
				Vetor += " }";
				System.out.println(Vetor);
				
				//******************************************************************************************//
				b7 = function(padrao2b);
				//******************************************************************************************//
				Vetor = "{ 2b";
				for (int i = 0; i < b.length; i++) {
					Vetor += b[i] + (((i + 1) != b.length) ? ", " : "");
					System.out.println(b[i] + ",");
				}
				Vetor += " }";
				System.out.println(Vetor);
				
				//******************************************************************************************//
				b8 = function(padrao2c);
				//******************************************************************************************//
				Vetor = "{ 2c";
				for (int i = 0; i < b.length; i++) {
					Vetor += b[i] + (((i + 1) != b.length) ? ", " : "");
					System.out.println(b[i] + ",");
				}
				Vetor += " }";
				System.out.println(Vetor);
				
				//******************************************************************************************//
				b9 = function(padrao2d);
				//******************************************************************************************//
				Vetor = "{ 2d";
				for (int i = 0; i < b.length; i++) {
					Vetor += b[i] + (((i + 1) != b.length) ? ", " : "");
					System.out.println(b[i] + ",");
				}
				Vetor += " }";
				System.out.println(Vetor);
				
				//******************************************************************************************//
				b10 = function(padrao2e);
				//******************************************************************************************//
				Vetor = "{ 2e";
				for (int i = 0; i < b.length; i++) {
					Vetor += b[i] + (((i + 1) != b.length) ? ", " : "");
					System.out.println(b[i] + ",");
				}
				Vetor += " }";
				System.out.println(Vetor);
				
				
		//******************************************************************************************//
		
		/*for (int i = 0; i < amostras.length; i++) {
			for (int k = 0; k < 4; k++) {
				System.out.println("[" + i + "]" + "[" + k + "]" + amostras[i][k]);
			}
			
		}*/
	}
	
	public static double[] function(String[] a){
		//double[] b = null;
		for (int i = 0; i < a.length; i++) {
			if (a[i] == "a") {
				b[i] = 0.25;
			} else if (a[i] == "t"){
				b[i] = 0.50;
			} else if (a[i] == "c") {
				b[i] = 0.75;
			} else if (a[i] == "g") {
				b[i] = 1.00;
			}
		}
		return b;
	}

}
