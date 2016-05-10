package Problema;
public class SistemaLeilao {

	public static void main(String[] args) {
		Leilao leilao = new Leilao(1000);
		Incremento incremento = new Incremento(100);
		Thread t1 = new Thread(new LanceNormal(incremento, leilao));
		Thread t2 = new Thread(new LanceIncremento(incremento, leilao));
		t1.start();
		t2.start();
	}
}
