package prueba.bus;

import java.util.Scanner;


public class Pasajero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		Adolescente andres = new Adolescente();
		andres.setNombre("Andres");
		andres.setApellido("García");
		andres.setDeporte("Fútbol");

		Adolescente a = new Adolescente();
		a.setNombre("A");
		a.setApellido("G");
		a.setDeporte("Fútbol");

		Adolescente an = new Adolescente();
		an.setNombre("An");
		an.setApellido("Ga");
		an.setDeporte("Fútbol");

		Adolescente andrea = new Adolescente();
		andrea.setNombre("Andrea");
		andrea.setApellido("Gonzales");
		andrea.setDeporte("basquet");

		Adolescente ana = new Adolescente();
		ana.setNombre("Ana");
		ana.setApellido("Torres");
		ana.setDeporte("voley");

		Adolescente nia = new Adolescente();
		nia.setNombre("Nia");
		nia.setApellido("N");
		nia.setDeporte("voley");

		Adolescente elle = new Adolescente();
		elle.setNombre("Elle");
		elle.setApellido("G");
		elle.setDeporte("basquet");

		Adolescente vela = new Adolescente();
		vela.setNombre("Vela");
		vela.setApellido("V");
		vela.setDeporte("basquet");

		Adolescente carlos = new Adolescente();
		carlos.setNombre("Carlos");
		carlos.setApellido("C");
		carlos.setDeporte("basquet");

		Adolescente sofia = new Adolescente();
		sofia.setNombre("Sofía");
		sofia.setApellido("S");
		sofia.setDeporte("basquet");

		Adolescente pedro = new Adolescente();
		pedro.setNombre("Pedro");
		pedro.setApellido("P");
		pedro.setDeporte("voley");

		Adulto cristian = new Adulto();
		cristian.setNombre("Cristian");
		cristian.setApellido("L");
		cristian.setCodigoSeguroSocial("123");
		cristian.setEmpresaDeTrabajo("AE");

		Adulto cris = new Adulto();
		cris.setNombre("Cris");
		cris.setApellido("Pa");
		cris.setCodigoSeguroSocial("345");
		cris.setEmpresaDeTrabajo("PRO");

		Adulto cristina = new Adulto();
		cristina.setNombre("Cristina");
		cristina.setApellido("Lo");
		cristina.setCodigoSeguroSocial("678");
		cristina.setEmpresaDeTrabajo("EA");

		Adulto camila = new Adulto();
		camila.setNombre("Camila");
		camila.setApellido("La");
		camila.setCodigoSeguroSocial("111");
		camila.setEmpresaDeTrabajo("AE");

		Adulto con = new Adulto();
		con.setNombre("Con");
		con.setApellido("Las");
		con.setCodigoSeguroSocial("472");
		con.setEmpresaDeTrabajo("NES");

		Adulto lia = new Adulto();
		lia.setNombre("Lia");
		lia.setApellido("So");
		lia.setCodigoSeguroSocial("283");
		lia.setEmpresaDeTrabajo("OA");

		Adulto soa = new Adulto();
		soa.setNombre("Soa");
		soa.setApellido("Sia");
		soa.setCodigoSeguroSocial("987");
		soa.setEmpresaDeTrabajo("EA");

		Adulto valeria = new Adulto();
		valeria.setNombre("Valeria");
		valeria.setApellido("Ra");
		valeria.setCodigoSeguroSocial("456");
		valeria.setEmpresaDeTrabajo("AE");

		Adulto ina = new Adulto();
		ina.setNombre("Ina");
		ina.setApellido("Lopez");
		ina.setCodigoSeguroSocial("753");
		ina.setEmpresaDeTrabajo("ES");

		Adulto sara = new Adulto();
		sara.setNombre("Sara");
		sara.setApellido("Sarael");
		sara.setCodigoSeguroSocial("123");
		sara.setEmpresaDeTrabajo("IA");
		
		Scanner teclado = new Scanner(System.in);

		int numN;
		int numO;
		numN = teclado.nextInt();
		numO = teclado.nextInt();
		Pasajero[][] asiento = new Pasajero[numN][numO];
		numN = teclado.nextInt();
		numO = teclado.nextInt();
		for (int fila = 0; fila < numN; fila++) {
			for (int columna = 0; columna < numO; columna++) {
				System.out.println("Pasillo : " + fila + " ventana: " + columna);
			}
		}
		System.out.println();
	}
}
