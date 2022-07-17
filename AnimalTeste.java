package Polimorfismo;

import java.util.Scanner;

public class AnimalTeste {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		Cachorro Poodle= new Cachorro();
		Cavalo Equus= new Cavalo();
		Preguica Comum=new Preguica();
		
		 
		System.out.println("O Poodle se chama: Lery \nTem 5 anos");
		Poodle.emitirSom ();
		Poodle.correr();
		
		System.out.println("O Equus se chama: Ted \nTem 11 anos");
		Equus.emitirSom();
		Equus.corre1();
		
		System.out.println("O Comum se chama: Debs \nTem 20 anos");
		Comum.emitirSom();
		Comum.subir();
		
		

	}

}
