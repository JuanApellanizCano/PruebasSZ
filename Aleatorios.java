package excepciones_Iv2;

import	javax.swing.JOptionPane;

public class Aleatorios {
	
	public static void main(String[] args) {

		//TODO Auto-generated method stub

		int elementos=Integer.parseInt(JOptionPane.showInputDialog("Escribe las posiciones de la matriz"));

		int num_aleat[]=new int[elementos];

		for(int i=0;i<num_aleat.length;i++){

			num_aleat[i]=(int)(Math.random()*2000);

		}
		
		for(int elem: num_aleat) {

			System.out.println(elem);

		}

	}

}