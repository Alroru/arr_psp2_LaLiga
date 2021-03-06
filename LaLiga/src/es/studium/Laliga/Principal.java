package es.studium.Laliga;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Random;





public class Principal {
	Equipo equipo;
	Partido partido;

	Random r;
	public static void main(String[] args) throws IOException, InterruptedException {

		//Leemos el fichero de los nombres de los equipos.(Primer requisito)
		File fl=new File("clasificacion.txt");
		FileReader fr=new FileReader(fl);
		BufferedReader br =new BufferedReader(fr);

		//Array de String para incluir los nombres de los equipos
		String[] listaequipos=br.readLine().split(",");
		br.close();
		//Lista con todos los objetos de la clase equipo

		ArrayList<Equipo> clasificacion=new ArrayList<Equipo>();
		for(int i=0;i<20;i++) {

			Equipo equipo = new Equipo(listaequipos[i],i,i+1);
			clasificacion.add(equipo);
		}

		ArrayList<int[][]> Temporada = new ArrayList<int[][]>();
		int[][] Jornada1 = { { 19, 0 }, { 1, 18 }, { 2, 17 }, { 3, 16 }, { 4, 15 }, { 5, 14 }, { 6, 13 }, { 7, 12 }, { 8, 11 }, { 9, 10 } };
		Temporada.add(Jornada1);
		int[][] Jornada2 = { { 19, 10 }, { 11, 9 }, { 12, 8 }, { 13, 7 }, { 14, 6 }, { 15, 5 }, { 16, 4 }, { 17, 3 }, { 18, 2 }, { 0, 1 } };
		Temporada.add(Jornada2);
		int[][] Jornada3 = { { 19, 1 }, { 2, 0 }, { 3, 18 }, { 4, 17 }, { 5, 16 }, { 6, 15 }, { 7, 14 }, { 8, 13 }, { 9, 12 }, { 10, 11 } };
		Temporada.add(Jornada3);
		int[][] Jornada4 = { { 19, 11 }, { 12, 10 }, { 13, 9 }, { 14, 8 }, { 15, 7 }, { 16, 6 }, { 17, 5 }, { 18, 4 }, { 0, 3 }, { 1, 2 } };
		Temporada.add(Jornada4);
		int[][] Jornada5 = { { 19, 2 }, { 3, 1 }, { 4, 0 }, { 5, 18 }, { 6, 17 }, { 7, 16 }, { 8, 15 }, { 9, 14 }, { 10, 13 }, { 11, 12 } };
		Temporada.add(Jornada5);
		int[][] Jornada6 = { { 19, 12 }, { 13, 11 }, { 14, 10 }, { 15, 9 }, { 16, 8 }, { 17, 7 }, { 18, 6 }, { 0, 5 }, { 1, 4 }, { 2, 3 } };
		Temporada.add(Jornada6);
		int[][] Jornada7 = { { 19, 3 }, { 4, 2 }, { 5, 1 }, { 6, 0 }, { 7, 18 }, { 8, 17 }, { 9, 16 }, { 10, 15 }, { 11, 14 }, { 12, 13 } };
		Temporada.add(Jornada7);
		int[][] Jornada8 = { { 19, 13 }, { 14, 12 }, { 15, 11 }, { 16, 10 }, { 17, 9 }, { 18, 8 }, { 0, 7 }, { 1, 6 }, { 2, 5 }, { 3, 4 } };
		Temporada.add(Jornada8);
		int[][] Jornada9 = { { 19, 4 }, { 5, 3 }, { 6, 2 }, { 7, 1 }, { 8, 0 }, { 9, 18 }, { 10, 17 }, { 11, 16 }, { 12, 15 }, { 13, 14 } };
		Temporada.add(Jornada9);
		int[][] Jornada10 = { { 19, 14 }, { 15, 13 }, { 16, 12 }, { 17, 11 }, { 18, 10 }, { 0, 9 }, { 1, 8 }, { 2, 7 }, { 3, 6 }, { 4, 5 } };
		Temporada.add(Jornada10);
		int[][] Jornada11 = { { 19, 5 }, { 6, 4 }, { 7, 3 }, { 8, 2 }, { 9, 1 }, { 10, 0 }, { 11, 18 }, { 12, 17 }, { 13, 16 }, { 14, 15 } };
		Temporada.add(Jornada11);
		int[][] Jornada12 = { { 19, 15 }, { 16, 14 }, { 17, 13 }, { 18, 12 }, { 0, 11 }, { 1, 10 }, { 2, 9 }, { 3, 8 }, { 4, 7 }, { 5, 6 } };
		Temporada.add(Jornada12);
		int[][] Jornada13 = { { 19, 6 }, { 7, 5 }, { 8, 4 }, { 9, 3 }, { 10, 2 }, { 11, 1 }, { 12, 0 }, { 13, 18 }, { 14, 17 }, { 15, 16 } };
		Temporada.add(Jornada13);
		int[][] Jornada14 = { { 19, 16 }, { 17, 15 }, { 18, 14 }, { 0, 13 }, { 1, 12 }, { 2, 11 }, { 3, 10 }, { 4, 9 }, { 5, 8 }, { 6, 7 } };
		Temporada.add(Jornada14);
		int[][] Jornada15 = { { 19, 7 }, { 8, 6 }, { 9, 5 }, { 10, 4 }, { 11, 3 }, { 12, 2 }, { 13, 1 }, { 14, 0 }, { 15, 18 }, { 16, 17 } };
		Temporada.add(Jornada15);
		int[][] Jornada16 = { { 19, 17 }, { 18, 16 }, { 0, 15 }, { 1, 14 }, { 2, 13 }, { 3, 12 }, { 4, 11 }, { 5, 10 }, { 6, 9 }, { 7, 8 } };
		Temporada.add(Jornada16);
		int[][] Jornada17 = { { 19, 8 }, { 9, 7 }, { 10, 6 }, { 11, 5 }, { 12, 4 }, { 13, 3 }, { 14, 2 }, { 15, 1 }, { 16, 0 }, { 17, 18 } };
		Temporada.add(Jornada17);
		int[][] Jornada18 = { { 19, 18 }, { 0, 17 }, { 1, 16 }, { 2, 15 }, { 3, 14 }, { 4, 13 }, { 5, 12 }, { 6, 11 }, { 7, 10 }, { 8, 9 } };
		Temporada.add(Jornada18);
		int[][] Jornada19 = { { 19, 9 }, { 10, 8 }, { 11, 7 }, { 12, 6 }, { 13, 5 }, { 14, 4 }, { 15, 3 }, { 16, 2 }, { 17, 1 }, { 18, 0 } };
		Temporada.add(Jornada19);
		Collections.shuffle(Temporada);
		ArrayList<int[][]> TemporadaAleatoria = new ArrayList<int[][]>();
		TemporadaAleatoria.addAll(Temporada);
		System.out.println("Calendario de Jornadas");
		for (int q=0;q<Temporada.size();q++)
		{	
			System.out.println("jornada " + (1 + q));
			System.out.println("----------------------");
			for (int j = 0; j < 10; j++) {

				System.out.print(clasificacion.get(TemporadaAleatoria.get(q)[j][0]).getNombre()+"-"+clasificacion.get(TemporadaAleatoria.get(q)[j][1]).getNombre()+"\n");		
			}
		}

		for (int q=0;q<Temporada.size();q++)
		{	
			System.out.println("jornada " + (20 + q));
			System.out.println("----------------------");
			for (int j = 0; j < 10; j++) {

				System.out.print(clasificacion.get(TemporadaAleatoria.get(q)[j][1]).getNombre()+"-"+clasificacion.get(TemporadaAleatoria.get(q)[j][0]).getNombre()+"\n");	
			}
		}
		System.out.println("//////////////////////////////////////////////////////////////");
		System.out.println("Empiezan los Partidos");
		for (int q=0;q<Temporada.size();q++)
		{	
			System.out.println("jornada " + (1 + q));
			System.out.println("----------------------");
			for (int j = 0; j < 10; j++) {
				Partido partido=new Partido(clasificacion.get(TemporadaAleatoria.get(q)[j][0]),(clasificacion.get(TemporadaAleatoria.get(q)[j][1])));
				partido.start();
				partido.join();
				System.out.print(clasificacion.get(TemporadaAleatoria.get(q)[j][0]).getNombre()+"-"+partido.getGolesLocal()+" "+clasificacion.get(TemporadaAleatoria.get(q)[j][1]).getNombre()+"-"+partido.getGolesVisitante()+"\n");


			}
			System.out.println("Clasificacion\n");
			clasificacion.sort((Comparator.comparing(Equipo::getPuntosActuales).reversed()));
			for (Equipo equipo : clasificacion) {

				System.out.println(equipo.getPosicion() 
						+ "-"+equipo.getNombre()
						+"-"+equipo.getPuntosActuales()
						+"-"+equipo.getPartidosJugados()
						+"-"+equipo.getPartidosGanados()
						+"-"+equipo.getPartidosEmpatados()
						+"-"+equipo.getPartidosPerdidos()
						+"-"+equipo.getGolesAFavor()
						+"-"+equipo.getGolesEnContra());
			}
		}

		System.out.println("Partidos de Vuelta");
		for (int q=0;q<Temporada.size();q++)
		{	
			System.out.println("jornada " + (20 + q));
			System.out.println("----------------------");
			for (int j = 0; j < 10; j++) {
				Partido partido=new Partido(new Equipo(clasificacion.get(TemporadaAleatoria.get(q)[j][1]).getNombre(),clasificacion.get(TemporadaAleatoria.get(q)[j][1]).getNumeroEquipo(),clasificacion.get(TemporadaAleatoria.get(q)[j][1]).getPosicion()),new Equipo(clasificacion.get(TemporadaAleatoria.get(q)[j][0]).getNombre(),clasificacion.get(TemporadaAleatoria.get(q)[j][0]).getNumeroEquipo(),clasificacion.get(TemporadaAleatoria.get(q)[j][0]).getPosicion()));
				partido.start();
				partido.join();
				System.out.print(clasificacion.get(TemporadaAleatoria.get(q)[j][1]).getNombre()+"-"+partido.getGolesVisitante()+" "+clasificacion.get(TemporadaAleatoria.get(q)[j][0]).getNombre()+"-"+partido.getGolesLocal()+"\n");


			}
			System.out.println("Clasificacion\n");
			clasificacion.sort((Comparator.comparing(Equipo::getPuntosActuales).reversed()));
			for (Equipo equipo : clasificacion) {

				System.out.println(equipo.getPosicion() 
						+ "-"+equipo.getNombre()
						+"-"+equipo.getPuntosActuales()
						+"-"+equipo.getPartidosJugados()
						+"-"+equipo.getPartidosGanados()
						+"-"+equipo.getPartidosEmpatados()
						+"-"+equipo.getPartidosPerdidos()
						+"-"+equipo.getGolesAFavor()
						+"-"+equipo.getGolesEnContra());
			}
		}
	FileWriter fw = new FileWriter("clasificacion.txt");
	PrintWriter pw = new PrintWriter(fw);
	for (Equipo equipo : clasificacion) 
	{
		pw.print(equipo.getNombre() + ",");
	}
	pw.close();

}
}








