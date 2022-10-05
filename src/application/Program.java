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
		System.out.println("Consumo = R$ " + String.format("%.2f", Bill.feeding(beer, softDrink, barbecue)));
		if(Bill.cover(beer, softDrink, barbecue) == 0) {
			System.out.println("Isento de Couvert");
		} else {
			System.out.println("Couvert = R$ " + String.format("%.2f", Bill.cover(beer, softDrink, barbecue)));
		}
		System.out.println("Ingresso = R$ " + String.format("%.2f", Bill.ticket(gender)));
		System.out.println();
		System.out.println("Valor a pagar = R$ " + String.format("%.2f", Bill.total(beer, softDrink, barbecue, gender)));
		
		sc.close();
	}
}
