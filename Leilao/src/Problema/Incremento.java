package Problema;
public class Incremento {

	private int valor;

	public Incremento(int valor) {
		super();
		this.valor = valor;
	}

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}

	public void dobrar() {
		this.valor = this.valor * 2;
	}
}
