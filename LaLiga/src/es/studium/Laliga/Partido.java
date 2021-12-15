package es.studium.Laliga;

import java.util.Random;

public class Partido extends Thread {
	Equipo local;
	Equipo visitante;
	int golesLocal;
	int golesVisitante;
	
	
	public Partido(Equipo local,Equipo visitante)
	{
		super();
		this.local=local;
		this.visitante=visitante;
		this.golesLocal=0;
		this.golesVisitante=0;
	}
	
	@Override
	public void run() {
		int partidosJugados=0;
		partidosJugados=partidosJugados+1;
		local.setPartidosJugados(partidosJugados);
		visitante.setPartidosJugados(partidosJugados);
		Random r=new Random();
		golesLocal = r.nextInt(5)+ Math.round(10/local.getPosicion());
		golesVisitante = r.nextInt(5)+ Math.round(10/visitante.getPosicion());
		setGolesLocal(golesLocal);
		setGolesVisitante(golesVisitante);
		local.setGolesAFavor(golesLocal);
		local.setGolesEnContra(golesVisitante);
		visitante.setGolesAFavor(golesVisitante);
		visitante.setGolesEnContra(golesLocal);
			
		
		if (golesLocal==golesVisitante) 
		{
		local.setPuntosActuales(local.getPuntosActuales()+1);
		visitante.setPuntosActuales(visitante.getPuntosActuales()+1);
		local.setPartidosEmpatados(local.getPartidosEmpatados()+1);
		visitante.setPartidosEmpatados(visitante.getPartidosEmpatados()+1);
		}
		else if (golesLocal > golesVisitante) 
		{
			local.setPuntosActuales(local.getPuntosActuales()+3);
			local.setPartidosGanados(local.getPartidosGanados()+1);
			visitante.setPartidosPerdidos(visitante.getPartidosPerdidos()+1);	
		}
		else if (golesVisitante > golesLocal) 
		{
			visitante.setPuntosActuales(visitante.getPuntosActuales()+3);
			local.setPartidosPerdidos(local.getPartidosPerdidos()+1);
			visitante.setPartidosGanados(visitante.getPartidosGanados()+1);
		}
		
		
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public Equipo getLocal() {
		return local;
	}
	public void setLocal(Equipo local) {
		this.local = local;
	}
	public Equipo getVisitante() {
		return visitante;
	}
	public void setVisitante(Equipo visitante) {
		this.visitante = visitante;
	}
	public int getGolesLocal() {
		return golesLocal;
	}

	public void setGolesLocal(int golesLocal) {
		this.golesLocal = golesLocal;
	}

	public int getGolesVisitante() {
		return golesVisitante;
	}

	public void setGolesVisitante(int golesVisitante) {
		this.golesVisitante = golesVisitante;
	}
	
	

}
	
	

