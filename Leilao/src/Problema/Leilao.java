package Problema;
public class Leilao {

	private int valorCorrente = 0;

	public Leilao(int valorCorrente) {
		super();
		this.valorCorrente = valorCorrente;
	}

	public int getValorCorrente() {
		return valorCorrente;
	}

	public void setValorCorrente(int valorCorrente) {
		this.valorCorrente = valorCorrente;
	}

	public void darLance(int valor) {
		this.valorCorrente = +valor;
	}
}
