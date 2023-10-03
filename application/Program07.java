package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product07;

public class Program07 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Product07[] vect = new Product07[10];
		
		System.out.print("How many rooms will be rented? ");
		int n = sc.nextInt();
		
		for(int i = 1; i<=n; i++) {
			System.out.println();
			System.out.println("Rent #" + i + ":");
			System.out.println("Name :");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.println("Email :");
			String email = sc.next();
			System.out.println("Room :");
			int roomNumber = sc.nextInt();
						
			vect[roomNumber] = new Product07(name, email);
		}
		
		System.out.println();
		System.out.println("Busy rooms: ");
		for (int i = 0; i<10; i++) {
			if (vect[i] != null) {
				System.out.println(i + ": " + vect[i]);
			}
						
		}
		
		sc.close();
	}

}
