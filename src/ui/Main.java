package ui;

import model.*;

import java.util.Scanner;

public class Main {

	//Atributos	
	private Estetica estetica;

	public Main(){

	scanner = new Scanner(System.in);
	estetica = new Estetica ();
	
	
	}

	public static void main (String[] args) {

		Main main = new Main();
		main.menu();
	}

	public void menu() {

		System.out.println("_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-");

		System.out.println("_-_-_-_-_-_-_-_-Bienvenido a la pequeña y exclusiva estetcia Colombiana-_-_-_-_-_-_-_-_-_-");

		System.out.println("_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-");

		System.out.println("\nDigite la dimesiones de los 3 contenedores:");

		System.out.println("Contenedor 1");

		System.out.println("El Ancho");

		System.out.println("El Ancho");

		double ancho= scanner.nextDouble();

		System.out.println("El Largo");

		double largo= scanner.nextDouble();

		

				
	}

}