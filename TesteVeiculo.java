package beans;
import java.util.Scanner;

import beans.Veiculo;

public class TesteVeiculo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Veiculo fiat;
		fiat = new Veiculo();
		fiat.marca = "gm";
		fiat.modelo = "volvo";
		fiat.cor = "preto" ;
		
		//Veiculo chevrolet;
		//chevrolet = new Veiculo();
		//chevrolet.marca = "Chevrolet Corporations";
		//chevrolet.modelo = "Maserati";
		//chevrolet.cor = "Preto";
		
		//System.out.println(fiat.marca + " " + fiat.modelo + " " + fiat.cor + " " );
		//System.out.println(chevrolet.marca + " " + chevrolet.modelo + " " + chevrolet.cor + " " );
		
		Scanner sc = new Scanner(System.in);
		
		String marca;
		System.out.println("Digite a marca:");
		marca = sc.nextLine();
		
		String modelo;
		System.out.println("Digite a modelo:");
		modelo = sc.nextLine();
		
		String cor;
		System.out.println("Digite a cor:");
		cor = sc.nextLine();
		
		System.out.println(fiat.marca + " " + fiat.modelo + " " + fiat.cor);
		
		//Scanner sc = new Scanner(System.in);
		//String modelo;
		//System.out.println("Digite a marca:");
		//modelo = sc.nextLine();
		
		
		//DENTRO DE FABRICA EM VEICULO CRIAR METODO consumoMedio-- é igual espacoPercorrido e distancia e litro.

	}

}
