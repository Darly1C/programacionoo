package ejercicio.tablero.ajedrez;

import java.util.Arrays;
import java.util.Scanner;

public class Pieza {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);

		// Peon Negro
		Peon peonNegro1 = new Peon();
		peonNegro1.setColor("Negro");
		peonNegro1.setNombre('P');

		Peon peonNegro2 = new Peon();
		peonNegro2.setColor("Negro");
		peonNegro2.setNombre('P');

		Peon peonNegro3 = new Peon();
		peonNegro3.setColor("Negro");
		peonNegro3.setNombre('P');

		Peon peonNegro4 = new Peon();
		peonNegro4.setColor("Negro");
		peonNegro4.setNombre('P');

		Peon peonNegro5 = new Peon();
		peonNegro5.setColor("Negro");
		peonNegro5.setNombre('P');

		Peon peonNegro6 = new Peon();
		peonNegro6.setColor("Negro");
		peonNegro6.setNombre('P');

		Peon peonNegro7 = new Peon();
		peonNegro7.setColor("Negro");
		peonNegro7.setNombre('P');

		Peon peonNegro8 = new Peon();
		peonNegro8.setColor("Negro");
		peonNegro8.setNombre('P');

		// Peon Blanco
		Peon peonBlanco1 = new Peon();
		peonBlanco1.setColor("Blanco");
		peonBlanco1.setNombre('p');

		Peon peonBlanco2 = new Peon();
		peonBlanco2.setColor("Blanco");
		peonBlanco2.setNombre('p');

		Peon peonBlanco3 = new Peon();
		peonBlanco3.setColor("Blanco");
		peonBlanco3.setNombre('p');

		Peon peonBlanco4 = new Peon();
		peonBlanco4.setColor("Blanco");
		peonBlanco4.setNombre('p');

		Peon peonBlanco5 = new Peon();
		peonBlanco5.setColor("Blanco");
		peonBlanco5.setNombre('p');

		Peon peonBlanco6 = new Peon();
		peonBlanco6.setColor("Blanco");
		peonBlanco6.setNombre('p');

		Peon peonBlanco7 = new Peon();
		peonBlanco7.setColor("Blanco");
		peonBlanco7.setNombre('p');

		Peon peonBlanco8 = new Peon();
		peonBlanco8.setColor("Blanco");
		peonBlanco8.setNombre('p');

		// Caballo Negro
		Caballo caballoNegro1 = new Caballo();
		caballoNegro1.setColor("Negro");
		caballoNegro1.setNombre('C');

		Caballo caballoNegro2 = new Caballo();
		caballoNegro2.setColor("Negro");
		caballoNegro2.setNombre('C');

		// Caballo Blanco
		Caballo caballoBlanco1 = new Caballo();
		caballoBlanco1.setColor("Blanco");
		caballoBlanco1.setNombre('c');

		Caballo caballoBlanco2 = new Caballo();
		caballoBlanco2.setColor("Blanco");
		caballoBlanco2.setNombre('c');

		// Torre Negro
		Torre torreNegro1 = new Torre();
		torreNegro1.setColor("Negro");
		torreNegro1.setNombre('T');

		Torre torreNegro2 = new Torre();
		torreNegro2.setColor("Negro");
		torreNegro2.setNombre('T');

		// Torre Blanco
		Torre torreBlanco1 = new Torre();
		torreBlanco1.setColor("Blanco");
		torreBlanco1.setNombre('t');

		Torre torreBlanco2 = new Torre();
		torreBlanco2.setColor("Blanco");
		torreBlanco2.setNombre('t');

		// Alfil Negro
		Alfil alfilNegro1 = new Alfil();
		alfilNegro1.setColor("Negro");
		alfilNegro1.setNombre('A');

		Alfil alfilNegro2 = new Alfil();
		alfilNegro2.setColor("Negro");
		alfilNegro2.setNombre('A');

		// Alfil Blanco
		Alfil alfilBlanco1 = new Alfil();
		alfilBlanco1.setColor("Blanco");
		alfilBlanco1.setNombre('a');

		Alfil alfilBlanco2 = new Alfil();
		alfilBlanco2.setColor("Blanco");
		alfilBlanco2.setNombre('a');

		// Reina/Dama Negro
		Reina reinaNegro = new Reina();
		reinaNegro.setColor("Negro");
		reinaNegro.setNombre('D');

		// Reina/Dama Blanco
		Reina reinaBlanco = new Reina();
		reinaBlanco.setColor("Blanco");
		reinaBlanco.setNombre('d');

		// Rey Negro
		Rey reyNegro = new Rey();
		reyNegro.setColor("Negro");
		reyNegro.setNombre('R');

		// Rey Blanco
		Rey reyBlanco = new Rey();
		reyBlanco.setColor("Blanco");
		reyBlanco.setNombre('r');

		Pieza[][] tablero = new Pieza[8][8];

		tablero[1][0] = peonNegro1;
		tablero[1][1] = peonNegro2;
		tablero[1][2] = peonNegro3;
		tablero[1][3] = peonNegro4;
		tablero[1][4] = peonNegro5;
		tablero[1][5] = peonNegro6;
		tablero[1][6] = peonNegro7;
		tablero[1][7] = peonNegro8;
		tablero[6][0] = peonBlanco1;
		tablero[6][1] = peonBlanco2;
		tablero[6][2] = peonBlanco3;
		tablero[6][3] = peonBlanco4;
		tablero[6][4] = peonBlanco5;
		tablero[6][5] = peonBlanco6;
		tablero[6][6] = peonBlanco7;
		tablero[6][7] = peonBlanco8;

		tablero[0][1] = caballoNegro1;
		tablero[0][6] = caballoNegro2;
		tablero[7][1] = caballoBlanco1;
		tablero[7][6] = caballoBlanco2;

		tablero[0][0] = torreNegro1;
		tablero[0][7] = torreNegro2;
		tablero[7][0] = torreBlanco1;
		tablero[7][7] = torreBlanco2;

		tablero[0][2] = alfilNegro1;
		tablero[0][5] = alfilNegro2;
		tablero[7][2] = alfilBlanco1;
		tablero[7][5] = alfilBlanco2;

		tablero[0][3] = reinaNegro;
		tablero[7][3] = reinaBlanco;

		tablero[0][4] = reyNegro;
		tablero[7][4] = reyBlanco;

		for (int fila = 0; fila < 8; fila++) {
			for (int columna = 0; columna < 8; columna++) {
				System.out.print(tablero[fila][columna] + " ");
			}

			System.out.println();
		}

	}

}
