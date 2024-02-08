package src;

public class Cubilete {

	private Dado[]  dados; 

	public Cubilete(int cantidadDados) {
		dados = new Dado[cantidadDados]; //Creo un arreglo
		//de "cantidadDados" es el tama�o
		//dados.length == cantidadDados
		for(int i=0; i< dados.length; i++) {
			dados[i] = new Dado(6);
		}
	}
	
	public Cubilete(int cantidadDados, int cantCaras) {
		dados = new Dado[cantidadDados]; //Creo un arreglo
		//de "cantidadDados" es el tama�o
		//dados.length == cantidadDados
		for(int i=0; i< dados.length; i++) {
			dados[i] = new Dado(cantCaras);
		}
	}
	// TOmar entre comillas
	public Cubilete(Dado[] dadosAfuera) {
		dados = dadosAfuera;
		
	}
	
	
	public Dado getDadoEn(int pos) {
		if ((pos>=0)&& (pos<dados.length)) {
			return dados[pos];
		} else {
			return null;
		}
	}
	
	public void setDadoEn(int pos, Dado nuevo) {
		if ((pos>=0)&& (pos<dados.length)&& nuevo!=null) {
			dados[pos]=nuevo;
		}
	}
	
	public int tirar() {
	
		int suma = 0;
		
		for(int i=0; i<dados.length;i++) {
			
			suma = suma + dados[i].tirar();
		}
		
		return suma;
		
	}
	
	
}
