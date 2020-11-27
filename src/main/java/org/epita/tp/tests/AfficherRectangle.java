package org.epita.tp.tests;

class AfficherRectangle {
	public static void main(String[] args){
		/*
		System.out.println("10 , 5");
		afficherRec(10,5);
		*/
		//ajouter un élémenent dans tableau
		/*
		int[] tab = new int[5];
		tab[0]=2;
		tab[1]=4;
		tab[2]=6;
		tab[3]=8;
		
		tab=addToArray(tab,100);
		
		for(int i=0;i<tab.length;i++)
		{
				System.out.println("i=>"+i+" "+tab[i]);
		}
		*/
		
		System.out.println(addEntiers(1,2,8));
		
	}
	
	public static void afficherRec(int colonne, int ligne){

			//boucle pour afficher les lignes
			for(int j=0;j<ligne;j++) {
				
				//affichier les 0 en colonne
				for(int i=0;i<colonne;i++) {
					System.out.print("0");
				
				}
				
				//saut de ligne
				System.out.println("");
			}
	}


	public static int[] addToArray(int[] tabInt,int nombre) {
		int largeurTab = tabInt.length;
		System.out.println("largeur tabIn"+largeurTab);
		 tabInt[largeurTab-1]=nombre;
		return tabInt;
	}


	public static int addEntiers(int... sommeInt){
		int somme=0;
		for(int i=0;i<sommeInt.length;i++){
			somme+=sommeInt[i];
		}
		return somme;
	}
}