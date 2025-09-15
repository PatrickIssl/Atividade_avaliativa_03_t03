package fag;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
    	Scanner scanner = new Scanner(System.in);
																																																																																								
		String[] nomes  = {"pedro", "joao ", "marcelo" , "luiz", "luiza"};
		
		System.out.println("coloque o nome que deseja buscar: ");
		 String nomebuscado= scanner.next();
		 
		 boolean encontrado = false;
		 int posicao = -1;
		 
		 for(int i=0;i<nomes.length;i++) {
			 if(nomes[i].equalsIgnoreCase(nomebuscado)) {
				 encontrado = true;
				 posicao = i;
				 break;
			 }
		 }
		 if(encontrado) {
			 System.out.println("o nome que busca consta no sistema" + posicao);
			 
		 } else {
			 System.out.println("nome nao encontrado no sistema ");
		 }
		 scanner.close();

	}

}

		

	



}       
  

    
  


	

