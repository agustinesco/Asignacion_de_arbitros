package interfaz;

import estructuraDeDatos.Equipo;
import estructuraDeDatos.Torneo;
import metodos.AsignarArbitros;
import metodos.Jsons;

public class Principal {
	

	
	static Torneo devolverTorneo() {
		Torneo t = Jsons.leerTorneoDeJson("tp3_progra3\\src\\archivos\\prueba");
		AsignarArbitros.asignarArbitros(t);
		System.out.println(t);
		return t;
	}

	public static void main(String[] args) {
		/*Equipo[] equipos = new Equipo[10];
		Equipo a = new Equipo("Boca", 5);
		Equipo b = new Equipo("river", 5);
		Equipo c = new Equipo("independiente", 5);
		Equipo d = new Equipo("San Lorenzo", 5);
		Equipo e = new Equipo("Racing", 5);
		Equipo f = new Equipo("Sacachispas", 5);
		Equipo g =new Equipo("Sacachispa", 5);
		Equipo h =new Equipo("Sacachisp", 5);
		Equipo i =new Equipo("Sacachis", 5);
		Equipo j =new Equipo("Sacachi", 5);
		
		equipos[0] = a;
		equipos[1] = b;
		equipos[2] = c;
		equipos[3] = d;
		equipos[4] = e;
		equipos[5] = f;
		equipos[6] = g;
		equipos[7] = h;
		equipos[8] = i;
		equipos[9] = j;
		
		Torneo t = new Torneo(equipos);
		Jsons.generarJSON("tp3_progra3\\src\\archivos\\prueba", t);
	*/
	}

}
