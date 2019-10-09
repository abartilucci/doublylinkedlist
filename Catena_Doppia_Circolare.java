package progetto;

public class Catena_Doppia_Circolare {

	private Nodo head;
	private int elementi;

	public Catena_Doppia_Circolare() {
		emptify();
	}

	// rende vuota la catena
	public void emptify() {
		head = new Nodo<T>();
	}

	public boolean is_empty() {
		return head == head.getSuccessivo();
	}

	public Nodo<T> getFirst() {
		if (is_empty()) {
			System.out.println("Catena vuota");
			return null;
		} else
			return head.getNext().getElement();
	}

	public int elementiPresenti() {
		return elementi;
	}

}
