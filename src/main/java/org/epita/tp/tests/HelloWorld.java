package org.epita.tp.tests;

class HelloWorld {
	
		public static void main(String[] args) {
			System.out.println("Hello World");
			///////////////////////////////////////////////////////////////////
			int a=11;
			int b=2;
			int c;
			System.out.println("Valeur a et b avant affectation : "+a+" b :"+b);
			// sauvegarder a dans class
			c = a;
			a = b;
			System.out.println("Valeur a après affectation : "+a);
			
			b = c;
			System.out.println("Valeur b après affectation : "+b);
			
			
			int nba=11;
			int nbb=2;
			///////////////////////////////////////////////////////////////////
			System.out.println("Resultat add=> "+add(nba,nbb));
			System.out.println("Resultat divison=>"+division(nba,nbb));
			double res=divisionProtec(11,0);
			if(res==-1) {
				System.out.println("Division par 0 est impossible");
			}
			
			System.out.println("Division par 2=>"+divisionProtec(11,2));
			System.out.println("Factorielle de 5=>"+calculerFactorielle(5));
		}
		
		public static int add(int a, int b) {
			
			return a+b;
		}
		
		public static int division(int a, int b){
			return (a/b);
		}
		
		
		public static double divisionProtec(int dividende, int diviseur) {
			if(diviseur==0) {
				return -1;
			}
			//else pas necessaire
			
			return dividende/diviseur;
		}
		
		public static int calculerFactorielle(int facto){
			int resultat=1;
			if (facto==0) {
				
				return resultat;
			} 
			//boucle pour calculer factorielle
			while(facto>0){
				resultat = resultat * facto;
				System.out.println("Dans boucle while, resultat=>"+resultat+" facto=>"+facto);
				facto--;
			}
			return resultat;
		}
}