package ejercicio.de.ordenamiento.de.objetos;

import java.util.Arrays;

public class MainNomina {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Empleado darly = new Empleado();
		darly.setNombre("Darly");
		darly.setApellido("Castillo");
		darly.setEdad(21);
		darly.setSalario(410.75);
		
		Empleado leo = new Empleado();
		leo.setNombre("Leonardo");
		leo.setApellido("Altamirano");
		leo.setEdad(35);
		leo.setSalario(600.00);
		
		Empleado katia = new Empleado();
		katia.setNombre("Katia");
		katia.setApellido("Palacios");
		katia.setEdad(30);
		katia.setSalario(522.33);
		
		Empleado ashley = new Empleado();
		ashley.setNombre("Ashley");
		ashley.setApellido("Hernández");
		ashley.setEdad(25);
		ashley.setSalario(450.16);
		
		Empleado camilo = new Empleado();
		camilo.setNombre("Camilo");
		camilo.setApellido("López");
		camilo.setEdad(40);
		camilo.setSalario(671.29);
		
		Empleado lucia = new Empleado();
		lucia.setNombre("Lucía");
		lucia.setApellido("Ramírez");
		lucia.setEdad(27);
		lucia.setSalario(468.87);
		
		Empleado patricia = new Empleado();
		patricia.setNombre("Patricia");
		patricia.setApellido("Velez");
		patricia.setEdad(25);
		patricia.setSalario(451.05);
		
		Empleado luis = new Empleado();
		luis.setNombre("Luis");
		luis.setApellido("Flores");
		luis.setEdad(35);
		luis.setSalario(553.22);
		
		Empleado monica = new Empleado();
		monica.setNombre("Mónica");
		monica.setApellido("Torres");
		monica.setEdad(53);
		monica.setSalario(910.00);
		
		Empleado alex = new Empleado();
		alex.setNombre("Alexander");
		alex.setApellido("Andrade");
		alex.setEdad(20);
		alex.setSalario(421.15);
		
		Empleado reporte[] = new Empleado[10];
		reporte[0] = darly;
		reporte[1] = leo;
		reporte[2] = katia;
		reporte[3] = ashley;
		reporte[4] = camilo;
		reporte[5] = lucia;
		reporte[6] = patricia;
		reporte[7] = luis;
		reporte[8] = monica;
		reporte[9] = alex;
		
		System.out.println("--------Empleados antes de ordenar");
		System.out.println(Arrays.toString(reporte));
		
		System.out.println();
		
		Arrays.sort(reporte);
		System.out.println("********Empleados ordenados según su salario");
		System.out.println(Arrays.toString(reporte));

	}

}
