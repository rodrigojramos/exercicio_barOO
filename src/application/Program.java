package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Bill;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Sexo: ");
		char gender = sc.nextLine().charAt(0);
		System.out.print("Quantidade de cerveja: ");
		int beer = sc.nextInt();
		System.out.print("Quantidade de refrigerantes: ");
		int softDrink = sc.nextInt();
		System.out.print("Quantidade de espetinhos: ");
		int barbecue = sc.nextInt();
		
		System.out.println();
		System.out.println("RELATÓRIO:");
		System.out.println("Consumo = R$ " + Bill.feeding(beer, softDrink, barbecue));
		System.out.println("Couvert = R$ " + Bill.cover(beer, softDrink, barbecue));
		System.out.println("Ingresso = R$ ");
		System.out.println();
		System.out.println("Valor a pagar = R$ ");
		
		sc.close();
	}

}
