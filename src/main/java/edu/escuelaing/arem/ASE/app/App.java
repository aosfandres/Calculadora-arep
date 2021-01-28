package edu.escuelaing.arem.ASE.app;

import java.util.Scanner;

import linkedList.Lista;

/**
 * programa que calcula la desviacion estandar y la media de un conjunto de n numeros
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	int menu;
    	boolean flag=true;
    	
		while (flag) {
			System.out.println("------------------------------------------------");
			System.out.println("MENU:");
			System.out.println("1: calcular la media de n numeros ");
			System.out.println("2: calcula la desviacion estandar de n numeros");
			System.out.println("3: si desea salir del programa");
			System.out.println("------------------------------------------------");
			Scanner teclado = new Scanner(System.in);
			menu = teclado.nextInt();

			if (menu == 1) {
				System.out.println("digite cuantos numeros va a ingresar para el calculo de la media: \n");
				int n = teclado.nextInt();
				System.out.println("digite cada numero seguido de un enter");
				int cont = 0;
				Lista lista = new Lista(); // creo la lista

				while (cont < n) {
					cont++;
					lista.add(teclado.nextDouble());
				}
				System.out.println("El calculo de la media es: " + Calculadora.media(lista));

// PARA IMPRIMIR LA LISTA DESCOMENTAR ESTE CICLO
//        	for(int i=1; i <= lista.size();++i) {
//        		System.out.println(lista.valorPorIndex(i));
//        	}
			} else if (menu == 2) {
				System.out
						.println("digite cuantos numeros va a ingresar para el calculo de la desviacion estandar: \n");
				int n = teclado.nextInt();
				System.out.println(
						"digite cada numero seguido de un enter (si va a digitar decimiales se separa con coma no con punto)");
				int cont = 0;
				Lista lista2 = new Lista(); // creo la lista

				while (cont < n) {
					cont++;
					lista2.add(teclado.nextDouble());
				}
				System.out.println("El calculo de la desviacion estandar es: " + Calculadora.desviacion(lista2));
			}else if(menu==3) {
				System.out.println("gracias, regrese pronto. Chao");
				flag=!flag;
			}else {
				System.out.println("digite un numero valido del menu, gracias <3");
			}
		}
	}
}
