package progetto;

import algoritmi.Node;

public class Nodo<T> {
	
	private int chiave; // tra 1 a 10^6
	private T info; // generico
	private Nodo successivo;
	private Nodo precedente; 
	
	public Nodo() {
		chiave = 0;
		info = null;
	}

	public Nodo(int x, T data) {
		chiave = x;
		info = data;
	}

	public int getChiave() {
		return chiave;
	}

	public void setChiave(int chiave) {
		if (chiave >= 1 && chiave <= 1000000)
			this.chiave = chiave;
		else
			System.out.println("il valore della chiave inserita deve essere compreso tra 1 e 10^");
	}

	public T getInfo() {
		return info;
	}

	public void setInfo(T info) {
		this.info = info;
	}

	public Nodo getSuccessivo() {
		return successivo;
	}

	public void setSuccessivo(Nodo successivo) {
		this.successivo = successivo;
	}

	public Nodo getPrecedente() {
		return precedente;
	}

	public void setPrecedente(Nodo precedente) {
		this.precedente = precedente;
	}

}
